import java.util.Scanner;
class Structured_Programming{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x = 0;
		x = sc.nextInt();
		if(x <= 10000 && x >= 3){
			for(int i = 0; i <= x; i++){
				if((i % 3 == 0) || (i % 10 == 3)){
					System.out.print(" " + i);
					
				}else{
				}
			}
		}else{
			System.out.println("the number has to be within 3~10000");
		}
	}
}