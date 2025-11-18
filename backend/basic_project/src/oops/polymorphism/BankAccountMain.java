package oops.polymorphism;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.moneyTransfer(8765487654l, 32476343l, 1234, 700); //phone to phone

		account.moneyTransfer(834638347l, "bhaskar@upi", 1234, 700);//phone to upiId
		System.out.println(Long.MAX_VALUE+" "+Long.MIN_VALUE);
	}

}
/* -- 100 users
 * create Account
 * Update Account
 * Balance Check
 * MoneyTransfer
 */