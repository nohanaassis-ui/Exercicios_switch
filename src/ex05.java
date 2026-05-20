public class ex05 {}

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Qual é seu tipo de classificação \nA- Administrador\nF funcionario\nC-cliente");
    String usuarios = sc.next();

    switch (usuarios){

        case "A":
            IO.println("Total acesso ao sistema ");
            break;

        case "F":
            IO.println("Acesso parcial do sistema");
            break;

        case "C":
            IO.println("Acesso somente a pagina inicial");

        default:
            IO.println("Usuário inesxistente");
    }


}

