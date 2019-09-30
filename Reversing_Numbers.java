import java.util.Scanner;
class Reversing_Numbers{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = 100;
		int[] list;
		int[] list2;
		list = new int[n];
		list2 = new int[n];
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			list[i] = sc.nextInt();

			if(list[i] >= 0 && list[i] <= 1000){
				list2[i] = list[i];
			}else{
				System.out.println("list numbers have to be within 0~1000");
			}

		}
		for(int i = n-1; i >= 1; i--){
			System.out.print(list2[i] + " ");
		}
		System.out.println(list2[0]);
	}
}
			