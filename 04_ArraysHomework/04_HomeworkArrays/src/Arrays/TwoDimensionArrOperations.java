package Arrays;

public class TwoDimensionArrOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] pureMatrix = new int[4][4];
		int material = 0;
		
		for(int i=0 ; i < pureMatrix.length ; i++){
			for(int j = 0 ; j < pureMatrix[i].length; j++){
				
				pureMatrix[i][j] = material;
				material++;
				
				
			}
			
		}
		
		for(int i=0; i<pureMatrix.length; i++){
			for(int j = 0; j < pureMatrix[i].length; j++){
				if(pureMatrix[i][j] % 2 == 1){
					
					System.out.println(pureMatrix[i][j]);
					pureMatrix[i][j] *= 2;
					System.out.println("powered on 2 is:" + pureMatrix[i][j]);
					
				}else{
					
					continue;
				}
				
			}
		}
		
		System.out.println("The result by the operations is:");
		
		for(int i = 0; i < pureMatrix.length;i++){
			for(int j=0;j < pureMatrix[i].length;j++){
				System.out.println(pureMatrix[i][j] + "");
				
			}
			
		}
	}

}
