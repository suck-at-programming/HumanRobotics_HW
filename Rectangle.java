class Rectangle{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if((a >=1) && (b <= 100)){
			System.out.print(a*b);
			System.out.print(" ");
			System.out.println((a+b)*2);
		}else{
			System.out.println("first letter have to be upper 1, and second letter have to be under 100");
		}
	}
}
