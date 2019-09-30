import java.util.Scanner;
class Simple_Calculator{
	static int sum(int a, int b){
		return(a+b);
	}
	static int sub(int a, int b){
		return(a-b);
	}
	static int mul(int a, int b){
		return(a*b);
	}
	static int div(int a, int b){
		return(a/b);
	} 

	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x, z;
		String y;
		x = sc.nextInt();
		y = sc.next();
		z = sc.nextInt();
		if((x >= 0 && x <= 20000) && (z >= 0 && z <= 20000)){
			int result = 0;
			if(y.equals("+")){
				result = sum(x, z);
				System.out.println(result);
			}else if(y.equals("-")){
				result = sub(x, z);
				System.out.println(result);
			}else if(y.equals("*")){
				result = mul(x, z);
				System.out.println(result);
			}else if(y.equals("/")){
				if(z == 0){
					System.out.println("you can't divide number by 0");
				}else{
					result = div(x, z);
					System.out.println(result);
				}
			}else if(y.equals("?")){
			}
		}else{
			System.out.println("each numbers have to be within 0~20000");
		}
	}
}