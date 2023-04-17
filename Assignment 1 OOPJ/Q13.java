class Q13 {
    
public static void main(String args[])
 {
    short s = 222;
    String str = Short.toString(s);
    System.out.println("str:"+str);

    short a = 35;
    Short sh = new Short(a);
    System.out.println("sh:"+sh);

    String st = new String("50");
    short s1 = Short.parseShort(st);
    System.out.println("s1:"+ s1);

 }
}
