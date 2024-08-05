package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction {
	private Long accountNumber;
	private Bank bank;
	private int attemptedPin;

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */


	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		this.bank = bank;

		Account trans_Account = this.bank.getAccount(accountNumber);
		if(trans_Account == null)
			throw new Exception ("Exception in Transaction constructor - Invalid accountNumber");
		else
			this.accountNumber = accountNumber;

		if (!trans_Account.validatePin(attemptedPin))
			throw new Exception ("Exception in Transaction constructor - Invalid attempedPin");

	}

	public double getBalance() {
		// complete the function

		BankAccount bankAccount = (BankAccount) bank.getAccount(accountNumber);

		if (bankAccount != null) return bankAccount.getBalance();
		else
			return -1;
	}

	public void credit(double amount) {
		// complete the function

//		Double old_balance = this.getBalance();
//		Double wrapper_amount = Double.valueOf(amount);
		bank.credit(this.accountNumber, amount);

	}

	public boolean debit(double amount) {
		// complete the function

//		double balance_amount = this.bank.getBalance(this.accountNumber);

		return this.bank.debit(this.accountNumber, amount);


	}
}
