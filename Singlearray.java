import java.util.Scanner;

public class Singlearray {
	
	public static void main(String[] args) 
	{
		
		// Declare single dimensional
		int[] a=new int[100];
		
		
		// store the array values		
		Scanner obj=new Scanner(System.in);	
		for(int i=0;i<5;i++)
		{
			
			System.out.println("Enter "+(i+1)+" Array value : ");
			a[i]=Integer.parseInt(obj.nextLine());
			
		}
		
		
		
		// Display the array values		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
				


	}

		
		
		
}
	
	