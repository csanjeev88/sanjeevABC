import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("Enter starting number");
		Scanner sc=new Scanner(System.in);
		       int sn=sc.nextInt();
		       System.out.println("Enter ending number");
		               int en=sc.nextInt();
		               for(int i=sn;i<=en;i++){
		            	   if(i%(3*7)==0) System.out.println("cloudnix");
		            	   else if(i%3==0)System.out.println("cloud");
		            	   else if(i%7==0)System.out.println("Nix");
		            	   else System.out.println(i);
		               }
           
                    	 
                     }
	}


