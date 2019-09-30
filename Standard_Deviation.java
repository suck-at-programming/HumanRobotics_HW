import java.util.Scanner;
class Standard_Deviation{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n;
        n = sc.nextInt();
        if(n == 0){
            System.exit(0);
        }
        if(n > 1000){
            System.out.println("students are too much");
            System.exit(0);
        }
        int[] scores = new int[n];
        double average = 0;
        double variance = 0;
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
            average += scores[i];
        }
        average = average / n;
        for(int i = 0; i < n; i++){
            variance += Math.pow((average - scores[i]), 2);
        }
        variance = variance / n;
        double deviation = Math.pow(variance, 0.5);
        System.out.println(deviation);
    }
}
