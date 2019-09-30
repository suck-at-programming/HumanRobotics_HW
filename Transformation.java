import java.util.Scanner;
class Transformation{
    public static void main(String[] args){
        System.out.println("-----WARNING-----");
        System.out.println("If you use 'reverse'order or 'print' order,");
        System.out.println("you have to enter '-' after two numbers.");
        System.out.println("e,g.  'print 1 5 -'");
        System.out.println("really SORRY for the inconvenience.");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String n = sc.next();
        if(islower(n) == false){
            System.out.println("Target string has to consist of lower alphabets.");
            System.exit(0);
        }
        if(n.length() > 1000){
            System.out.println("length of the alphabets has to be lower than 1000");
            System.exit(0);
        }
        char[] nlist = new char[n.length()];
        for(int i = 0; i < n.length(); i++){
            nlist[i] = n.charAt(i);
        }
        int q = sc.nextInt();
        if(q > 100){
            System.out.println("amount of orders has to be lower than 100");
            System.exit(0);
        }
        while(q > 0){
            String[] orders = new String[4];
            for(int i = 0; i < 4; i++){
                orders[i] = sc.next();
            }
            if(orders[0].equals("print")){
                int x = Integer.parseInt(orders[1]);
                int y = Integer.parseInt(orders[2]);
                String trush = orders[3];
                if(x > y){
                    System.out.println("something is strange...");
                    System.exit(0);
                }else{
                    nlist = printer(nlist, x, y, trush);
                }
            }else if(orders[0].equals("reverse")){
                int x = Integer.parseInt(orders[1]);
                int y = Integer.parseInt(orders[2]);
                String trush = orders[3];
                if(x > y){
                    System.out.println("something is strange...");
                    System.exit(0);
                }else{
                    nlist = reverser(nlist, x, y, trush);
                }
            }else if(orders[0].equals("replace")){
                int x = Integer.parseInt(orders[1]);
                int y = Integer.parseInt(orders[2]);
                if(x > y){
                    System.out.println("something is strange...");
                    System.exit(0);
                }else{
                    nlist = replacer(nlist, x, y, orders[3]);
                }
            }else{
                System.out.println("order is 'reverse', 'replace', and 'print'.");
                System.exit(0);
            }
            q--;
        }
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
    public static char[] printer(char[] a, int x, int y, String z){
        for(int i = x; i < y + 1 ; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
        return a;
    }
    public static char[] reverser(char[] a, int x, int y, String z){
        int loop = y - x;
        if(loop % 2 == 1){
            loop += 1;
        }else{
        }
        for(int i = 0; i < loop/2; i++){
            char temp = a[x+i];
            a[x+i] = a[y-i];
            a[y-i] = temp;
        }
        return a;
    }
    public static char[] replacer(char[] a, int x, int y, String A){
        int addlength = A.length();
        char[] Alist = new char[addlength];
        for(int i = 0; i < addlength; i++){
            Alist[i] = A.charAt(i);
        }
        if(addlength != y - x + 1){
            System.out.println("replace failure");
            System.exit(0);
        }else{
            for(int i = 0; i < addlength; i++){
                a[i+x] = Alist[i];
            }
        }
        return a;
    }
}
