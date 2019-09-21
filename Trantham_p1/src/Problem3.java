import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = 5;
		int col = 10;
		int i;
		int j;
		int rate = 0;
		String [] topics = {"Gun Violence", "Video Games", "Climate Change", "Gay Marriage","Equal Pay"};
		int [][] responses = new int [row][col];
		
		
		for(i = 0; i< 5; i++)
		{
			System.out.println("Enter your rating for "+ topics[i]);
			rate = scan.nextInt();
		}
		
		}
			
			
		
	

}
