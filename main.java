import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                double a = sc.nextDouble();
                System.out.print("Introduce el segundo número: ");
                double b = sc.nextDouble();
                double resultado = 0;
                try {
                    switch (opcion) {
                        case 1:
                            resultado = calc.sumar(a, b);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 2:
                            resultado = calc.restar(a, b);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 3:
                            resultado = calc.multiplicar(a, b);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 4:
                            resultado = calc.dividir(a, b);
                            System.out.println("Resultado: " + resultado);
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (opcion != 0) {
                System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        System.out.println("¡Hasta luego!");
        sc.close();
    }
}