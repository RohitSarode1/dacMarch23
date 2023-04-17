import java.util.Scanner;

class Test{
    private String name;
    private int accountNumber;
    private double balance;
    private double deposit;
    private double withdraw;
    Scanner sc=new Scanner(System.in);

    public Test(){
        this.name=null;
        this.accountNumber=1;
        this.balance=0.0;
    }
    public int menulist(){
        System.out.println("Hello customer"+ "\n");
        System.out.println("To create new account press 1 :");
        System.out.println("To deposit money into your account press 2 :");
        System.out.println("To withdraw money from your account press 3 :");
        System.out.println("To display your account balance press 4 :");
        System.out.println("To display account information press 5 :");
        System.out.println("To Exit press 0 :");
        System.out.println("Enter your choice :");
        return sc.nextInt();
    }
    public void setCreate(){
        System.out.println("Please enter your name : ");
        String Name=(sc.nextLine());
        Name=(sc.nextLine());
        this.name=Name;
        CreateAccount();
    }
    public String getCreate(){
        return this.name;
    }
    public void CreateAccount(){
        System.out.println("Congragulations "+this.name+" your account has been created :");
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Balance : "+this.balance+"\n");
    }
    public void setDeposit(){
        System.out.println("Please enter your account number : ");
        int i=(sc.nextInt());
        if(i==this.accountNumber){
            System.out.println("Please enter amount : ");
            double Deposit=(sc.nextDouble());
            this.balance=Deposit;
            showInfo();
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
    public double getDeposit(){
        return this.deposit;
    }
    public void setWithdraw(){
        System.out.println("Please enter your account number : ");
        int i=(sc.nextInt());
        if(i==this.accountNumber){
            System.out.println("Please enter amount : ");
            double Deposit=(sc.nextDouble());
            this.balance=(this.balance - Deposit);
            showInfo();
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
    public double getWithdraw(){
        return this.withdraw;
    }
    public void setBalance(){
        System.out.println("Please enter your account number : ");
        int i=(sc.nextInt());
        if(i==this.accountNumber){
            showBalance();
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public void showBalance(){
        System.out.println("Hello "+this.name);
        System.out.println("Account number : "+this.accountNumber);
        System.out.println("Your current Balance is : "+this.balance+"\n");
    }
    public void setInfo(){
        System.out.println("Please enter your account number : ");
        int i=(sc.nextInt());
        if(i==this.accountNumber){
            showInfo();
        }
        else
        {
            System.out.println("Invalid number");
        }
    }
    public int getInfo(){
        return this.accountNumber;
    }
    public void showInfo(){
        System.out.println("Hello "+this.name);
        System.out.println("Bank name : SBI");
        System.out.println("Account number : "+this.accountNumber);
        System.out.println("Balance : "+this.balance+"\n");
    }

}
class Bank{
    public static void main(String args[]){
        Test t1=new Test();
        int choice;
        Scanner sc=new Scanner(System.in);
        while(( choice = t1.menulist())!=0){
            switch (choice){
                case 1:
                    t1.setCreate();
                    break;
                case 2:
                    t1.setDeposit();
                    break;
                case 3:
                    t1.setWithdraw();
                    break;
                case 4:
                    t1.setBalance();
                    break;
                case 5:
                    t1.setInfo();
                    break;
            }
        }
    }
}