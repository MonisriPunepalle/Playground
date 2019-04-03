import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int[n];
      int temp[]=new int[k];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      for(int i=0;i<k;i++)
      {
        temp[i]=0;
      }
      for(int i=0;i<n;i++)
      {
       int p=arr[i];
        temp[p-1]++;
      }
      for(int j=0;j<k;j++)
      {
        System.out.println((j+1) +" "+temp[j]);
      }
        
        
    }
}