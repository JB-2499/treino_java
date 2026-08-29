import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private String emprego;
    private boolean empregado;

    public int funcao(int idade) {
        idade += 1;
        return idade;
    }

    public int funcao(int idade, String nome) {
        idade += 2;
        System.out.println(nome);
        return idade;
    }

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static Pessoa criarPessoa(Scanner sc) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite o nome:");
        pessoa.nome = sc.nextLine();
        System.out.println("Digite a idade:");
        pessoa.idade = sc.nextInt();
        sc.nextLine();
        return pessoa;
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

    public void falar(String fala) {
    	System.out.println(nome + " falou: " + fala);
    }
}
