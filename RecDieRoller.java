import java.util.Random;
public class RecDieRoller {
	private int rollCount;
	private boolean printFlag;
	
	public RecDieRoller() {
		this.rollCount = 0;
		this.printFlag = true;
	}
	
	/**
	 * @return the rollCount
	 */
	public int getRollCount() {
		return rollCount;
	}

	/**
	 * @param rollCount the rollCount to set
	 */
	public void setRollCount(int rollCount) {
		this.rollCount = rollCount;
	}
	
	/**
	 * @return the printFlag
	 */
	public boolean isPrintFlag() {
		return printFlag;
	}

	/**
	 * @param printFlag the printFlag to set
	 */
	public void setPrintFlag(boolean printFlag) {
		this.printFlag = printFlag;
	}

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
			roll();
		}
	}

}
