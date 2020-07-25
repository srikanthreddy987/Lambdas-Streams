import java.util.ArrayList; 
public class Average
{ 
    Average()
    { 
        int[] a=new int[] {9,5,7,4,6,6,5,5,6};
        MathOperation addition = (int c, int b) -> c + b;
        int d=0;
        for(int i=0;i<5;i++)
        {
        	d=addition.operation(d,a[i]);
        }
        System.out.println(d/9);
  
        
    }
    interface MathOperation 
    { 
        int operation(int a, int b); 
    } 
} 