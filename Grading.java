import java.util.Scanner;
class Grading{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int m;
		int f;
		int r;
		String[] grades = new String[49];
		for(int i = 0; i < 50; i++){
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			if(m > 50 || f > 50 || r > 100){
				System.out.println("middle & final exam's max is 50, and re-exam's max is 100.");
				System.exit(0);
			}

			if(m == -1 && f == -1 && r == -1){
				for(int j = 0; j < i; j++){
					System.out.println(grades[j]);
				}
				System.exit(0);
			}else if(m == -1 || f == 1){
				grades[i] = "F";
			}else if(m + f >= 80){
				grades[i] = "A";
			}else if(m + f < 80 && m + f >= 65){
				grades[i] = "B";
			}else if(m + f < 65 && m + f >= 50){
				grades[i] = "C";
			}else if(m + f < 50 && m + f >= 30){
				if(r >= 50){
					grades[i] = "C";
				}else{
					grades[i] = "D";
				}
			}else{
				grades[i] = "F";
			}
		}
	}
}
		