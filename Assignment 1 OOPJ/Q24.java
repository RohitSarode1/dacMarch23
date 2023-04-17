 class Q24 {
    public static void main(String[] args) 
    {
        float value = 123.26f;
        String str = Float.toString(value);
        System.out.println("str:"+ str);

     
        float v = 123.258f;
        Float b = new Float( value );
        Float d = b.valueOf(v);
        System.out.println("d:"+ d);


         String s = "66";
         Float b4= Float.valueOf(s);
         System.out.println("b4:" + b4);
   }

}
