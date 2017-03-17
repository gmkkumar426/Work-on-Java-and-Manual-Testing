package practice;

public class TestStringComparison {
	public static void main(String args[]){  
		   String s1="Murali";  
		   String s2="Murali";  
		   String s3=new String("Murali");  
		   String s4="Madhav";  
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false  
		 }  
}
