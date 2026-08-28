public class Main {
    public static void main(String[] args) {
        Pessoa cleitinho = new Pessoa();
        System.out.println(cleitinho.getIdade() + " " + cleitinho.getNome());

        cleitinho.setIdade(43);
        cleitinho.setNome("cleyton");
        System.out.println(cleitinho.getIdade() + " " + cleitinho.getNome());

        Pessoa felipeFeliciano = new Pessoa("FelipeGostoso",21);
        System.out.println(felipeFeliciano.getNome() + " " + felipeFeliciano.getIdade());

    }
}