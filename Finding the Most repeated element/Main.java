import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int temp[]=new int[10];
    for(int i=0;i<10;i++)
    {
      temp[i]=0;
    }
    for(int i=0;i<n;i++)
    {
      int p=arr[i];
      temp[p]++;
    }
    int max=0;
    for(int i=0;i<10;i++)
    {
      if(temp[i]>max)
      {
        max=i;
      }
    }
    System.out.println(max);
  }
}