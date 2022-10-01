import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double metros = 0.0f;
        double centimetros = 0.0f;

        System.out.println("Digite um valor em Metros para converte-lo em Centimetros: ");
        metros = sc.nextDouble();

        centimetros = metros *100;

        System.out.println(metros +" metro(s) em centimetros e: " + centimetros+" centimetros");

    }
}