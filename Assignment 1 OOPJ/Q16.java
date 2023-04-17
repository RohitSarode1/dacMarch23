 class Q16 {
    public static void main(String[] args) 
    {
        int value = 123257979;
        String str = Integer.toString(value);
        System.out.println("str:"+ str);

     
        int v = 123258456;
        Integer bs = new Integer( value );
        Integer d = bs.valueOf(v);
        System.out.println("d:"+ d);


         String s = "66";
         Integer b4= Integer.valueOf(s);
         System.out.println("b4:" + b4);
  }
}
