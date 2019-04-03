import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int count=0,sum=0;
     int num=n;
      while(num!=0)
      {
        count=count+1;
        int l=num%10;
        sum=sum+l;
        num=num/10;
      }
      System.out.println(sum);
	}
}