package day2assignments;

class CurrentAccount extends Account {
	private String tradeLicenseNumber;

	CurrentAccount() {

	}

	CurrentAccount(String name, double balance) {
		super(name, balance);

	}
	
	public double getBalance()
	{
		double bal=super.getAccountBalance();
		return bal;
	}
	
	
	public void withdraw(double amount)
	{
		if(amount>this.getAccountBalance())
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
		double bal=this.getAccountBalance();
		System.out.println("Balance: "+bal);
	}

}
