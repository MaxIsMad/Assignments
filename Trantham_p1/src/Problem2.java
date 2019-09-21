import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int weight;
		int height;
		float BMI;
		System.out.println("Enter your weight");
		weight = scan.nextInt();
		System.out.println("Enter your height");
		height = scan.nextInt();
		BMI = (703 * weight) / (height * height);
		System.out.println("Your BMI is : "+ BMI);
	}

}
