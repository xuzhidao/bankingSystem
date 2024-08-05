package banking;

public class BankAccount extends Account{

    // extends Account class for initiation

    public BankAccount() {

    }

    public BankAccount(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
        super(accountHolder, accountNumber, pin, startingDeposit);
    }

    public BankAccount (Company company, Long accountNumber, int pin, double startingDeposit){

        super(company, accountNumber, pin, startingDeposit);

    }


}
