import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      int n=in.nextInt();
      String str3=str1.replace(str1,str2);
      String flag[]=str3.split(" ",n);
      for(int i=0;i<n;i++)
        System.out.println(flag[i]);
    }
}