
package Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1 , 2 , 3, 4};
		int[] copyNum = new int[numbers.length];
		int material = 1;
		for(int i =0; i < numbers.length; i ++){
			
			numbers[i] = material;
			copyNum[i] = numbers[i];
			System.out.println(copyNum[i]);
			material++;
			
		}
		
		
//		System.arraycopy(numbers, 0, copyNum, 0, numbers.length);
//		for(int i = 0 ; i < copyNum.length ; i++){
//			
//			System.out.println(copyNum[i]);
//			
//		}
	}
		
}
