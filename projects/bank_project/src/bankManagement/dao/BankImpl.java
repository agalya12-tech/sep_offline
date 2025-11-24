package bankManagement.dao;

import bankManagement.model.BankAccount;
import bankManagement.repo.Bank;

public class BankImpl implements Bank {

	@Override
	public void createAccount(BankAccount account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositAmount(long accountNum, double amount, int pin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawAmount(long accountNum, double amount, int pin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferAmount(long fromPhone, long toPhone, double amount, int pin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferAmount(long fromPhone, String upiId, double amount, int pin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void transferAmount(long fromPhone, long accountNumber, String ifscCode, double amount, int pin) {
		// TODO Auto-generated method stub

	}

	@Override
	public double checkBalance(long accountNum, int pin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayAccountDetails(long accountNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean updateAccountDetails(BankAccount account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(long accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

}
