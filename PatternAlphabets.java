
public class PatternAlphabets {
	
	// A
	
	
	public void putA(int n, char symbol) {
		
		for (int i =0; i<n; i++) {
			
			for  (int j=0; j<n-i-1; j++) System.out.print(" ");

	        	 
	        for  (int j=0; j<2*i +1; j++) {
	        	if (i==0|| j==0|| j== 2*i ) System.out.print(symbol);
	        	else if (i== (n/2) && j == i)  System.out.print(symbol); 
	        	else System.out.print(" ");
	        		 
	        		 
	        		 
	        	 }
	        	 
	        	 for  (int j=0; j<n-i-1; j++) {
	        		 
	        		 System.out.print(" ");
	        	 } 
	    	 
	    	 
	    	System.out.println(" "); 
	     } 
		
		System.out.println(" "); 
		
	}
	
	
	// B
	
	public void putB(int n, char symbol) {
		
		for (int i = 0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
			
				if (i==0 || i==n-1 ||  ((i == n/2 || i==n/2+1 ) && j>1)  || j==0 || j==n-1) System.out.print(symbol);
				else  System.out.print(" ");
			
			}
			
			System.out.println("");
		}	
		
		System.out.println(" ");
		
	}
	
	//G
	
	public void putG(int n, char symbol) {
		
		for (int i = 0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
				
				boolean condition = i == 0 || j==0 || (i==n-1 && j<=n/2) || (j==n/2 && i>= n/2) || (i==n/2 && j>= n/2) || (j==n-1 && i>= n/2);
			
				if (condition) {
					System.out.print(symbol);
				}
				else  System.out.print(" ");
			
			}
			
			System.out.println("");
		}	
		
		System.out.println(" ");
		
	}
	
	
	// H
	
	public void putH(int n, char symbol) {
		
		for (int i = 0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
			
				if (i == n/2 || j==0 || j==n-1) System.out.print(symbol);
				else  System.out.print(" ");
			
			}
			
			System.out.println("");
		}	
		
		System.out.println(" ");
		
	}
	
	// I
	
	
	public void putI(int n, char symbol) {
		
		for (int i = 0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
			
				if (i == 0 || i==n-1 || j==n/2 ) System.out.print(symbol);
				else  System.out.print(" ");
			
			}
			
			System.out.println("");
		}	
		
		System.out.println(" ");
		
	}
	
	
	// R
	
	
	
	public void putR(int n, char symbol) {
		
		for (int i = 0; i<n; i++) {
		
			for (int j=0; j<n; j++) {
			
				if (i == 0 || j==0 || i==n/2 -1 || (j==n-1 && i<n/2)  || (i==j && i>=n/2)) System.out.print(symbol);
				else  System.out.print(" ");
			
			}
			
			System.out.println("");
		}	
		
		System.out.println(" "); 
		
	}

	
	// S
	
	public void putS(int n, char symbol) {
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
				
				if (i==0 || i == n-1 || i == n/2  ||  (j==0 && i < n/2) ||  (j==n-1 &&  i>n/2) ) System.out.print(symbol);
				else System.out.print(" ");
				
			} 
			System.out.println("");
		}
		System.out.println("");
		
	}
	
	// T
	
	
	public void putT(int n, char symbol) {
		
		for (int i = 0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
			
				if (i == 0 || j==n/2 ) System.out.print(symbol);
				else  System.out.print(" ");
			
			}
			
			System.out.println("");
		}	
		
		System.out.println(" ");
		
	}
	
	//U
	
	
	public void putU(int n, char symbol) {
		
		for (int i = 0; i<n; i++) {
		
			for (int j=0; j<n; j++) {
			
				if (i == n-1 || j==0 || j==n-1) System.out.print(symbol);
				else  System.out.print(" ");
			
			}
			
			System.out.println("");
		}	
		
		System.out.println(" "); 
		
	}
	
	// Y
	
	
	public void putY(int n, char symbol) {
		
		int tmp;
		
		for (int i = 0; i<n; i++) {
			
			tmp = i<n/2 ? i : (n - i - 1) ; 
			// (i - 2*(i- n/2) -1 )  == (n - i - 1)
			
			for (int j=0; j<tmp; j++) System.out.print(" ");
			
			tmp = i<n/2 ? n - 2*i  : 1;
			
			for (int j =0; j< tmp; j++) {
				
				if (j==0 || (j == n - 2*i -1) || i>=n/2) System.out.print(symbol);
				else System.out.print(" "); 
				
			}
			
			for(int j = 0; j<i; j++) {
				
				System.out.print(" ");
				
			}
			
			System.out.println("");
			
			
		} 
		
		System.out.println(" "); 
		
		
	}

}
