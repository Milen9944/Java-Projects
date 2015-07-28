package OutputSomeNumbers;

public class OutputNumbersCanBeDividedBySevenAndEleven {

	public static void main(String[] args) {
		
		System.out.println("I will show you the numbers from 1 to 100 "
				+ "that can be divided by 7 or 11");
		
		for(int i = 1; i < 100; i++){
			if(i % 7 == 0){
				
				System.out.println("The number " + i + " can be divided by 7" );
			
			}else if(i % 11 ==0){
				System.out.println("The number " + i +" can be divided by 11");
			}
			
			
		}

	}

}
