package ex_14072021;

public class BankAccount {
	
	public BankAccount() {
		balance = 0;
	}
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance = balance+amount;
	}
	public void withdraw(double amount) {
		balance = balance-amount;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	private double balance;
}
