import java.util.Scanner;
class Matrix_Vector{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int height;
		int width;
		height = sc.nextInt();
		width = sc.nextInt();
		System.out.print(height);
		System.out.println(width);
		if((height <= 100 && height >= 1) && (width <= 100 && width >= 1)){
			int[][] Matrix = new int[height][width];
			int[] Vector = new int[width];
			int[] Answer = new int[height];
			
			for(int a = 0; a < height; a++){
				for(int b = 0; b < width; b++){
					System.out.print(Matrix[a][b] + " ");
				}
				System.out.println("");
			}

			for(int i = 0; i < height; i++){
				for(int j = 0; j < width; j++){
					Matrix[i][j] = sc.nextInt();			
				}
			}

			for(int i = 0; i < height; i++){
				for(int j = 0; j < width; j++){
					if(Matrix[i][j] <= 1000 && Matrix[i][j] >= 0){
					}else{
						System.out.println("Matrix elements have to be within 0~1000");	
						System.exit(0);
					}					
				}
			}
			
			for(int i = 0; i < width; i++){
				Vector[i] = sc.nextInt();
			}

			for(int i = 0; i < width; i++){
				if(Vector[i] <= 1000 && Vector[i] >= 0){
					}else{
						System.out.println("Vector elements have to be within 0~1000");	
						System.exit(0);
					}
			}

			for(int i = 0; i < height; i++){
				for(int j = 0; j < width; j++){
					Answer[i] = Answer[i] + (Matrix[i][j] * Vector[j]);
				}
			}
			
			for(int i = 0; i < height; i++){
				System.out.println(Answer[i]);
			}

		}else{
			System.out.println("Matrix dimension is 1*1 ~ 100*100");
			System.exit(0);
		}
	}
}