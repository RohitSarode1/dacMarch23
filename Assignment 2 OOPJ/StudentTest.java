
import java.util.Scanner;
class Student
{
    String name;
    int rollno;
    int age;

    Student()
    {

    }
    Student(String name,int rollno,int age)
    {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setRollno(int rollno)
    {
        this.rollno = rollno;
    }
    public int getRollno()
    {
        return this.rollno;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
}
class StudentDemo
{
   public static Scanner sc = new Scanner(System.in);
    Student s2 = new Student();

    public void acceptRecord()
        {
             System.out.print("Name : ");
             sc.nextLine();
             s2.setName(sc.nextLine());
             
             System.out.print("Rollno : ");
             s2.setRollno(sc.nextInt());

             System.out.print("Age : ");
             s2.setAge(sc.nextInt());
        }
    public void printRecord()
    {
        System.out.println(s2.getName()+" "+s2.getRollno()+" "+s2.getAge());
    }

    public static int menuList()
    {
        System.out.println("0.exit");
        System.out.println("1.acceptRecord");
        System.out.println("2.printRecord");
        System.out.println("enter choice : ");
        return sc.nextInt();
    }
}
class StudentTest
{
    public static void main(String args[])
    {
        int choice;
        StudentDemo test = new StudentDemo();
        while( (choice = StudentDemo.menuList())!=0)
        {
            switch(choice)
            { 
                case 1:
                  test.acceptRecord();
                  break;
                case 2:
                  test.printRecord();
                  break;
            }
        }

    }
}