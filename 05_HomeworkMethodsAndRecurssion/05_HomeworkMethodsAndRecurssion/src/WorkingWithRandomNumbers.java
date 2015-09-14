import java.util.Random;

public class WorkingWithRandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		int firstRandomNum = random.nextInt(1000);
		int secondRandomNum = random.nextInt(1000);
		int thirdRandomNum = random.nextInt(1000);

		for (int i = 0; i < 20; i++) {
			System.out.printf("random numbers:%d,%d,%d\n", firstRandomNum, secondRandomNum, thirdRandomNum);
			System.out.println(multiply(firstRandomNum, secondRandomNum, thirdRandomNum));
		}
	}

	public static long multiply(int firstRandomNum, int secondRandomNumb, int thirdRandomNum) {
		long result = firstRandomNum * secondRandomNumb * thirdRandomNum;
		return result;
	}

}