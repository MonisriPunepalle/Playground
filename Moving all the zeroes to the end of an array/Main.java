import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
       Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      solution(arr,size);
    }
  public static void solution(int arr[],int n)
  {
    int asize=0;
    int bsize=0;
    int a[]=new int[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
      if(arr[i]>0)
      {
        a[asize]=arr[i];
      asize++;
    }
      else
      {
        b[bsize]=arr[i];
        bsize++;
      }
    }
      int at=0;
     for(int i=0;i<asize;i++) 
      {
        arr[at]=a[i];
        at++;
      }
      for(int i=0;i<bsize;i++)
      {
        arr[at]=b[i];
        at++;
      }
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]);
    System.out.print(" ");
      }
    }     

    }
