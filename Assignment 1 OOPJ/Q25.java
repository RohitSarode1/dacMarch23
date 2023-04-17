 class Q25 {
    public static void main(String args[])
    {
        float value = 125.25f;
        Float f = new Float(value);

        byte num1 = f.byteValue();
        System.out.println("num1 :" +num1);

        short num2 = f.shortValue();
        System.out.println("num2 :" +num2);

        int num3 = f.intValue();
        System.out.println("num2 :" +num3);

        float num4 = f.floatValue();
        System.out.println("num2 :" +num4);

        double num5 = f.doubleValue();
        System.out.println("num2 :" +num5);
    }
}
