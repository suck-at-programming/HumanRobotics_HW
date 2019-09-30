import java.util.Scanner;
class Swapping_Two_Numbers{
	public static void main(String[] args){
		int x, y, i;
		int loop = 10000;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for(i = 0; i<loop; i++){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0){
				i = loop;
			}else if(x < 0 || y > 10000){
				System.out.println("x have to upper 0");
				System.out.println("y have to under 10000");
			}else if(x < y == true){
				System.out.println(x + " " + y);
			}else{
				System.out.println(y + " " + x);
			}
		}
	}
}