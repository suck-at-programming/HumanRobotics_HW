class Watch{
	public static void main(String[] args){
		int sum_of_second = Integer.parseInt(args[0]);
		if((sum_of_second >= 0) && (sum_of_second <= 86400)){
			int h = sum_of_second / 3600;
			sum_of_second = sum_of_second - h*3600;

			int m = sum_of_second / 60;
			sum_of_second = sum_of_second - m*60;
		
			int s = sum_of_second;
			System.out.println(h + ":" + m + ":" + s);
		}else{
			System.out.println("input number a have to be 0<=a<=86400");
		}
	}
}