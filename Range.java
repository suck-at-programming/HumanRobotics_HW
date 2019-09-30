class Range{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if(((a >= 0) && (a <= 100)) && ((b >= 0) && (b <= 100)) && ((c >= 0) && (c <= 100))){
			if(((a < b) && (b < c)) == true){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}else{
			System.out.println("three numbers have to be within 0~100");
		}
	}
}