import java.util.Scanner;
class Official_House{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = 0;
		int b = 0;
		int f = 0;
		int r = 0;
		int v = 0;
		n = sc.nextInt();
		int[][][] whole;
		whole = new int[4][3][10];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					whole[i][j][k] = 0;
				}
			}
		}


		for(int i = 0; i < n; i++){
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			if((whole[b-1][f-1][r-1] + v) < 10 && (whole[b-1][f-1][r-1] + v) > -1){
				whole[b-1][f-1][r-1] += v;
			}else{
				System.out.println("room member have to be within 0~9");
			}
		}
			
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" " + whole[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("********************");
		}
	}
}