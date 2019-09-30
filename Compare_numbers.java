class Compare_numbers{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if((a>=-1000) && (b<=1000)){
			if((a < b)==true){
				System.out.println("a < b");
			}else if((a > b)==true){
				System.out.println("a > b");
			}else{
				System.out.println("a == b");
			}
		}else{
			System.out.println("conditions are -1000 ≤ a, b ≤ 1000");
		}
	}
}
		