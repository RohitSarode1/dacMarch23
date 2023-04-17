 class Test1 
{
    public static void main(String args[])
    {
        boolean b1= true;
        String s1= Boolean.toString(b1);
        System.out.println("s1:"+s1);
        
        boolean b3= true;
        boolean b2= Boolean.valueOf(b3);
        System.out.println("b2:"+b2);

        String s2= "true";
        boolean b4= Boolean.parseBoolean(s2);
        System.out.println("b4:"+b4);

        String s3= "true";
        boolean b5= Boolean.valueOf(s3);
        System.out.println("b5:"+b5);  




    }
}
