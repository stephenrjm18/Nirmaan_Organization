package assessment2;

public class AccountDetails {
	private int accNum;
	private String holderName;
	private double balance;
	private final int pin=3425;
	public int getPin() {
		return pin;
	}
	@Override
	public String toString() {
		return "AccountDetails [accNum=" + accNum + ", holderName=" + holderName + ", balance=" + balance + "]";
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
