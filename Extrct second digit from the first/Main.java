import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int count=0;
    int num=n;
    while(n!=0)
    {
      count=count+1;
      n=n/10;
    }
    if(count==2)
    {
      int n1=num%10;
      System.out.println(n1);
    }
    else if(count==5)
    {
      int n3=num%10000;
      int n4=n3/1000;
      System.out.println(n4);
    }
  }
}