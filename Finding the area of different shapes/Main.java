import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
      switch(n)
      {
        case 1:
          int s=in.nextInt();
          int res=0;
          res=s*s;
          System.out.println(res);
          break;
        case 2:
          int l=in.nextInt();
         int  b=in.nextInt();
          int res1=0;
          res1=2*(l+b);
          System.out.println(res1);
          break;
        case 3:
          int ba=in.nextInt();
         int h=in.nextInt();
          
         double res3=0.5*ba*h;
          System.out.println(res3);
          break;
        case 4:
          int r=in.nextInt();
          double res4=0;
          res4=3.14*r*r;
          System.out.println(res4);
          break;
    }
}
}