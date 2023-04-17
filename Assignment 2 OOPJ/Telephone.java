
import java.util.Scanner;
class Test
{
    String name;
    long phoneno;
    int calls;
    double duration;
    double bill;

    Test()
    {
    }
    Test(String name,int phoneno)
    {
        this.name=name;
        this.phoneno=phoneno;
    }
    Test(String name,long phoneno,int calls,double duration)
    {
        this.name=name;
        this.phoneno=phoneno;
        this.calls=calls;
        this.duration=duration;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setPhoneno(long phoneno)
    {
        this.phoneno=phoneno;
    }
    public long getPhoneno()
    {
        return phoneno;
    }
    public void setCalls(int calls)
    {
        this.calls=calls;
    }
    public int getNoofcalls()
    {
        return calls;
    }
    public void setDuration(double duration)
    {
        this.duration=duration;
    }
    public double getDuration()
    {
        return duration;
    }
    public void calculateBill(){
        if(calls<100){
            bill=10 + (calls * 0.50);
            System.out.println(name+" "+"your Telephone bill is : ");
            System.out.println("Calls made : "+calls);
            System.out.println("Bill : "+bill+"$");
        }
        else{
            calls=calls-100;
            bill=60 + (calls * 0.50);
            System.out.println(name+" "+"your Telephone bill is : "+bill+"$");
            System.out.println("Calls made : "+(calls=calls+100));
            System.out.println("Bill : "+bill+"$");
        }
    }
}



class Telephone 
{
    public static void main(String args[])
    { 
        Test t1 = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        t1.setName(sc.nextLine());
     
        System.out.println("Enter your phone no: ");
        t1.setPhoneno(sc.nextLong());

        System.out.println("Enter no of calls: ");
        t1.setCalls(sc.nextInt());

        t1.calculateBill();



    }    
}
