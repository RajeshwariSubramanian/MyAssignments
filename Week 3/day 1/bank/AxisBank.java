package bank;

public class AxisBank extends BankInfo {
	public void	deposit()
	{
		System.out.println("Deposit in Account:12000");
	}
	

	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();

	}

}
