import java.util.Scanner;
class Ring3{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String letters;
        String word;
        int counter = 0;
        boolean same = false;
        letters = sc.next();
        word = sc.next();
        int letterlength = letters.length();
        int wordlength = word.length();
        char[] letterlist = new char[letterlength*2];
        for(int i = 0; i < letterlength*2; i++){
            letterlist[i] = '0';
        }
        char[] wordlist = new char[wordlength];
        for(int i = 0; i < letterlength; i++){
            letterlist[i] = letters.charAt(i);
        }
        for(int i = letterlength; i < letterlength*2; i++){
            letterlist[i] = letters.charAt(i - letterlength);
        }
        for(int i = 0; i < wordlength; i++){
            wordlist[i] = word.charAt(i);
        }

        start:for(int i = 0; i < letterlength; i++){
            if(wordlist[0] == letterlist[i]){
                for(int j = 1; j < wordlength; j++){
                    if(wordlist[j] == letterlist[i + j]){
                        counter++;
                    }else{
                        continue start;
                    }
                }
            }else{
            }
        }
        if(counter + 1 == wordlength){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

//DONE
