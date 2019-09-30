import java.util.Scanner;
class Card_Game2{
    public static void main(String[] args){
        String[] list = new String[6];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n > 1000){
            System.out.println("Your cards are within 1000 each.");
            System.exit(0);
        }
        String[] Tcard = new String[n];
        String[] Hcard = new String[n];
        int Tscore = 0;
        int Hscore = 0;
        for(int i = 0; i < n*2; i++){
            list[i] = sc.next();
            if(list[i].length() > 100){
                System.out.println("Name of the animal is too long:< Please enter within 100 letters:)");
                System.exit(0);
            }
        }
        for(int i = 0; i < n; i++){
            Tcard[i] = list[i * 2];
            Hcard[i] = list[(i * 2) + 1];
            int judge = 0;
            if(islower(Tcard[i]) == true && islower(Hcard[i]) == true){
                judge = Tcard[i].compareTo(Hcard[i]);
                if(judge > 0){
                    Tscore += 3;
                }else if(judge < 0){
                    Hscore += 3;
                }else{
                    Tscore += 1;
                    Hscore += 1;
                }
            }else{
                System.out.println("You can enter only lower alphabets.");
                System.exit(0);
            }
        }
        System.out.print(Tscore);
        System.out.print(" ");
        System.out.println(Hscore);
    }
    public static boolean islower(String a){
        int length = a.length();
        char[] list = new char[length];
        int lowcounter = 0;
        boolean isLower;
        char[] lowers = new char[26];
        char y = 'a';
        for(int i = 0; i <= ('z'-'a'); i++){
            lowers[i] = (y++);
        }
        for(int i = 0; i < length; i++){
            list[i] = a.charAt(i);
        }
        for(int i = 0; i < length; i++){
            for(int j = 0; j < 26; j++){
                if(list[i] == lowers[j]){
                    lowcounter++;
                    j = 26;
                }else{
                }
            }
        }
        if(lowcounter == length){
            isLower = true;
        }else{
            isLower = false;
        }
        return isLower;
    }
}
