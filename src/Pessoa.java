import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private String emprego;
    private boolean empregado;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmprego() {
    	return emprego;
    }

    public void setEmprego(String emprego) {
    	this.emprego = emprego;
    }

    public boolean isEmpregado() {
    	return empregado;
    }

    public void setEmpregado(boolean empregado) {
    	this.empregado = empregado;
    }

    public void update(Scanner sc) {
    	System.out.println("\n\nO que você quer mudar?");
    	System.out.println("1 - Nome");
    	System.out.println("2 - Idade");
    	System.out.println("3 - Emprego");
    	System.out.println("4 - Status de trabalho (empregado ou não");

	int opcao = sc.nextInt();
	sc.nextLine();

	switch (opcao) {
		case 1:
    			System.out.println("Digite a nova informação: ");
			this.nome = sc.nextLine();

			break;
		case 2:
		    	System.out.println("Digite a nova informação: ");
			this.idade = sc.nextInt();
			sc.nextLine();

			break;
		case 3:
		    	System.out.println("Digite a nova informação: ");
			this.emprego = sc.nextLine();

			break;
		case 4:
		    	System.out.println("Digite 1 para empregado e 2 para não: ");
			int empregado = sc.nextInt();
			sc.nextLine();
	
			if (empregado == 1) {
				this.empregado = true;
			} else {
				this.empregado = false;
			}

			break;
		default:
			System.out.println("Joia patrão");
    	}
    }

    public void falar(String fala) {
    	System.out.println(this.getNome() + " falou " + fala);
    }
}
