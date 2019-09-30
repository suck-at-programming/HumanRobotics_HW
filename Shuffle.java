import java.util.Scanner;
class Shuffle{
    public static void main(String[] args){
        int wholecounter = 0;
        while(wholecounter < 10){
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String cards;
            int times;
            cards = sc.next();
            if(cards.equals("-") || cards.length() > 200){
                System.exit(0);
            }
            times = sc.nextInt();
            if(times < 1 || times > 100){
                System.out.println("you have to shuffle at least one time.");
                System.exit(0);
            }
            int[] shuffleNum = new int[times];
            char[] cardlist = new char[cards.length()*2];
            for(int i = 0; i < times; i++){
                shuffleNum[i] = sc.nextInt();
            }
            for(int i = 0; i < cards.length()*2; i++){
                if(i < cards.length()){
                    cardlist[i] = cards.charAt(i);
                }else{
                    cardlist[i] = '0';
                }
            }
            for(int i = 0; i < times; i++){
                shuffle(cardlist,cardlist.length, shuffleNum[i]);
            }
            for(int i = 0; i < cards.length(); i++){
                System.out.print(cardlist[i]);
            }
            System.out.println("");
            wholecounter++;
        }

    }
    static char[] shuffle(char[] A,int x, int y){
        for(int i = 0; i < y; i++){
            A[x/2 + i] = A[i];
        }
        for(int i = 0; i < x; i++){
            if(i < x/2){
                A[i] = A[i+y];
            }else{
                A[i] = '0';
            }
        }
        return A;
    }
}
