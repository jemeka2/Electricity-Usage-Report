import java.util.Scanner;

public class ElectricityUsage {
    public static void main(String[] args)
    {
        Scanner kybd = new Scanner(System.in);

        //Variables
        String customerFName, customerLName, fullName;
        double wattHours, amountDue, customerNum, overTime, overBal;

        //User Inputs
        System.out.print("Please enter your customer number: ");
        customerNum = kybd.nextInt();

        System.out.print("Please enter your full name: ");
        customerFName = kybd.next();
        customerLName = kybd.nextLine();
        fullName = customerFName + "" + customerLName;

        System.out.print("Please enter your kilowatts hours: ");
        wattHours = kybd.nextInt();
        System.out.println(); //This is used to create a break between the questions and the report

        //Calculating Amount Due
        if(wattHours <= 200)
        {
            amountDue = wattHours * 0.11;
        }
        else
        {
            //adds the addition 8 cents per hour after 200 hours
            amountDue = wattHours * 0.11;
            overTime = wattHours - 200;
            overBal = overTime * 0.8;
            amountDue = amountDue + overBal;
        }
        //Output
        System.out.println("Customer Electricity Usage Report: ");
        System.out.println("Customer Name: " + fullName );
        System.out.println("Customer Number: " + customerNum );
        System.out.println("Electricity Usage: " + wattHours + " Kilowatt hours");
        System.out.println("Amount Due: $" + amountDue);
    }
}
