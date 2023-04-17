import java.util.Scanner;

class Bill 
{
    String name;
    double units;
    double bill;

    Bill()
    {

    }
    Bill(String name,double units)
    {
        this.name=name;
        this.units=units;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setUnits(double units)
    {
        this.units=units;
    }
    public double getUnits()
    {
        return units;
    }
    
     public void calculateBill(double units)
    {
      if(units<100)
		  bill=units*5;
	    else if(units<=300)
		  bill=100*5+(units-100)*7;
	    else if(units>300)
		  bill=100*5+200 *7+(units-300)*10; 

    }
}
class Final
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name1=sc.nextLine();

        System.out.println("Enter the consumed units : ");
        double unit1=sc.nextDouble();

        Bill b1 = new Bill(name1,unit1);
        b1.calculateBill(unit1);
       
        System.out.println("Your name is: "+ b1.getName());
        System.out.println("Your consumed units is: "+ b1.getUnits());
        System.out.println("your bill is: " + b1.bill);
        
    }
}
