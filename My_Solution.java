package misc;



public class main_misc {

	public static void main(String[] args) {
		
	System.out.println(consec_ones(83));
		
	}
	private static int consec_ones(int n){
		
		//
		String b = "";
		int d = 0;
	    
		int curr = 0;
		int max = 0;
		
		for(int i = n;i >= 1;i/= 2) {
			d = i %2;
			b += d;	
			if(d == 1 && i == 1) {
				//last iteration
				curr++;
				if(max <= curr) {
					max = curr;
				}
				break;
			}
			if(d == 0) {
				if(max <= curr) {
					max = curr;
				}
				curr = 0;
			}
			if(d == 1) {
				curr++;
			}
		}
		return max;
		
		/*to get the binary number you have to invert b*/
		
		
		
		
		
	}
	}
	
	
	
	

	


	
	

	
		
	
	


	

	
	

