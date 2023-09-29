public class Pessoa {
    private String nome;
    private double altura;

    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }
    
    public String getNome() {
        return nome;
    }

    
    
}



