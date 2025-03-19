
public class Pessoa {

    // atributos (tem)
    public String nome;
    public String cpf;
    public int idade;
    public String apelido;

    // metodo construtor
    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, int idade, String apelido) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.apelido = apelido;
    }

    // metodos (faz)
    public void dizerOi(String outroNome) {
        System.out.println("Oi, " + outroNome + ", me chamo " + nome);
    }

    public double somar(double a, double b) {
        return a+b;
    }

    public double somar(double a, double b, double c) {
        return a + b + c;
    }

    public void fazerAniversario() {
        idade++;
    }
}
