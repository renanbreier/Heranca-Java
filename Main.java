import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção desejada: \n1 - Quadrado \n2 - Triângulo Equilátero \n3 - Cubo \n4 - Tetraedro");
        int opcao = scanner.nextInt();
        Forma forma;
        switch (opcao) {
            case 1:
                System.out.println("Digite o tamanho do lado do quadrado: ");
                double ladoQuadrado = scanner.nextDouble();
                forma = new Quadrado("Quadrado", 4, ladoQuadrado, ladoQuadrado);
                break;

            case 2:
                System.out.println("Digite o tamanho do lado do triângulo equiláreo: ");
                double ladoTrianguloEquilatero = scanner.nextDouble();
                forma = new TrianguloEquilatero("Triângulo Equilátero", 3, ladoTrianguloEquilatero, ladoTrianguloEquilatero);
                break;

            case 3:
                System.out.println("Digite a altura do cubo: ");
                double alturaCubo = scanner.nextDouble();
                forma = new Cubo("Cubo", 6, alturaCubo, alturaCubo, alturaCubo);
                break;

            case 4:
                System.out.println("Digite a altura do tetraedro: ");
                double alturaTetraedro = scanner.nextDouble();
                forma = new Tetraedro("Tetraedro", 4, alturaTetraedro, alturaTetraedro, alturaTetraedro);
                break;

            default:
                System.out.println("Opção Inválida!");
                return;
        }
        System.out.println("Área " + forma.area());
        System.out.println("Volume: " + forma.volume());
    }
}