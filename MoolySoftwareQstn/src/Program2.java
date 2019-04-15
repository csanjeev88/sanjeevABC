import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
          System.out.println("Enter starting number");
          Scanner sc=new Scanner(System.in);
          int sn=sc.nextInt();
          System.out.println("Enter Ending number");
          int en=sc.nextInt();
          int result=0;
          for(int i=sn;i<=en;i++){
        	  if(isperfectsquare(5*i*i+4)||isperfectsquare(5*i*i-4))
        		  result=i;
          }
          if(result==233){
        	  System.out.println("the biggest odd number:"+result);
          }
          else{
        	  System.out.println(0);
          }
	}
	public 

}
