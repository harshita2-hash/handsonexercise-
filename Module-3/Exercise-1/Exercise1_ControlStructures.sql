/*Exercise 1 : Control Structures
  Banking Management System*/

/*STEP 1 : CREATE TABLES*/

CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    FOREIGN KEY (CustomerID)
        REFERENCES Customers(CustomerID)
);

/*STEP 2 : INSERT SAMPLE DATA*/

INSERT INTO Customers
VALUES (101, 'John', 65, 12000, 'FALSE');

INSERT INTO Customers
VALUES (102, 'Mary', 45, 15000, 'FALSE');

INSERT INTO Customers
VALUES (103, 'David', 70, 8000, 'FALSE');


INSERT INTO Loans
VALUES (5001, 101, 10, SYSDATE + 15);

INSERT INTO Loans
VALUES (5002, 102, 12, SYSDATE + 40);

INSERT INTO Loans
VALUES (5003, 103, 11, SYSDATE + 20);

COMMIT;


/*CHECK INITIAL DATA*/

SELECT * FROM Customers;

SELECT * FROM Loans;


/*SCENARIO 1

  Apply a 1% discount to loan interest rates
  for customers above 60 years old.
*/

BEGIN
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE CustomerID IN
    (
        SELECT CustomerID
        FROM Customers
        WHERE Age > 60
    );

    COMMIT;
END;
/

/* Verification */

SELECT CustomerID,
       InterestRate
FROM Loans
ORDER BY CustomerID;


/*SCENARIO 2

  Promote customers to VIP status
  if Balance > 10000
  */

DECLARE
    CURSOR vip_cur IS
        SELECT CustomerID
        FROM Customers
        WHERE Balance > 10000;
BEGIN

    FOR vip_rec IN vip_cur LOOP

        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = vip_rec.CustomerID;

    END LOOP;

    COMMIT;

END;
/

/* Verification */

SELECT CustomerID,
       Name,
       Balance,
       IsVIP
FROM Customers
ORDER BY CustomerID;


/*SCENARIO 3

  Send reminders for loans due
  within the next 30 days
*/

DECLARE

    CURSOR loan_cur IS
        SELECT l.LoanID,
               c.Name,
               l.DueDate
        FROM Loans l
        JOIN Customers c
        ON l.CustomerID = c.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE
                            AND SYSDATE + 30;

BEGIN

    FOR loan_rec IN loan_cur LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear '
            || loan_rec.Name
            || ', your Loan ID '
            || loan_rec.LoanID
            || ' is due on '
            || TO_CHAR(
                loan_rec.DueDate,
                'DD-MON-YYYY'
            )
        );

    END LOOP;

END;
/

/*FINAL DATA CHECK*/

SELECT * FROM Customers;

SELECT * FROM Loans;