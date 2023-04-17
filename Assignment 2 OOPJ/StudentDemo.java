
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
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Name : ");
        s1.setName(sc.nextLine());

        System.out.print("Rollno :");
        s1.setRollno(sc.nextInt());

        System.out.print("Age : ");
        s1.setAge(sc.nextInt());

        System.out.println(s1.getName()+" "+s1.getRollno()+" "+s1.getAge());

    }
}