import java.util.Scanner;
class SpreadSheet{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int r;
		int c;
		r = sc.nextInt();
		if(r < 1 || r > 100){
			System.out.println("row has to be within 1~100");
			System.exit(0);
		}
		c = sc.nextInt();
		if(r < 1 || r > 100){
			System.out.println("row has to be within 1~100");
			System.exit(0);
		}
		int[][] sheet = new int[r+1][c+1];
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				sheet[i][j] = sc.nextInt();
				if(sheet[i][j] > 101 || sheet[i][j] < -1){
					System.out.println("each elements have to be within 0~100.");
					System.exit(0);
				}else{
					sheet[i][c] += sheet[i][j];
					sheet[r][j] += sheet[i][j];
					sheet[r][c] += sheet[i][j];
				}
			}
		}
		
		for(int i = 0; i < r+1; i++){
			for(int j = 0; j < c+1; j++){
				System.out.print(sheet[i][j] + " ");
			}
			System.out.println("");
		}
	}
}