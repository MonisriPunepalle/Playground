import java.util.*;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      double sum=0;
      int n1=n;
      int n2=n;
      int x=1;
      int count=0;
      while(n!=0)
      {
     
       count=count+1;
           n=n/10;
      }
      for(int i=1;i<=count;i++)
      {
        int num=n1%10;
        sum=sum + Math.pow(num, count);
        n1=n1/10;
      }
     if(sum==n2)
       System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
     
          
	}
}