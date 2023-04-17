import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Date 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day : ");
        int day = sc.nextInt(); 

        System.out.println("Enter month : ");
        int month = sc.nextInt();

        System.out.println("Enter year : ");
        int year = sc.nextInt();

        System.out.println("Enter hour : ");
        int hour = sc.nextInt();

        System.out.println("Enter min : ");
        int min = sc.nextInt();

        System.out.println("Enter sec : ");
        int sec = sc.nextInt();

        Calendar c = Calendar.getInstance();
        
        
        SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy ");
        SimpleDateFormat s2 = new SimpleDateFormat("MM/dd/yyyy ");
        SimpleDateFormat s3= new SimpleDateFormat("yyyy/MM/dd ");

        SimpleDateFormat a1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat a2 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat a3 = new SimpleDateFormat("HH:mm");

        SimpleDateFormat b1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        SimpleDateFormat b2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        SimpleDateFormat b3 = new SimpleDateFormat("yyyy/MM/dd HH:mm");


        c.set(year,(month-2),day,hour,min,sec);
        System.out.println("dd/mm/yyyy "+s1.format(c.getTime()));
       // System.out.println("mm/dd/yyyy "+s2.format(c.getTime()));
        //System.out.println("yyyy/mm/dd "+s3.format(c.getTime()));

        System.out.println("HH:mm:ss : "+a1.format(c.getTime()));
       // System.out.println("hh:mm:ss a : "+a2.format(c.getTime()));
       // System.out.println("HH:mm : "+a3.format(c.getTime()));

        System.out.println("dd/mm/yyy HH:mm:ss : "+b1.format(c.getTime()));
       // System.out.println("mm/dd/yyyy hh:mm:ss a : "+b2.format(c.getTime()));
       // System.out.println("yyyy/mm/dd HH:mm : "+b3.format(c.getTime()));
    }
}