import java.util.Scanner;
class Finding_Missing_Cards{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] spade = new int[13];
		int[] heart = new int[13];
		int[] crab  = new int[13];
		int[] dia   = new int[13];
		for(int i =0; i < 13; i++){
			spade[i] = 0;
		} 
		for(int i =0; i < 13; i++){
			heart[i] = 0;
		} 
		for(int i =0; i < 13; i++){
			crab[i] = 0;
		} 
		for(int i =0; i < 13; i++){
			dia[i] = 0;
		} 

		int amount_of_cards = 0;
		String pattern;
		int number_of_card = 0;

		amount_of_cards = sc.nextInt();
		for(int i =0; i < amount_of_cards; i++){
			pattern = sc.next();
			number_of_card = sc.nextInt();
			if(pattern.equals("S")){
				spade[number_of_card-1] = number_of_card;
			}else if(pattern.equals("H")){
				heart[number_of_card-1] = number_of_card;
			}else if(pattern.equals("C")){
				crab[number_of_card-1] = number_of_card;
			}else if(pattern.equals("D")){
				dia[number_of_card-1] = number_of_card;
			}else{
				i = amount_of_cards;
			}
		}
		System.out.println("-----OUTPUT------");
		for(int i = 0; i < 13; i++){
			if(spade[i] == 0){
				System.out.println("S " + (i+1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(heart[i] == 0){
				System.out.println("H " + (i+1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(crab[i] == 0){
				System.out.println("C " + (i+1));
			}
		}
		for(int i = 0; i < 13; i++){
			if(dia[i] == 0){
				System.out.println("D " + (i+1));
			}
		}
	}
}