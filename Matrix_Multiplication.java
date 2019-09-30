import java.util.Scanner;
class Matrix_Multiplication{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int height;
		int width;
		int width2;
		height = sc.nextInt();
		width = sc.nextInt();
		width2 = sc.nextInt();   						/*Gloval Variables*/

		if((height <= 100 && height >= 1) && (width <= 100 && width >= 1) && (width2 <= 100 && width2 >= 1)){
			int[][] Matrix = new int[height][width];
			int[][] Matrix2 = new int[width][width2];
			int[][] Answer = new int[height][width2];	/*initialize each matrix*/


			for(int i = 0; i < height; i++){
				for(int j = 0; j < width; j++){
					Matrix[i][j] = sc.nextInt();
					if(Matrix[i][j] <= 10000 && Matrix[i][j] >= 0){
					}else{
						System.out.println("Matrix elements have to be within 0~10000");
						System.exit(0);
					}
				}
			}											/*assign elements and elements check done*/


			for(int i = 0; i < width; i++){
				for(int j = 0; j < width2; j++){
					Matrix2[i][j] = sc.nextInt();
					if(Matrix2[i][j] <= 10000 && Matrix2[i][j] >= 0){
					}else{
						System.out.println("Matrix elements have to be within 0~10000");
						System.exit(0);
					}
				}
			}											/*assign elements and elements check done*/



			for(int i = 0; i < height; i++){
				for(int j = 0; j < width2; j++){
					for(int k = 0; k < width; k++){
						Answer[i][j] +=Matrix[i][k] * Matrix2[k][j];
					}
					System.out.print(Answer[i][j] + " ");
				}
				System.out.println("");
			}

		}else{
			System.out.println("Matrix dimension is 1*1 ~ 100*100");
			System.exit(0);
		}
	}
}
