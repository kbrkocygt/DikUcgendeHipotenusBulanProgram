import java.util.Scanner;

public class DikUcgenHipotenusBulanPrg {
    public static void main(String[] args) {
         //Dik ucgen alanı bulma
        int a, b;
        double hipotenus;
        Scanner input=new Scanner(System.in);
        System.out.print("a kenarını giriniz:");
        a=input.nextInt();
        System.out.println("b kenarını giriniz:");
        b=input.nextInt();
        hipotenus= Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs: "+hipotenus);
    }
}
