import java.util.Scanner;
class A_B_Problem{
	public static void main(String[] args){
		int a, b;
		int d = 0;
		int r = 0;
		double f = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a <= 1000000000 && b <= 1000000000){
			d = a/b;
			r = a%b;
			f = 1.0*a/b;
		}
		System.out.print(d);
		System.out.print(" ");
		System.out.print(r);
		System.out.print(" ");
		System.out.println(f);
	}
}