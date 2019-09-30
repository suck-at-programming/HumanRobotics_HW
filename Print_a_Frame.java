import java.util.Scanner;
class Print_a_Frame{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		if(x == 0 && y == 0){
		}else if((x <= 300 && x >= 3) && (y <= 300 && y >= 3)){
			for(int i = 0; i < x; i++){
				for(int j = 0; j < y; j++){
					if(i == 0 || j == 0 || i == x-1 || j == y-1){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}else{
			System.out.println("height and width have to be within 3~300");
		}
	}
}