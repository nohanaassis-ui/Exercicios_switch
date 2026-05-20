public class ex04 {}

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Digite um número para ser convertido em meses ");
    int meses = sc.nextInt();

    switch (meses){
        case 1:
            IO.println("Mês: janeiro");
         break;

        case 2:
            IO.println("Mês: Fevereiro");
         break;

        case 3:
            IO.println("Mês: Março");
        break;

        case 4:
            IO.println("Mês: Abril");
            break;

        case 5:
            IO.println("Mês:Maio");
            break;

        case 6:
            IO.println("Mês: Junho");
           break;

        case 7:
            IO.println("Mês: Julho");
           break;

        case 8:
            IO.println("Mês: Agosto");
            break;

        case 9:
            IO.println("Mês: Setembro");
            break;

        case 10:
            IO.println("Mês: Outubro");
           break;
        case 11:
            IO.println("Mês: Novembro");
         break;

        case 12:
            IO.println("Mês: Dezembro");
            break;
        default:
            IO.println("Mês não encontrado");
    }
}

