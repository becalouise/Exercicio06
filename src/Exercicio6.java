import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // A= pir²/ r²=
        // peça o raio do circulo, calcule e mostre sua area

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o raio ");
        double raio = entrada.nextDouble();
        entrada.close();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área vale: " + area);

    }

}
