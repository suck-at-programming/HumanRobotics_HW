import java.util.Scanner;
class Min_Max_Sum{
	public static void main(String[] args){
		int x;
		int[] list;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		x = sc.nextInt();
		list = new int[x];
		for(int i = 0; i < x; i++){
			if(list[i] <= 1000000 && list[i] >= -1000000){
				list[i] = sc.nextInt();
			}else{
				System.out.println("list numbers have to be within -1000000~1000000");
			}
		}
		System.out.print(min(list));
		System.out.print(" ");
		System.out.print(max(list));
		System.out.print(" ");
		System.out.println(sum(list));
	}
	public static int max(int[] args){
		int max = -1000000;
		for(int i = 0; i < args.length; i++){
			if(max < args[i]){
				max = args[i];
			}else{
			}
		}
		return max;
	}
	public static int min(int[] args){
		int min = 1000000;
		for(int i = 0; i < args.length; i++){
			if(min > args[i]){
				min = args[i];
			}else{
			}
		}
		return min;
	}
	public static int sum(int[] args){
		int sum = 0;
		for(int i = 0; i < args.length; i++){
			sum = sum + args[i];
		}
		return sum;
	}
}