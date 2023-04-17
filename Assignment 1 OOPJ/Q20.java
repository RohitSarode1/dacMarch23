 class Q20 {
  public static void main(String[] args) 
    {
        long value = 123257979;
        String str = Long.toString(value);
        System.out.println("str:"+ str);

     
        long v = 123258456;
        Long bs = new Long( value );
        Long d = bs.valueOf(v);
        System.out.println("d:"+ d);


         String s = "66";
         Long b4= Long.valueOf(s);
         System.out.println("b4:" + b4);
   }

}

