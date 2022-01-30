import java.text.DecimalFormat;
/**
 * A driver class that rolls a "2" four times and displays the results.
 * Then it rolls "2" 1000 times and reports the average number of rolls 
 * required.
 * 
 * @author Lawrence Schoch
 * @version 1.0 */
public class RecDieRollerDriver {
	/** Main class */
	public static void main(String[] args) {
		RecDieRoller recRoller = new RecDieRoller();
		DecimalFormat df=new DecimalFormat("#.00");
		int totalRollCount = 0;
		
		System.out.println("\n       ATTEMPTS TO ROLL A \"2\" ");
		System.out.println("      ------------------------");
		for (int i=1; i<=4; i++) {
			System.out.println("\n      Attempt #" + i + ":");
			// Reset rollCount property for each new attempt to roll a "2".
			recRoller.setRollCount(0); 
			recRoller.roll();
		}
		
		// Set printFlag to false during the 1000 attempts to roll a "2".
		recRoller.setPrintFlag(false);
		for (int i=1; i<=1000; i++) {
			// Reset rollCount property for each new attempt to roll a "2".
			recRoller.setRollCount(0);
			recRoller.roll();
			totalRollCount+= recRoller.getRollCount();
		}
		double averageNumberRolls = (double)totalRollCount/1000;
		String anr = df.format(averageNumberRolls);
		System.out.println("\n\n ***********************************************"
				+ "*************************");
		System.out.println("\n  After 1000 attempts, the average number of "
				+ "rolls to get a \"2\" was " + anr);
		System.out.println("\n ***********************************************"
				+ "*************************");
	}// end main

}// end class
