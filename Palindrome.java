@author Subham
import java.util.Scanner;
public class Palindrome{
	public static void main(String[]  args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		
		int temp=n;
		int rev=0;
		if(temp<=0){
			System.out.println("Invalid Input");
		}
		else{
		while(temp>0){
			int ld=temp%10;
			rev=rev*10+ld;
			temp=temp/10;
		}
		
		if(rev==n){
			System.out.println("Number "+n+" is Palnidrome");
		}
		else{
			System.out.println("Number "+n+" is not Palnidrome");
		}
		}
	}
}