import java.util.*; 
import java.util.function.Predicate; 
public class ToString {
	ToString() 
    { 
  
        // create a list of strings 
        List<String> names = 
            Arrays.asList("arun","vijay","chandu","ajay","ravali"); 
  
        // declare the predicate type as string and use 
        // lambda expression to create object 
        Predicate<String> p = (s)->s.startsWith("a"); 
  
        // Iterate through the list 
        for (String st:names) 
        { 
            // call the test method 
            if (p.test(st)) 
                System.out.println(st); 
        } 
    } 

}
