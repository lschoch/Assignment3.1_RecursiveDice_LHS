import java.util.Random;
/**
 * A die roller class with roll method that
 * continues rolling until a "2" is rolled.
 * 
 * @author Lawrence Schoch
 * @version 1.0 */
public class RecDieRoller {
	/** rollCount property tracks the number of times this die has been rolled
	 * in the current effort to roll a "2". */
	private int rollCount;
	/** printFlag property can be set to control whether the result of each 
	 * roll is printed. */
	private boolean printFlag;
	
	/** Empty argument constructor. */
	public RecDieRoller() {
		this.rollCount = 0;
		this.printFlag = true;
	}
	
	/** Getter for rollCount property.
	 * @return the rollCount */
	public int getRollCount() {
		return rollCount;
	}// end getRollCount

	/** Setter for rollCount property.
	 * @param rollCount the rollCount to set */
	public void setRollCount(int rollCount) {
		this.rollCount = rollCount;
	}// end setRollCount
	
	/** Getter for printFlag property.
	 * @return the printFlag */
	public boolean isPrintFlag() {
		return printFlag;
	}// end isPrintFlag

	/** Setter for printFlag property.
	 * @param printFlag the printFlag to set */
	public void setPrintFlag(boolean printFlag) {
		this.printFlag = printFlag;
	}// end setPrintFlag
	
	/** Method to roll the die until the result is a "2".
	 * Stores the number of rolls in the rollCount property
	 * of the die. */
	public void roll() {
		Random random = new Random();
		int newRoll = random.nextInt(6) + 1;
		if (printFlag)
			System.out.format("%-18sRolled a \"%1d\"\n", " ", newRoll);
		rollCount++;
		// Check for base case.
		if (newRoll == 2) {
			return;
		} else {
			roll(); // Recursive call.
		}
	}// end roll

}// end class
