public class ex08 {}

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("CAIXA ELETRÔNICO");
    IO.println("Escolha uma opção\n1-Consultar saldo\n2-Sacar Dinheiro\n3-Depositar dinheiro\n4-Sair\n");
    String opcoes = sc.next();

    switch (opcoes){
        case "1":
            IO.println("Consultar Saldo");
            break;

        case "2":
            IO.println("Sacar dinheiro");
            break;

        case "3":
            IO.println("Depositar Dinheiro");
            break;

        case "4":
            IO.println("Sair");
    }
}

