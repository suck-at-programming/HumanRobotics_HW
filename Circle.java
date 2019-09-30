import java.util.Scanner;
class Circle{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int r;
		double area = 0;
		double cir = 0;
		r = sc.nextInt();
		if(r > 0 && r < 10000){
			area = r*r*Math.PI;
			cir = 2*r*Math.PI;
			System.out.print(String.format("%.6f", area));
			System.out.print(" ");
			System.out.println(String.format("%.6f", cir));
		}else{
			System.out.println("radius has to be within 0~10000");
		}
	}
}