import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
      Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[size];
    int max;
    for(int i=0;i<size;i++)
    {
      arr[i]=in.nextInt();
    }
    max_element(arr,size);
  }
  public static void max_element(int list[],int n)
  {
    int max=list[0],me=0;
    for(int i=1;i<n;i++)
    {
    if(list[i]>max)
    {
      max=list[i];
      me=i;
    }
    }
    System.out.println(me);
  }
}