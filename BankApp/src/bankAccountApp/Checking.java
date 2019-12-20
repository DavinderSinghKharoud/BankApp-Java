package bankAccountApp;

public class Checking extends Account{
	
	
	//List properties specific to a checking account
	private long debitCardNumber;
	private int debitCardPin;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String SIN, double initDeposit) {
		super(name, SIN, initDeposit);
		accountNumber = "2" + accountNumber;

		setDebitCard();
		
	}
	
	private void setDebitCard() {
		double random12Digits;
		do {

		     random12Digits = (double) (Math.random() * Math.pow(10, 12));

		} while (random12Digits <= 100000000000.00);

		String strdebitCardNumber = String.format("%.0f",random12Digits);
		
		debitCardNumber = Long.parseLong(strdebitCardNumber);
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}
	
	
	@Override
	public void showInfo() {
		
		super.showInfo();
		System.out.println("Your Checking Account Features: "
				+ "\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card Pin: " + debitCardPin);
		System.out.println("*************************");
		
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
		
	}
	
	// List any methods

}
