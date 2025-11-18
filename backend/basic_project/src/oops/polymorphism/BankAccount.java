package oops.polymorphism;

public class BankAccount {
	private int pin=1234;
	public void moneyTransfer(long fromPhone, long toPhone , int pin, double amount) {
		if(this.pin==pin) {
			System.out.println("money "+amount+" is transfered from "+fromPhone+" to "+toPhone);
		}
	}
	public void moneyTransfer(long fromPhone, String upiId , int pin, double amount) {
		if(this.pin==pin) {
			System.out.println("money "+amount+" is transfered from "+fromPhone+" to "+upiId);
		}
	}
	public void moneyTransfer(long fromPhone, long accountNumber ,String IFSC, int pin, double amount) {
		if(this.pin==pin) {
			System.out.println("money "+amount+" is transfered from "+fromPhone+" to "+accountNumber+ "accountNumber");
		}
	}
	
	
	
	
	
	private  String name,upiId,IFSC;
	private long accountNumber;
	private long mobile;
	private double amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
