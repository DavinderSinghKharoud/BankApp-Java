package bankAccountApp;

public class Savings extends Account{
	//List properties specific to a savings account
	int safetyDepositBoxID;
	int safetyDepositKey;
	
		// Constructor to initialize checking account properties
		public Savings(String name, String SIN, double initDeposit) {
			super(name, SIN, initDeposit);
			accountNumber = "1" + accountNumber;

			setSafetyDepositBox();
			
		}
		
		private void setSafetyDepositBox() {
			safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
			safetyDepositKey = (int) (Math.random() * Math.pow(10, 4));
		}
		
		// List any methods
		
		@Override
		public void showInfo() {
			// TODO Auto-generated method stub
			super.showInfo();
			System.out.println(" Your Savings Account Features: "
					+ "\n Safety Deposit Box ID: " + safetyDepositBoxID +
					"\n Safety Deposit Box Key: " + safetyDepositKey);
			System.out.println("*************************");
			
		}

		@Override
		public void setRate() {
			rate = getBaseRate() - .25;
		}
		
		
}
