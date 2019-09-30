import java.util.Scanner;
class Print_a_Chessboard{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		if(x == 0 && y == 0){
		}else if((x <= 300 && x >= 1) && (y <= 300 && y >= 1)){
			for(int i = 0; i < x; i++){
				for(int j = 0; j < y; j++){
					if((i+j) % 2 == 0){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}else{
			System.out.println("height and width have to be within 1~300");
		}
	}
}