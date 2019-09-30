import java.util.Scanner;
class How_Many_ways{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n;
		int x;
		int count =0;
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			if(n >= 3 && n <= 100 && x <= 300 && x >= 0){
				for(int i = 1; i < x/3; i++){
					for(int j = i+1; j < x/2; j++){
						int sum;
						sum = i + j;
						if((x - sum) > j && (x - sum) <= n){
							count++;
						}else{
						}
					}
				}
			System.out.println(count);
			count = 0;
			}else if(x == 0 && n == 0){
				break;
			}else{
				System.out.println("order is 3 <=n<= 100, and 0<=x<=300");
				break;
			}
		}
	}
}
			

		