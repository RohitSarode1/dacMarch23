class Q14 
{

     public static void main(String args[])
     {
        short value = 225;
        Short sh = new Short(value);

        byte num1 = sh.byteValue();
        System.out.println("num1 :" +num1);

        short num2 = sh.shortValue();
        System.out.println("num2 :" +num2);

        int num3 = sh.intValue();
        System.out.println("num3 :" +num3);

        float num4 = sh.floatValue();
        System.out.println("num4 :" +num4);

        double num5 = sh.doubleValue();
        System.out.println("num5 :" +num5);


  }
}
