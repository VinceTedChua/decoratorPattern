package decoratorPattern;

public class SavingsAccount implements BankAccount
{
    //3 data types implemented
    private Integer accountNumber;
    private String accountName;
    private Double balance;
    @Override
    public String showAccountType()
    {
        return "Default Savings Mode";
    }
    @Override
    public Double getInterestRate()
    {
        return 0.01;
    }
    public void setAccountNumber(Integer accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }
    public void setBalance(Double balance)
    {
        this.balance = balance;
    }
    @Override
    public Double getBalance()
    {
        return balance;
    }
    @Override
    public String showBenefits()
    {
        return "Default Savings Account";
    }
    @Override
    public Double computeBalanceWithInterest()
    {
        return balance * (1 + getInterestRate());
    }
    @Override
    public String showInfo()
    {
        return "Account Number: " + this.accountNumber +  "\nAccount Name: " + this.accountName +
                "\nBalance " + this.balance;
    }
    //setters and getters and calculation were conveyed...
}