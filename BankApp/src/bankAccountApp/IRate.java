package bankAccountApp;

public interface IRate {
	
	//Method that returns base rate
	default double getBaseRate() {
		return 2.5;
	}

}
