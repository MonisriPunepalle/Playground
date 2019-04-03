import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
      Scanner in=new Scanner(System.in);
  int size=in.nextInt();
    int arr[]=new int[size];
      
    
    for(int i=0;i<size;i++)
    {
      arr[i]=in.nextInt();
    }
    batch(arr,size);
  }
  public static void batch(int list[],int n)
  {
   double flag=1,sum2=0;
    int sum1=list[0]+list[1]+list[2];
    for(int i=3;i<n;i=i+3)
    {
      sum2=list[i]+list[i+1]+list[i+2];
    if(sum1!=sum2)
      flag=0;
    }
    if(flag==1)
       System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}