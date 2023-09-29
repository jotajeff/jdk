public class Aluno {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 1.80);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Altura: " + pessoa1.getAltura());
        pessoa1.andar();
        
        
        
    }
}

