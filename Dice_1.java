import java.util.Scanner;
class Dice_1{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] numbers = new int[6];
        for(int i = 0; i < 6; i++){
            numbers[i] = sc.nextInt();
            if(numbers[i] > 100){
                System.out.println("the element is too big.");
                System.exit(0);
            }else{
            }
        }
        String orders;
        orders = sc.next();
        if(orders.length() > 100){
            System.out.println("you can't order more than 100 times.");
            System.exit(0);
        }else{
            char[] orderlist = new char[orders.length()];
            for(int i = 0; i < orders.length(); i++){
                orderlist[i] = orders.charAt(i);
                numbers = round(numbers, orderlist[i]);
            }
            System.out.println(numbers[0]);
        }
    }
    public static int[] round(int[] a, char x){
        if(x == 'N'){
            int temp = a[0];
            a[0] = a[1];
            a[1] = a[5];
            a[5] = a[4];
            a[4] = temp;
        }else if(x == 'S'){
            int temp = a[0];
            a[0] = a[4];
            a[4] = a[5];
            a[5] = a[1];
            a[1] = temp;
        }else if(x == 'E'){
            int temp = a[0];
            a[0] = a[3];
            a[3] = a[5];
            a[5] = a[2];
            a[2] = temp;
        }else if(x == 'W'){
            int temp = a[0];
            a[0] = a[2];
            a[2] = a[5];
            a[5] = a[3];
            a[3] = temp;
        }else{
            System.out.println("move failure.");
            System.exit(0);
        }
        return a;
    }
}
