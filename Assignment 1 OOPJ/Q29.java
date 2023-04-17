 class Q29 {
      public static void main(String args[])
      {
        double value = 1252566.6656;
        Double ds = new Double(value);

        byte num1 = ds.byteValue();
        System.out.println("num1 :" +num1);

        short num2 = ds.shortValue();
        System.out.println("num2 :" +num2);

        int num3 = ds.intValue();
        System.out.println("num2 :" +num3);

        float num4 = ds.floatValue();
        System.out.println("num2 :" +num4);

        double num5 = ds.doubleValue();
        System.out.println("num2 :" +num5);
      }    
}
