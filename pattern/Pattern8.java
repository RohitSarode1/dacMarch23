class Pattern8
{
   public static void main(String args[])
   {
      for(int i=9;i>=1;i--)
	  {
	    for(int j=1;j<=i;j++)
		{
		   System.out.print(" ");
		}
		for(int k=9;k>=i;k--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	  }
   }
}