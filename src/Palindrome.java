import java.util.*; 
import java.util.function.Predicate; 
public class Palindrome {
	Palindrome() 
    { 
  
        // create a list of strings 
        String[] a= new String[] {"arun","vijay","rar","ajay","jajaj"}; 
  
        // declare the predicate type as string and use 
        // lambda expression to create object 
         
  
        // Iterate through the list 
        for(int i=0;i<5;i++) 
        { 
            // call the test method 
            reverse(a[i]);
        } 
    } 
	void reverse(String s)
	{
		char[] ch=s.toCharArray();
		String a="";
		for(int j=s.length()-1;j>=0;j--)
		{
			a=a+ch[j];
		}
		System.out.println(a);
		if(s.Equals(a))
		{
			System.out.println(s);
		}
		
	}

}
