 class Test2
{
    public static void main(String args[])
    {
         byte b1= 2;
         String s1 = Byte.toString(b1);
         System.out.println("s1:" +s1);

         byte b2= 3;
         byte b3 = Byte.valueOf(b2);
         System.out.println("b3:" + b3);

         String str = "66";
         byte b4= Byte.valueOf(str);
         System.out.println("b4:" + b4);





    }   
}
