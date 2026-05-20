public class ex02 {}

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println(" Digite 1 numero ");

    double num1 = sc.nextDouble();
    IO.println("Digite 2 numero ");

    double  num2 = sc.nextDouble();
    IO.println("Digite uma operação");

    String simbolo = sc.next();

    switch (simbolo){
        case "+":
            IO.println(num1 + num2);
            break;

        case "-":
            IO.println(num1 - num2);
            break;

        case "*":
            IO.println(num1 * num2);
            break;

        case "/":
            IO.println(num1 / num2);

        default:
            IO.println("Faça calculos existentes");
    }



}

