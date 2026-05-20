public class ex07 {}

void main() {
    Scanner sc= new Scanner(System.in);
    IO.println("Digite uma letra pra saber se ela é vogal");
    String vogal = sc.next();

    switch (vogal){
        case "A":
            IO.println("Ela é uma vogal");
            break;

        case "E":
            IO.println("Ela é uma vogal");
            break;

        case "I":
            IO.println("Ela é uma vogal");
            break;

        case "O":
            IO.println("Ela é uma vogal");
            break;

        case "U" :
            IO.println("Ela é uma vogal");
            break;

        default:
            IO.println("Não é uma vogal ");
        }
    }


