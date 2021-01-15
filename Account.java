package day2assignments;

class Account {
	private String memberName;
	private String accountNumber;
	private double accountBalance;
	
	Account(){
	}
    Account(String memberName, double accountBalance) {
		this.memberName = memberName;
		this.accountNumber=  10000 + (int)(Math. random ()*89999) + "";
		this.accountBalance = accountBalance;
	}
    
    public double setAccountBalance(double amount)
	{
		this.accountBalance-=amount;
		System.out.println("Updated balance: "+this.accountBalance);
		return amount;
	}
    
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double amount) {
		this.accountBalance= this.accountBalance+ amount;
	}
	
	public void display()
	{
		System.out.println("Balance: "+this.getAccountBalance());
	}
	
	public void withdraw(double amt) {
	}
	}

