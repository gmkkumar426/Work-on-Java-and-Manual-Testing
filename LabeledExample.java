package practice;

public class LabeledExample {

	public static void main(String[] args) {
		 aa:  
		        for(int i=4;i<=6;i++){  
		            bb:  
		                for(int j=4;j<=6;j++){  
		                    if(i==5&&j==5){  
		                        break aa;  
		                    }  
		                    System.out.println(i+" "+j);  
		                }  
		        }  

	}

}
