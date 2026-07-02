# PL/SQL Banking System - Exercise 1

## Objective
Demonstrate the use of PL/SQL control structures such as loops, cursors, conditional processing, and updates.

---

## Scenario 1
Apply a 1% discount to loan interest rates for customers above 60 years old.

### Expected Result

| CustomerID | InterestRate |
|------------|-------------|
| 101 | 9 |
| 102 | 12 |
| 103 | 10 |

---

## Scenario 2
Promote customers to VIP status if their balance exceeds $10,000.

### Expected Result

| CustomerID | IsVIP |
|------------|-------|
| 101 | TRUE |
| 102 | TRUE |
| 103 | FALSE |

---

## Scenario 3
Generate reminder messages for customers whose loans are due within the next 30 days.

### Expected Output

Reminder: Dear John, your Loan ID 5001 is due on ...

Reminder: Dear David, your Loan ID 5003 is due on ...

---

## How to Run

1. Open Oracle FreeSQL / Oracle Live SQL.
2. Create a new worksheet.
3. Copy and execute the SQL script.
4. Verify the outputs using the provided SELECT statements.

---

## Files

- Exercise1_ControlStructures.sql
- screenshots/