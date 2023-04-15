import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
			int num= 0;
			int ans= 5;
			
			Scanner s = new Scanner(System.in);
			
			while ( num != ans) {
				
				System.out.print("\nCan you guess number: ");
						
				num = s.nextInt();
				
				if (num == ans)
					System.out.println("Right!");
				
				else {
					System.out.print ("Wrong! " );
					
					if(num < ans) 
						System.out.println ("Too Low...");
					else
						System.out.println ("Too High...");
				}
				
				
			}

	}

}
