 class Q28 {
 public static void main(String[] args) 
    {
        double value = 123.26;
        String str = Double.toString(value);
        System.out.println("str:"+ str);

     
        double v = 123.258;
        Double ds = new Double( value );
        Double d = ds.valueOf(v);
        System.out.println("d:"+ d);


         String s = "66";
         Double b4= Double.valueOf(s);
         System.out.println("b4:" + b4);





    }

 }