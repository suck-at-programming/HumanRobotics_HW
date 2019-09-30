import java.util.Scanner;
class Dice_2_2{
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
        int[] original = numbers;
        int times = sc.nextInt();
        if(times > 24){
            System.out.println("you can't order more than 24 times");
            System.exit(0);
        }
        int realtimes = times;
        int[] answers = new int[times];
        while(times > 0){
            int[] questions = new int[2];
            for(int i = 0; i < 2; i++){
                questions[i] = sc.nextInt();
            }
            int upper = questions[0];
            int front = questions[1];
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    for(int k = 0; k < 4; k++){
                        for(int l = 0; l < 4; l++){
                            if(upper == numbers[0] && front == numbers[1]){
                                answers[times-1] = numbers[2];
                                break;
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
            times--;
        }
        for(int i = realtimes-1; i > -1 ; i--){
            System.out.println(answers[i]);
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
