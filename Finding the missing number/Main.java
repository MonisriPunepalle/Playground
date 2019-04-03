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
      int miss,i;
      for( i=1;i<=n;i++)
      {
       int flag=1;
        for(int j=0;j<n;j++)
        {
          if(i==arr[j])
          {
             flag=0;
               break;
          }
           }
       if(flag==1)
       {
          miss=i;
        break;
       }
        }
        
    
      System.out.println(i);
      
    }
}