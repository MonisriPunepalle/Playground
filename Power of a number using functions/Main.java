import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    double pow=power(base,exponent);
    System.out.println(pow);
  }
  public static double power(int n1,int n2)
  {
  
    
    double p=Math.pow(n1,n2);
    
    return p;
  }
}