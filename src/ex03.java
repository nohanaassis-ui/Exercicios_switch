public class ex03 {}

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Bem vindo a Hamburgueria Assis, Faça seu pedido");

    IO.println( " 1 -X burger R$15,00 \n 2 - X-salada R$18,00 \n 3 - Refrigerante R$7,00\n 4- Batata frita R$12,00\n" );

    int escolha = sc.nextInt();


    switch (escolha){
        case 1:
            IO.println(" 1-X burger R$15,00");
           break;

        case 2:
            IO.println( " 2- X-salada R$18,00");
           break;

        case 3:
            IO.println( " 3- Refrigerante R$7,00");
           break;

        case 4:
            IO.println(" 4- Batata frita R$12,00");
         break;

        default:
            IO.println("Produto não encontrado");
            break;
    }
}

