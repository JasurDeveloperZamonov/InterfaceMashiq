import java.util.Scanner;

public class Convertor implements ToFarangeyt,ToKelvin {
Scanner scanner=new Scanner(System.in);
    @Override
    public void SelsiyToFarangeyt() {
        System.out.print("Selsiyda Gradusni Kiriting: ");
        double gradus=scanner.nextInt();
        System.out.println();
        double F;
        F=((9.0/5.0)*gradus)+32;
        System.out.println("Farangeyt="+F);
    }

    @Override
    public void SelsiyToKelvin() {
        System.out.print("Selsiyda Gradusni Kiriting: ");
        double gradus=scanner.nextInt();
        System.out.println();
        double K;
        K=gradus+273.15;
        System.out.println("Kelvin="+K);
    }
}
