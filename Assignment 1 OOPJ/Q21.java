 class Q21 {
    public static void main(String args[])
    {
        long value = 1252564626;
        Long l1 = new Long(value);

        byte num1 = l1.byteValue();
        System.out.println("num1 :" +num1);

        short num2 = l1.shortValue();
        System.out.println("num2 :" +num2);

        int num3 = l1.intValue();
        System.out.println("num2 :" +num3);

        float num4 = l1.floatValue();
        System.out.println("num2 :" +num4);

        double num5 = l1.doubleValue();
        System.out.println("num2 :" +num5);
    }
}
