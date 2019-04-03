import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
  Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exponent=in.nextInt();
       double result=1;
      for(int i=1;i<=exponent;i++){
       
         result=result*base;}
     
      System.out.println(result);
      
    }
}