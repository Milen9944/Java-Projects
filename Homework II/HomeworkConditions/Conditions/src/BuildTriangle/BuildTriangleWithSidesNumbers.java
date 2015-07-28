package BuildTriangle;

import java.util.Scanner;

public class BuildTriangleWithSidesNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Input three numbers and I will tell you if you can build a triangle");
		
		Scanner input = new Scanner(System.in);
		
		int fSide = input.nextInt();
		int sSide = input.nextInt();
		int tSide = input.nextInt();
		
		int fs = fSide + sSide;
		int st = sSide + tSide;
		int ft = fSide + tSide;
		
		int fsD = fSide - sSide;
		int stD = sSide - tSide;
		int ftD = fSide - tSide;
		
		if((fs > tSide) && (fsD < tSide)){
			if((st > fSide) && (stD < fSide)){
				if((ft > sSide)&&(ftD < sSide)){
					
					System.out.println("Finally you make your right triangle");
					
				}
			}
			
			
		}else{
			
			System.out.println("There is no way to build you triangle");
			
		}
		
		input.close();
		
	}

}
