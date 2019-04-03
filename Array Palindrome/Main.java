import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int flag=0;
      for(int i=0;i<=n/2;i++)
      {
        if(arr[i]!=arr[n-i-1])
        {
          flag=1;
        break;
        }
      }
      if(flag==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}