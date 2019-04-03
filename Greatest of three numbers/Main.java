import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int c,d;
      if(n1>n2)
      {
         c=n1;
      }
      else
      {
        c=n2;
      }
      if(c>n3)
        d=c;
      else
        d=n3;
      System.out.println(d);
}
}