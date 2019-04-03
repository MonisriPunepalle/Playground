import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int len=sb.length();
      int front=0;
      int end=len-1;
      int flag=-1;
      while(front<end)
      {
       
        if(sb.charAt(front)!=sb.charAt(end))
           {
             flag=0;
           }
           front++;
           end--;
    } 
           if(flag==-1)
           System.out.println("Yes");
           if(flag==0)
           System.out.println("No");
           }
}