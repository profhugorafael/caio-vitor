public class Animal {
    private String nome;
    private int idade;
    private boolean domestico;

    public Animal() {
    }

    public Animal(String nome, int idade, boolean domestico) {
        this.nome = nome;
        this.idade = idade;
        this.domestico = domestico;
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

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", domestico=" + domestico +
                '}';
    }
}
