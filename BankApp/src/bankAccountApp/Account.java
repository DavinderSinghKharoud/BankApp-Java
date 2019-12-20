package bankAccountApp;

import java.util.Random;

public abstract class Account implements IRate {
	
	//List common properties
	private String name;
	private String SIN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	public Account(String name, String SIN, double initDeposit) {
		this.name=name;
		this.SIN=SIN;
		balance = initDeposit;
		
		//Set Account Number
		index++;
		this.accountNumber = setAccountNumber();
		
	    setRate();
		
	}
	
	public abstract void setRate();
	
	//List Common Methods
	
	/**
	 * Generating random number
	 * @return
	 */
	private String setAccountNumber() {
		String lastTwoOfSIN = SIN.substring(SIN.length()-2, SIN.length());
		int uniqueID = index;
		
		Random random = new Random();
		int randomNumber = random.nextInt(900) + 100;
		
		return lastTwoOfSIN + uniqueID + randomNumber;
	}

	public void showInfo() {
		System.out.println("Name: " + name +
				"\nAccount Number: " + accountNumber +
				"\nBalance: " + balance +
				"\nRate: " + rate + "%");
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $"+ amount);
		printBalance();
	}
	
    public void withdraw(double amount) {
    	balance = balance - amount;
		System.out.println("Withdrawing $"+ amount);
		printBalance();
    }
    
    public void tranfer(String toWhere, double amount) {
    	balance = balance - amount;
		System.out.println("Tranfering $"+ amount +"to" + toWhere);
		printBalance();
    	
    }
    
    public void compound() {
    	double accruedInterest = balance * (rate/100);
    	balance = balance + accruedInterest;
    	System.out.println("Accrued Interest: $" + accruedInterest);
    	printBalance();
    }
    
    public void printBalance() {
    	System.out.println("Your balance is now: $"+balance);
    }
}
