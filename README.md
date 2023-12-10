# Decorator Pattern Definition(s)

Decorator Pattern is a structural pattern that wraps another interface within the pattern. Specifically nothing is changed except the concrete classes were wrapped and extended.


# Decorator Pattern Problem Statement:

CIMB is a digital bank that offers GSave and UpSave savings accounts.   As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%.
The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%.
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.
Benefits include the "Standard Savings Account" plus "with Insurance".

# Method(s) implemented

showAccountType() - Either returns "Savings Account", "GSave" or "UpSave"

getInterestRate() - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave

getBalance() - Returns the balance of the account set.

showBenefits() - Either returns "Standard Savings Account" for Savings Account;

benefits offered by savings account + "GSave Transfer"; benefits offered by savings account + "With Insurance";

computeBalanceWithInterest() - returns new balance by computing the balance plus the interest depending on the interest rate.

showInfo() - Returns details of account number, account name, and balance.

# UML CLASS DIAGRAM

![UML_DIAGRAM_DECORATOR](https://github.com/VinceTedChua/decoratorPattern/assets/142372312/b57840d6-914e-4169-b339-9e664ea94c2b)

# Java Execution of The Decorator Pattern:

![DECORATOR_OUTPUT](https://github.com/VinceTedChua/decoratorPattern/assets/142372312/5668027d-1432-4d63-a178-4068074d1ad0)

# Kindly check the Java_Solution/decoratorPattern <- For the Code Solution
