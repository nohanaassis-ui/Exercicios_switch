public class ex09 {}

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Escolha uma opção para seu desempenho no curso\nA-Excelente\nB-Bom\nC-Regular\nD-Ruim");
    String categorias= sc.next();

    switch (categorias){
        case "A":
            IO.println("Excelente");
            break;

        case "B":
            IO.println("Bom");
            break;

        case "C":
            IO.println("Regular");
            break;

        case "D":
            IO.println("Ruim");
            break;


     }
}

