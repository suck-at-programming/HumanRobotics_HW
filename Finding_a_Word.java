import java.util.Scanner;
class Finding_a_Word{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String w;
        String[] text;
        int count = 0;
        w = sc.next();
        int i = 0;
        do{
            text = new String[1000];
            text[i] = sc.next();
            if(text[i].equalsIgnoreCase(w)){
                count++;
            }
            if(i >=1000){
                System.out.println("you entered too much...");
                System.exit(0);
            }
        }while(i < 1000 && text[i].equals("END_OF_TEXT") == false);
        System.out.println(count);
    }
}
