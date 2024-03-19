import java.util.Scanner;

public class MathFuncktions {

    static double e,pi;

    public MathFuncktions() {
        e=2.71828182846;
        pi=3.14159265359;
    }


    public static double yuza(double radius){
        return MathFuncktions.pi * radius *radius;
    }
    public static double daraja(int a){
        double s=1;
        e=2.71828182846;
        for (int i = 0; i < a; i++){
            s *= e;
        }
        return s;
    }
    public static boolean uchga_tekshirish(int a,int b,int c){
        if (a + b > c && a + c > b && b + c > a){
            return true;
        }
        else return false;
    }

    public static double uch_periment(int a,int b, int c){
        if (uchga_tekshirish(a,b,c))
            return a + b + c;
        else
            return -1;
    }
    public static double uch_yuzi(int a,int b,int c){
        double s;
        double p = uch_periment(a,b,c) / 2;
        if (uchga_tekshirish(a,b,c)){
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return s;
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println("uchburchak tomonlarini kiriting:");

        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("a:");
        a = scanner.nextInt();
        System.out.print("b:");
        b = scanner.nextInt();
        System.out.print("c:");
        c = scanner.nextInt();
        System.out.println("uchburchak yuzi:" + MathFuncktions.uch_yuzi(a,b,c));
        System.out.println("darajani kiriting");
        int k = scanner.nextInt();
        System.out.println("e^" + k + "=" + MathFuncktions.daraja(k));
    }
}
