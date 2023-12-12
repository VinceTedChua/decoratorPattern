package decoratorPattern;

public class GSave implements BankAccountDecorator
{
    //Stores a private variable name of the Bank
    private BankAccount bankAccount;

    //Calls the Private Variable to the parameter...
    public GSave(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }
    @Override
    //Calculates the Balance within the Interest
    public Double getBalance()
    {
        return bankAccount.getBalance();
    }
    @Override
    //Interest 2.5% = 0.025
    public Double getInterestRate()
    {
        return 0.025;
    }

    @Override
    public Double computeBalanceWithInterest()
    {
        return bankAccount.getBalance() * (1 + getInterestRate());
    }
    @Override
    public String showBenefits()
    {
        //Shows an option return statement...
        return bankAccount.showBenefits() + ", Gcash Transfer Mode-";
    }
    @Override
    public String showInfo()
    {
        return bankAccount.showInfo();
    }
    @Override
    //Displays the G-Cash -Go - Save when Chose (GSAVE)
    public String showAccountType()
    {
        return "G-Cash Go-Save ";
    }
    @Override
    public void setBankAccount(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }

    //Summary: Initialized the Private Variable
    //Shows the Bank's data of the person
    //Shows the getters and setters.
}