
public class LoopReview3 {
	public static void main(String [] args) {
		int count = 0, asterisk;
		
		while (count <= 5 ) {
			asterisk = 1+count;
			count++;
			if (asterisk ==1)
				System.out.println("   *");
			
			if (asterisk ==2)
				System.out.println("  ***");
			
			if (asterisk ==3)
				System.out.println(" *****");
			
			if (asterisk ==4)
				System.out.println("  ***");
			
			if (asterisk ==5)
				System.out.println("   *");
			
		}
		
		
		
	}
	

}