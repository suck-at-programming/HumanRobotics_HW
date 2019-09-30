import java.util.Scanner;
class Print_Test_Cases{
	public static void main(String[] args){
		int[] database;
		database = new int[10000];
		for(int i = 1; i<10001; i++){
			java.util.Scanner sin = new java.util.Scanner(System.in);
			int data = sin.nextInt();
			if((data<10001) && (data>0)){
				database[i] = data;
				System.out.println("Case " + i +": " + database[i]);
			}else{
				System.out.println("the number have to be within 1~10000");
			}
		}
	}
}
	