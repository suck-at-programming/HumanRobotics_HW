class Sort{
	static void sort(int[] array){
		for(int i = 0; i<array.length-1; i++){
			for(int j = array.length-1; j>i; j--){
				if(array[j-1]>array[j]){
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args){
		int[] numbers = new int[3];
		for(int i = 0; i<numbers.length-1; i++){
			numbers[i] = 0;
		}
		numbers[0] = Integer.parseInt(args[0]);
		numbers[1] = Integer.parseInt(args[1]);
		numbers[2] = Integer.parseInt(args[2]);
		if   (  ((numbers[0]<10000) && (numbers[0] > 0)) &&
			((numbers[1]<10000) && (numbers[1] > 0)) &&
			((numbers[2]<10000) && (numbers[2] > 0))  ){
			sort(numbers);
			for(int i = 0; i < numbers.length; i++){
				System.out.println(numbers[i]);
			}
		}else{
			System.out.println("each numbers have to be within 0~10000");
		}
	}
}