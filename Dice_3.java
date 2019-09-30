import java.util.Scanner;
class Dice_3{
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
        int[] numbers2 = new int[6];
        for(int i = 0; i < 6; i++){
            numbers2[i] = sc.nextInt();
            if(numbers2[i] > 100){
                System.out.println("the element is too big.");
                System.exit(0);
            }else{
            }
        }
        for(int j = 0; j < 6; j++){
            for(int k = 0; k < 6; k++){
                if(j == k){
                }else{
                    if(numbers[j] == numbers[k]){
                        System.out.println("you can't enter same number in a Dice.");
                        System.exit(0);
                    }else{
                    }
                }
            }
        }
        for(int j = 0; j < 6; j++){
            for(int k = 0; k < 6; k++){
                if(j == k){
                }else{
                    if(numbers2[j] == numbers2[k]){
                        System.out.println("you can't enter same number in a Dice.");
                        System.exit(0);
                    }else{
                    }
                }
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    for(int l = 0; l < 4; l++){
                        if((numbers[0] == numbers2[0])&&(numbers[1] == numbers2[1])&&(numbers[2] == numbers2[2])&&
                        (numbers[3] == numbers2[3])&&(numbers[4] == numbers2[4])&&(numbers[5] == numbers2[5])){
                            System.out.println("YES");
                            System.exit(0);
                        }else{
                            numbers = round(numbers, 'N');
                        }
                    }
                    numbers = round(numbers, 'W');
                }
                    numbers = round(numbers, 'S');
            }
            numbers = round(numbers, 'E');
        }
        System.out.println("NO");
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
