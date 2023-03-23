class Pattern10
{
   public static void main(String args[])
   {
       for(int i=1;i<=6;i++)
	   {
		   for(int k=5;k>=i;k--)
		   {
			   System.out.print(" ");
		   }
	      for (int j=1;j<=5;j++)
		  {
		     System.out.print("* ");
		  }
		  System.out.println();
	   }
   }
}