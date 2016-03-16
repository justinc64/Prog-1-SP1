import java.util.Scanner;

public class Stage3TaxCalculator
{

   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      System.out.println("*** Stage 3 Income Tax Calculator ***");
      System.out.print("Enter your name: ");
      String name = console.nextLine();
      System.out.print("Enter the financial year: ");
      String Year = console.nextLine();
      System.out.print("Enter your tax file number: ");
      String TFN = console.nextLine();
      // Start the stage 3 enter process Place this code within a do-while loop
      System.out.println("--------");
      System.out.println("*** Taxation Data Entry System ***");
      System.out.println("A - Add assessable income");
      System.out.println("B - Add interest accrued from a bank account");
      System.out.println("C - Add capital gain from a asset sale");
      System.out.println("D - Add claimable deduction");
      System.out.println("X - Exit and compile final taxation statement");
      System.out.println("");
      System.out.print("Enter your selection: ");
      char selection = console.next().charAt(0);
      System.out.println("The char is " + selection);
      double asIncome;
      if (selection == 'A');
      {
         System.out.print("Enter assessable income for period " + Year + ": ");
         asIncome = console.nextDouble();
      }
      System.out.print("Enter bank interest for period " + Year + ": ");
      double bInterest = console.nextDouble();
      System.out.print("Enter capital gains for period " + Year + ": ");
      double cGain = console.nextDouble();
      System.out
               .print("Enter claimable deduction(s) for period " + Year + ": ");
      double deduct = console.nextDouble();
      System.out.println("Taxation data entry complete.");
      System.out.println("--------");
      System.out.print("Enter your tax agents name: ");
      console.nextLine();
      String tAgent = console.nextLine();
      double totIncome = asIncome + bInterest + cGain;
      double taxIncome = totIncome - deduct;
      // Start here using if statements to work out tax brackets
      double taxPay = 0;
      double medLevy = 0;
      if (taxIncome <= 18200)
      {
         taxPay = 0;
      }
      else if (taxIncome >= 18201 && taxIncome <= 37000)
      {
         taxPay = (taxIncome - 18200) * 0.19;
      }
      else if (taxIncome >= 37001 && taxIncome <= 80000)
      {
         taxPay = 3572 + (taxIncome - 37000) * 0.325;
      }
      else if (taxIncome >= 80001 && taxIncome <= 180000)
      {
         taxPay = 17547 + (taxIncome - 80000) * .37;
      }
      else if (taxIncome > 180000)
      {
         taxPay = 54547 + (taxIncome - 180000) * .47;
      }
      // Work out the medicare levy
      if (taxIncome <= 20896)
      {
         medLevy = 0;
      }
      else if (taxIncome > 20896 && taxIncome < 26121)
      {
         medLevy = (taxIncome - 20896) * .1;
      }
      else if (taxIncome >= 26121)
      {
         medLevy = taxIncome * .02;
      }

      System.out.printf("%30s %n", "***Final tax statement***");
      System.out.println("");
      System.out.printf("%-30s %s %n", "User name:", name);
      System.out.printf("%-30s %s %n", "Financial year:", Year);
      System.out.printf("%-30s %s %n", "Tax file number:", TFN);
      System.out.println("");
      System.out.printf("%-30s $    %10.2f %n", "Assessable income:",
                        totIncome);
      System.out.printf("%-30s $    %10.2f %n", "Minus deductions:", -deduct);
      System.out.printf("%-30s $    %10.2f %n", "Taxable income:", taxIncome);
      System.out.println("");
      System.out.printf("%-30s $    %10.2f %n", "Tax payable:", taxPay);
      System.out.printf("%-30s $    %10.2f %n", "Medicare Levy:", medLevy);
      System.out.println("");
      System.out.println("Tax Agent: " + tAgent);
      console.close();

   }

}
