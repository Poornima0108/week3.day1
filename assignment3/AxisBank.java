package week3.day1.assignments;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Deposit the money- AxisBank class");
		System.out.println("Deposit method in super class is overriden");
	}
	public static void main(String[] args) {
		AxisBank ax= new AxisBank();
		ax.saving();
		ax.fixed();
		ax.deposit();

	}

}
