import java.text.DecimalFormat;

public class RecDieRollerDriver {

	public static void main(String[] args) {
		RecDieRoller recRoller = new RecDieRoller();
		DecimalFormat df=new DecimalFormat("#.00");
		int totalRollCount = 0;
		
		System.out.println("\n       ATTEMPTS TO ROLL A \"2\" ");
		System.out.println("      ------------------------");
		for (int i=1; i<=4; i++) {
			System.out.println("\n      Attempt #" + i + ":");
			recRoller.setRollCount(0);
			recRoller.roll();
		}
		
		recRoller.setPrintFlag(false);
		for (int i=1; i<=1000; i++) {
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
	}

}
