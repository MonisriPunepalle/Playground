import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int square=square_of_digits(n);
      System.out.println(square);
	} 
  public static int  square_of_digits(int n)
  {
    int s;
    s=n*n;
    return s;
  }
    
}