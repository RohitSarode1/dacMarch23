
import java.util.Scanner;
class Program
{
    String vehicletype;
    int noofaxles;
    double distance;
    double tollrate;

   public Program()
   {
   }
  

   public void setVehicletype(String vehicletype)
   {
     this.vehicletype = vehicletype;
   }
   public String getVehicletype()
   {
     return vehicletype;
   }
   public void setNoofaxles(int noofaxles)
   {
     this.noofaxles = noofaxles;
   }
   public int getNoofaxles()
   {
     return noofaxles;
   }
   public void setDistance(double distance)
   {
     this.distance = distance;
   }
   public double getDistance()
   {
     return distance;
   }
   

   public void calculateBill( int noofaxles)
   {
    switch(noofaxles) {
        case 2:
            tollrate = 30;
            break;
        case 3:
             tollrate = 35;
            break;
        case 4:
             tollrate = 50;
            break;
        case 5:
             tollrate = 75;
            break;
        default:
             tollrate = 1;
   }
   
 }
     
}

class TollBooth 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter vehicletype:  ");
        String vehicletype = sc.nextLine();

        System.out.println("Enter noofaxles:  ");
        int noofaxles = sc.nextInt();


        Program p1 = new Program( );
        p1.calculateBill(noofaxles);

        System.out.println("Your vehicletype is: "+ p1.getVehicletype());
        System.out.println("no of axles is: "+ p1.getNoofaxles());
        System.out.println("your Bill is: "+" "+ p1.calculateBill());
        
    }
}
