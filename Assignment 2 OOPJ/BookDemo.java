import java.util.Scanner;

class Book {
    String title;
    String author;
    String publisher;
    int year;
    double price;
    int quantity;
    int i;
    int d;
    double p;

    Scanner sc = new Scanner(System.in);

    Book()
    {

    }
    Book(String title,String author,String publisher,int year,double price,int quantity)
    {
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.year=year;
        this.price=price;
        this.quantity=quantity;
    }
    public int menulist(){
        System.out.println("Current Inventory : "+ "\n");
       double p=quantity*price;
        System.out.println(title+"\n"+author+"\n"+publisher+"\n"+year+"\n"+p+"\n"+quantity+"\n");
        System.out.println("If you want to increase quantity press 1 :");
        System.out.println("If you want to decrease quantity press 2 :");
        System.out.println("Enter your choice :");
        return sc.nextInt();
    }
    public void setIncrease(){
        System.out.print("Enter number of quantity to be increased :");
         i=sc.nextInt();  
    }
    public int getIncrease(){
        return this.i;
    }
    public void setDecrease(){
        System.out.print("Enter number of quantity to be decreased :");
        d=sc.nextInt();
    }
    public int getDecrease(){
        return this.d;
    }
    public void getInventoryValue(){
        if (i!=0){
            System.out.println("\n"+"Before increasing quantity :");
            p=quantity*price;
            System.out.println(this.title+"\n"+this.author+"\n"+this.publisher+this.year+"\n"+p+"\n"+this.quantity+"\n");
            p=price *(quantity + i);
            quantity=quantity+i;
            System.out.println("After increasing quantity :");
            System.out.println(title+"\n"+author+"\n"+publisher+"\n"+year+"\n"+p+"\n"+quantity);
        }
        else{
            System.out.println("\n"+"Before decreasing quantity :");
            p=quantity*price;
            System.out.println(this.title+"\n"+this.author+"\n"+this.publisher+"\n"+this.year+"\n"+p+"\n"+this.quantity+"\n");
            p=price *(quantity - d);
            quantity=quantity-d;
            System.out.println("After decreasing quantity :");
            System.out.println(title+"\n"+author+"\n"+publisher+"\n"+year+"\n"+p+"\n"+quantity);
        }
    } 
}   
class BookDemo
{
    public static void main(String args[])
    {
        int choice;
        Book b1=new Book();
        if(( choice = b1.menulist())!=0){
            switch (choice){
                case 1:
                    b1.setIncrease();
                    break;
                case 2:
                    b1.setDecrease();
                    break;
            }
        }
        b1.getInventoryValue();  
   
    }
}