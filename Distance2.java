import java.util.Scanner;
class Distance2{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0 || n > 100){
            System.out.println("dimention of vectors have to be 1~100.");
            System.exit(0);
        }
        int[] vectorX = new int[n];
        int[] vectorY = new int[n];
        for(int i = 0; i < n; i++){
            vectorX[i] = sc.nextInt();
            if(vectorX[i] > 1000 || vectorX[i] < 0){
                System.out.println("vercor elements have to be 1 ~ 1000.");
                System.exit(0);
            }
        }
        for(int i = 0; i < n; i++){
            vectorY[i] = sc.nextInt();
            if(vectorY[i] > 1000 || vectorY[i] < 0){
                System.out.println("vercor elements have to be 1 ~ 1000.");
                System.exit(0);
            }
        }
        double distance1 = 0;
        double distance2 = 0;
        double distance3 = 0;
        double[] distanceMax = new double[n];
        for(int i = 0; i < n; i++){
            distanceMax[i] = Math.abs(vectorX[i] - vectorY[i]);
            distance1 += distanceMax[i];
            distance2 += Math.pow(distanceMax[i], 2);
            distance3 += Math.pow(distanceMax[i], 3);
        }
        distance2 = Math.pow(distance2, 0.5);
        distance3 = Math.pow(distance3, 0.3333333333333333);
        for(int i = 1; i < n; i++){
            if(distanceMax[0] < distanceMax[i]){
                distanceMax[0] = distanceMax[i];
            }else{
            }
        }
        System.out.println(distance1);
        System.out.println(distance2);
        System.out.println(distance3);
        System.out.println(distanceMax[0]);
     }
}
