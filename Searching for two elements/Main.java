import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int size=in.nextInt();
     int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=in.nextInt();
      }
      int n1=in.nextInt();
      int n2=in.nextInt();
      int e1=-1;
      int e2=-1;
      for(int i=0;i<size;i++)
      {
        if(n1==arr[i])
          e1=i;
        if(n2==arr[i])
          e2=i;
      }
      System.out.println(e1);
      System.out.println(e2);
    }
}