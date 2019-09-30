import java.util.Scanner;
class Distance{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[] numbers = new double[4];
        for(int i = 0; i < 4; i++){
            numbers[i] = sc.nextFloat();
        }
        double answer;
        double answer2;
        double realanswer;
        answer = Math.pow((numbers[0]-numbers[2]), 2);
        answer2 = Math.pow((numbers[1]-numbers[3]), 2);
        realanswer = Math.pow((answer + answer2), 0.5);
        System.out.println(realanswer);
    }
}
