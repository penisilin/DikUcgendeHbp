import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner girdi = new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2.Kenarı Gİriniz : ");
        b = girdi.nextInt();
        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + c);

    }
}