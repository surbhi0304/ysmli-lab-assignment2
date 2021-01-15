package day2assignments;

class SavingAccount extends Account {
	private int interest;
	private double maxWithdrawlAmount;

	SavingAccount() {

	}

	SavingAccount(String name, double balance) {
		super(name, balance);
		this.interest = 5;
		this.maxWithdrawlAmount = 100000;
		}

	public double getBalance() {
		double newBalance = (((interest / 100) * super.getAccountBalance()) + super.getAccountBalance());
		return newBalance;
	}
	
	public void withdraw(double amount)
	{
		if(amount>this.getAccountBalance() && amount>maxWithdrawlAmount)
		{
			System.out.println("Withdrawal not possible");
		}
		else
		{
			this.setAccountBalance(amount);
		}
	}
	
	public void display()
	{
		System.out.println("Balance: "+this.getAccountBalance());
	}

}
