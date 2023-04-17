import java.util.Scanner;

class Test
{
    double height;
    double weight;
    
    Test()
    {

    }
    Test(double height,double weight)
    {
         this.height = height;
         this.weight = weight;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWeight(double weight)
    {
        this.weight=weight;
    }
    public double getWeight()
    {
        return weight;
    }
   
   
    public double calculateBMI()
    {
        double BMI = (this.weight) / (this.height * this.height);
        return BMI;
    }
}
public class Bcalculator
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your height in meters: ");
         double height = sc.nextDouble();
         System.out.println("Enter your weight in kilograms: ");
         double weight = sc.nextDouble();

         Test t1 = new Test(height,weight);

         System.out.println("your height is :"+ t1.getHeight());
         System.out.println("your weight is :"+ t1.getWeight());
         System.out.println("your BMI is: "+" "+t1.calculateBMI());
     }    
}
