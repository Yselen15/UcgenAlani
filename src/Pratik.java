import java.util.Scanner ;
public class Pratik {
    public static void main(String[] args) {
        int a , b , c ;


        Scanner inp = new Scanner(System.in);
        System.out.print("a kenarını giriniz :");
        a = inp.nextInt();

        System.out.print("b kenarını giriniz");
        b = inp.nextInt();

        System.out.print("c kenarını giriniz");
        c = inp.nextInt();

        double u = (a+b+c) / 2 ;

        double Alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.print(" Alanımız " + Alan );

    }
}
