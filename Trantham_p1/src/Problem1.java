
public class Problem1 {

	public static void main(String[] args)
	{
		
		System.out.println("Enter a four digit ");
		 int[] array = new int[]{2,8,4,5};
		int [] arrayTwo;
		int i;
		int temp = 0;
		int tempTwo = 0;
		int j;
		int k;
		for(i = 0; i< array.length; i++) {
			array[i] += 7;
			array[i] %= 10;
		 
			
		}
		
			temp = array[0];
			array[0] = array[2];
			array[2] = temp;
			tempTwo = array[1];
			array[1] = array[3];
			array[3] = tempTwo;
			for(j= 0; j< array.length; j++)
			{
				System.out.print(array[j]);
			}
				

		
	
	
	}
	
}
