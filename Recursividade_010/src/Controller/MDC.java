

package Controller;

public class MDC {

	public MDC() {
		
		super();
		
	}
	
	public int fMDC (int A, int B) {
		
		if(A == B) {
			
			return A;
		}
		
		
		if(A > B) {
			
			return fMDC(A-B, B);			
					
			
		}
		
					
		return fMDC(B, A);
			
			
		
		
		
	}
	
}
