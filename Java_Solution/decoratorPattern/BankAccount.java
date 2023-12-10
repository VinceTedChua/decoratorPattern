package decoratorPattern;

public interface BankAccount
{
 //initializes the Strings, Double to set up the account..
 String showAccountType();
 Double getInterestRate();
 Double getBalance();
 String showBenefits();
 Double computeBalanceWithInterest();
 String showInfo();

}
