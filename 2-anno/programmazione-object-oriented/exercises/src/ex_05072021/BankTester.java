package ex_05072021;

public class BankTester {

	public static void main(String[] args) {
		BankAccount alfonsoSavings = new SavingsAccount(0.5);
		BankAccount idaChecking = new CheckingAccount(100);
		alfonsoSavings.deposit(10000);
		alfonsoSavings.transfer(2000, idaChecking);
		idaChecking.withdraw(1500);
		idaChecking.withdraw(80);
		alfonsoSavings.transfer(1000, idaChecking);
		idaChecking.withdraw(400);
		((SavingsAccount)alfonsoSavings).addInterest();
		((CheckingAccount)idaChecking).deductFees();
		System.out.println("Bilancio di Alfonso: "+alfonsoSavings.getBalance());
		System.out.println("Bilancio di Ida: "+idaChecking.getBalance());
	}

}
