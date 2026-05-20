public class ex10 {}

void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Menu Administrativo\n1-Cadastrar usuário\n2-Listar usuários\n3-Atualizar usuário\n4-Excluir usuário\n0-Encerrar sistema");

    String usuario = sc.next();

    switch (usuario){
        case "1":
            IO.println("Processando");
            break;
        case "2":
            IO.println("Nicolas,Lorenzo,Isis,Natielie,Evellyn");
            break;

        case"3":
            IO.println("Atualizando usuário");
            break;

        case "4":
            IO.println("Excluindo usuário");
            break;

        default:
            IO.println("Você saiu do Menu Administrador");
    }
}

