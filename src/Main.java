import java.util.Scanner;
public class Main {
     public static void main(String[] args)
     {
    	 Scanner sc=new Scanner(System.in);
    	  System.out.println("1.Average\n2.Strings starting with a\n3.Palindromes");
    	  System.out.println("Choose option");
    	  int n=sc.nextInt();
    	  if(n==1) {
    		  Average a=new Average();
    	  }
    	  else if(n==2)
    	  {
    		  ToString b=new ToString();
    	  }
    	  else if(n==3)
    	  {
    		  Palindrome c=new Palindrome();
    	  }
    	  else
    	  {
    		  System.out.println("Enter valid value");
    	  }
     }
}
