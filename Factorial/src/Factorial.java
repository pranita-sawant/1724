
public class Factorial {
	
	static int calcFactorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * calcFactorial(n-1));    
	 }  
	
		
	static int displayFact(int n){
		System.out.println("Factorial is" + n);
		return 0;
	}
}
	
	

