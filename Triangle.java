import java.util.Scanner;
class Triangle{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[] numbers = new double[3];
        for(int i = 0; i < 3; i++){
            numbers[i] = sc.nextDouble();
        }
        double a = numbers[0];
        double b = numbers[1];
        double c = numbers[2];
        double acosc = a * Math.cos(Math.toRadians(c));
        double asinc = a * Math.sin(Math.toRadians(c));
        double S = asinc * b;
        System.out.println(S/2);
        double rightS = S - acosc * asinc;
        double x = Math.abs(b - acosc);
        double henD = Math.pow(Math.pow(asinc, 2)+Math.pow(x, 2), 0.5);
        System.out.println(a + b + henD);
        double aheight = S / a;
        System.out.println(aheight);
    }
}
