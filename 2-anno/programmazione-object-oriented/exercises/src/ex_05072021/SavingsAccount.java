package ex_05072021;

public class SavingsAccount extends BankAccount {
	public SavingsAccount(double rate) {
		this.interestRate = rate;
	}
	public void addInterest() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}
	private double interestRate;
}
