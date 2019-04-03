import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=sum_of_digits(n);
      System.out.println(sum);
	}
  public static int sum_of_digits(int n)
  {
    int s;
    s=(n*(n+1))/2;
    return s;
  }
}