import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int greatest=greatest_of_three(n1,n2,n3);
      System.out.println(greatest);
	}
  public static int greatest_of_three(int a,int b,int c)
  {
    int d,e;
    if(a>b)
      d=a;
    else
      d=b;
    if(d>c)
      e=d;
    else
      e=c;
     return e; 
    
}
}