import java.util.Scanner;
class Dice_4{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int amount = sc.nextInt();
        int[][] dices = new int[amount][6];
        for(int i = 0; i < amount; i++){
            for(int j = 0; j < 6; j++){
                dices[i][j] = sc.nextInt();
                if(dices[i][j] > 100){
                    System.out.println("the element is too big.");
                    System.exit(0);
                }else{
                }
            }
        }
        int[] rollingdice = new int[6];
        for(int x = 0; x < amount; x++){
            for(int b = 0; b < 6; b++){
                rollingdice[b] = dices[x][b];
            }
            outside:for(int comparediceNum = 0; comparediceNum < amount; comparediceNum++){
                for(int i = 0; i < 4; i++){
                    for(int j = 0; j < 4; j++){
                        for(int k = 0; k < 4; k++){
                            for(int l = 0; l < 4; l++){
                                if(x == comparediceNum){
                                    continue outside;
                                }
                                if((rollingdice[0] == dices[comparediceNum][0])&&(rollingdice[1] == dices[comparediceNum][1])&&(rollingdice[2] == dices[comparediceNum][2])&&
                                (rollingdice[3] == dices[comparediceNum][3])&&(rollingdice[4] == dices[comparediceNum][4])&&(rollingdice[5] == dices[comparediceNum][5])){
                                    System.out.println("NO");
                                    System.exit(0);
                                }else{
                                    rollingdice = round(rollingdice, 'N');
                                }
                            }
                            rollingdice = round(rollingdice, 'W');
                        }
                        rollingdice = round(rollingdice, 'S');
                    }
                    rollingdice = round(rollingdice, 'E');
                }
            }
        }
        System.out.println("YES");
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
