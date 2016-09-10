package retirementPlan;
import java.util.Scanner;

public class RetirementPlan {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	double dRequiredIncome, dMonthlySSI, dAnualReturnAfterWork, dAnualReturnBeforeWork;
	int iYearRetire, iYearToWork;
	System.out.println("Your Income: ");
	dRequiredIncome = scan.nextDouble();
	System.out.println("Monthly SSI: ");
	dMonthlySSI = scan.nextDouble();
	System.out.println("Anual return after work: ");
	dAnualReturnAfterWork = scan.nextDouble();
	while (dAnualReturnAfterWork < 0 || dAnualReturnAfterWork > 2){
		System.out.println("Please enter number in the range of 0 and 2");
		dAnualReturnAfterWork = scan.nextDouble();
	}
	System.out.println("Number of Year to Retire: ");
	iYearRetire = scan.nextInt();
	System.out.println("Anual return before work: ");
	dAnualReturnBeforeWork = scan.nextDouble();
	while (dAnualReturnBeforeWork < 0 || dAnualReturnBeforeWork > 20){
		System.out.println("Please enter number in the range of 0 and 20");
		dAnualReturnBeforeWork = scan.nextDouble();
	}
	System.out.println("Number of year that you have to work: ");
	iYearToWork = scan.nextInt();
	
	double dYouNeedSave = (dRequiredIncome - dMonthlySSI) * (1.0 - (1.0 / Math.pow(1.0 + (dAnualReturnAfterWork / 1200.0), iYearRetire * 12.0))) / (dAnualReturnAfterWork / 1200.0);
	double dSaveEachMonth = ((dAnualReturnBeforeWork / 1200.0) * dYouNeedSave) / (-1 + Math.pow((1 + (dAnualReturnBeforeWork / 1200.0)), (iYearToWork * 12.0)));
	
	System.out.println("You Need Save: $" + dYouNeedSave);
	System.out.println("Save Each Month: $" + dSaveEachMonth);
	
	}

	private static void While(boolean b) {
	
		
	}
}