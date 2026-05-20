public class ex06 {}

void main() {

    Scanner sc = new Scanner(System.in);
    IO.println("Escolha o curso que deseja para uma breve descrição");
    IO.println(" 1-Java \n 2-Banco de dados\n 3-Desenvolvimento web\n 4-Redes\n");
    String cursos = sc.next();

    switch (cursos){

        case "1":
            IO.println("Curso de linguagem de progração em java ,realizar a parte interna back-end");
            break;

        case "2":
            IO.println("Armazenamento de dados em uma nuvem etc.");
            break;

        case "3" :
            IO.println("Terá o aprendizado de criação de páginas");

        case "4":
            IO.println(" Ter um conhecimento sobre endereco de ip, como cada conexão funciona, dhcp,como cabos funciona,");
    }
}

