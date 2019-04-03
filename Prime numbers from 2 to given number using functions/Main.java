import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;i++)
      {
       int flag=0;
         for(int j=1;j<=n;j++)
         {
        if(i%j==0)
           flag++;
         }
    
      if(flag==2)
        System.out.println(i);
      }
}
}