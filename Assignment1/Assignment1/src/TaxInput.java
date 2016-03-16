import java.util.Scanner;
public class TaxInput {

	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.println("***Stage 1 Income Tax Calculator***");
	System.out.print("Enter your name: ");
	String name = console.nextLine();
	System.out.print("Enter the financial year: ");
	String Year = console.nextLine();
	System.out.print("Enter your tax file number: ");
	String TFN = console.nextLine();
	System.out.print("Enter assesable income for period " + Year+": ");
	double asIncome = console.nextDouble();
	System.out.print("Enter bank interest for period " + Year +": ");
	double bInterest = console.nextDouble();
	System.out.print("Enter capital gains for period " + Year +": ");
	double cGain = console.nextDouble();
	System.out.print("Enter claimable deduction(s) for period " + Year +":");
	double deduct = console.nextDouble();
	double totIncome = asIncome + bInterest + cGain;
	double taxIncome = totIncome - deduct;
	double taxPay = taxIncome * .10;
	System.out.printf("%30s %n", "***Final tax statement***");
	System.out.println("");
	System.out.printf("%-30s %s %n", "User name:" , name);
	System.out.printf("%-30s %s %n", "Financial year:", Year);
	System.out.printf("%-30s %s %n", "Tax file number:", TFN);
	System.out.println("");
	System.out.printf("%-30s $    %.2f %n", "Assesable income:", totIncome);
	System.out.printf("%-30s $    %.2f %n", "Minus deductions:",  -deduct);
	System.out.printf("%-30s $    %.2f %n", "Taxable income:", taxIncome);
	System.out.printf("%-30s $    %.2f %n", "Tax payable:", taxPay);
	console.close();
	}

}
