package decoratorPattern;

public interface BankAccountDecorator extends BankAccount
{
    //Implements the Decorator from the BankAccount
    void setBankAccount(BankAccount bankAccount);
    //Sets the Bank Account...
}
