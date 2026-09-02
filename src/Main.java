import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        Pessoa cleitinho = new Pessoa();

        cleitinho.setIdade(43);
        cleitinho.setNome("cleyton");

	cleitinho.falar("Maneiro cara");

	cleitinho.update(sc);
	sc.close();
    }
}
