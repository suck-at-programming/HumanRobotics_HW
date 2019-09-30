import java.util.Scanner;
class Counting_Characters{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int howmany;
        System.out.println("How many words will you enter?");
        howmany = sc.nextInt();
        String[] words;
        words = new String[1200];
        char[] letters;
        letters = new char[40];
        char[] uppers;
        uppers = new char[26];
        char[] lowers;
        lowers = new char[26];
        int[] answer = new int[26];
        char x = 'A';
        char y = 'a';
        for(int i = 0; i <= ('Z'-'A'); i++){
            uppers[i] = (x++);
        }
        for(int i = 0; i <= ('z'-'a'); i++){
            lowers[i] = (y++);
        }


        for(int i = 0; i < howmany; i++){
            words[i] = sc.next();
            for(int j = 0; j < words[i].length(); j++){
                letters[j] = words[i].charAt(j);
                for(int k = 0; k < 26; k++){
                    if(letters[j] == uppers[k] || letters[j] == lowers[k]){
                        answer[k]++;
                    }else{
                    }
                }
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.println(lowers[i] + " : " + answer[i]);
        }
    }
}
