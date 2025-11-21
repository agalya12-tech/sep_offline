package bankManagement.repo;

import bankManagement.model.BankAccount;

public interface Bank {
	void createAccount(BankAccount account);
	void depositAmount(long accountNum,double amount ,int pin);
	void withdrawAmount(long accountNum,double amount ,int pin);
	void transferAmount(long fromPhone, long toPhone, double amount, int pin); // phone to phone transfer
	void transferAmount(long fromPhone, String upiId, double amount, int pin); // phone to upi
	void transferAmount(long fromPhone, long accountNumber, String ifscCode, double amount, int pin);// phone to bank																									// account/IFSC
	double checkBalance(long accountNum,int pin);
	void displayAccountDetails(long accountNum);
	boolean updateAccountDetails(BankAccount account);
	boolean deleteAccount(long accountNum);
}
