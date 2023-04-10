package mavenprojectdec;

public class Sumdigits {

	public static void main(String[] args) {
		 
		int number=12356;
		
		int sum=0;
		
		while(number>0) 
		{
		
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println("sum of digit in a number:"+sum);
	}

}
