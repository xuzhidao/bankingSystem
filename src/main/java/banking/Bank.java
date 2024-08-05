package banking;

import com.sun.deploy.util.StringUtils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Random;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts = new LinkedHashMap<>();

	private static long base_seq_id = new Random().nextLong();
	private long seq_id = base_seq_id + 1;




	public Bank() {
		// complete the function



	}

	public Account getAccount(Long accountNumber) {
		// complete the function

		if (accounts == null || accounts.size() == 0) return null;

		else
			return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		long newAccountNum = this.seq_id + 1;
		this.seq_id ++;

		BankAccount newComsumerAccount = new BankAccount(company, newAccountNum, pin, startingDeposit);

		accounts.put(newAccountNum, newComsumerAccount);

		return newAccountNum;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		// should return the account number , in Long format;


		//super(accountHolder, accountNumber, pin, startingDeposit);

		long newAccountNum = this.seq_id + 1;
		this.seq_id ++;
		BankAccountHolder newAccountHolder = new BankAccountHolder(1);
		BankAccount newComsumerAccount = new BankAccount(newAccountHolder, newAccountNum, pin, startingDeposit);



		accounts.put(newAccountNum, newComsumerAccount);

		return newAccountNum;


	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function

		Account acc = accounts.get(accountNumber);
		if(acc != null)
			return acc.getBalance();
		else return -1;

	}

	public void credit(Long accountNumber, double amount) {
		// complete the function

		double balanceAmount = this.getBalance(accountNumber);
		accounts.get(accountNumber).creditAccount(amount);

	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function

		double balanceAmount = this.getBalance(accountNumber);

		Account acc = (BankAccount) accounts.get(accountNumber);
		if(acc != null)
			acc.debitAccount(amount);

        return balanceAmount >= amount;

	}
}
