import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n,sum=0;
      while(n>0)
      {
       int rem=n%10;
        int i=1;
        int fact=1;
        while(i<=rem)
        {
          fact=fact*i;
          i=i+1;
        }
        sum=sum+fact;
        n=n/10;
      }
        if(sum==temp)
        System.out.println("Yes");
        else
          System.out.println("No");
      
	}
}