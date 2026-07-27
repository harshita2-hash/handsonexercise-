# Exercise 3: Stored Procedures (PL/SQL)

## Objective

To implement PL/SQL stored procedures for common banking operations such as processing monthly interest, updating employee bonuses, and transferring funds between customer accounts.

## Requirements

* Oracle Database
* SQL*Plus or Oracle SQL Developer
* `SET SERVEROUTPUT ON` enabled

## Database Tables

The following tables are used:

### Accounts

* AccountID
* AccountType
* Balance

### Employees

* EmployeeID
* Department
* Salary

## Scenarios Implemented

### Scenario 1: ProcessMonthlyInterest

**Procedure Name:** `ProcessMonthlyInterest`

**Description:**
Calculates and updates the balance of all savings accounts by applying a monthly interest rate of 1%.

**Expected Output:**

```
Monthly interest applied successfully.
PL/SQL procedure successfully completed.
```

---

### Scenario 2: UpdateEmployeeBonus

**Procedure Name:** `UpdateEmployeeBonus`

**Parameters:**

* Department
* Bonus Percentage

**Description:**
Updates the salary of all employees in the specified department by adding the given bonus percentage.

**Expected Output:**

```
Employee bonus updated successfully.
PL/SQL procedure successfully completed.
```

---

### Scenario 3: TransferFunds

**Procedure Name:** `TransferFunds`

**Parameters:**

* Source Account ID
* Destination Account ID
* Transfer Amount

**Description:**
Transfers the specified amount from one account to another after checking that the source account has sufficient balance.

**Expected Output (Success):**

```
Fund transfer successful.
PL/SQL procedure successfully completed.
```

**Expected Output (Insufficient Balance):**

```
Insufficient balance.
PL/SQL procedure successfully completed.
```

**Expected Output (Invalid Account):**

```
Account not found.
PL/SQL procedure successfully completed.
```

## Conclusion

The stored procedures automate common banking operations while demonstrating the use of PL/SQL features such as procedures, parameters, conditional statements, exception handling, SQL statements, and transaction control (`COMMIT` and `ROLLBACK`).
