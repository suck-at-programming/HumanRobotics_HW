class Xcubic{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		if(x <= 100){
			System.out.println(x*x*x);
		}else{
			System.out.println("input value have to be under 100");
		}
	}
}