# bank-program
Java module assignment

main requirement:

Fields:
1. Account Number
2. Customer Last Name, First Name
3. Beginning Balance
4. End Balance
5. Total Withdrawal
6. Total Deposit

Methods:
1. Constructor: This will initialize account Number, Last Name, First Name
2. Appropriate getter and setter methods
3. addDeposit(amount) method: add deposit to the balance
4. subtractWithdrawal(amount) method: subtract withdrawal from balance
5. addInterest(rate) method: adds interest to the balance, if over 500
6. printStatement() method: display the values of the fields listed above to the console. If the balance is negative, will display a message indicating that account is overdrawn.

The test program will read the data for customers via the scanner class and invoke the needed methods.
We will assume at least four Accounts (4 objects declared in the test program, see next page for example data). In other words, the program should have or ask for 4 sets of Account information to be entered.

The program will also read transactions (deposits or withdrawals) for the month, inputted via the scanner class.
Transactions will use the following codes: 1 for Deposit; -1 for Withdrawal; 0 for end of transaction.

Interest will be added to accounts with an end balance of 500 or more at a interest rate of 20%.
