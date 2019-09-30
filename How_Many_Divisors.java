import java.util.Scanner;
class How_Many_Divisors{
	public static void main(String[] args){
		int a, b, c;
		int i;
		int count = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if((a >= 1 && a <= 10000) && (a >= 1 && a <= 10000) && (a >= 1 && a <= 10000)){
			for(i=a; i<=b; i++){
				if(c%i == 0){
					count++;
				}
			}
			System.out.println(count);
		}else{
			System.out.println("each numbers have to be within 1~10000");
		}
	}
}