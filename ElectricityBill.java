import java.util.*;
public class ElectricityBill
{
public static void main(String[] args)
{
int units,charge,amount;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter meter number:");
int meterno=scanner.nextInt();
System.out.println("Enter previous reading:");
int previous=scanner.nextInt();
System.out.println("Enter present reading:");
int present=scanner.nextInt();
if(previous<present)
{units=present-previous;
System.out.println("Units is:"+units);
if(units>0 && units<=100)
{
charge=2;
}
else if(units>=101 && units<=200)
{
charge=4;
}
else
{
charge=5;
}
System.out.println("Charge is:"+charge);
amount=units*charge;
System.out.println("amount is:"+amount);
}
else
{
System.out.println("Please Enter valid reading");
}
}
}







