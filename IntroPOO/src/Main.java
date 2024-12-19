
public class Main {

    public static void main(String[] args) {
       Pessoa p1 = new Pessoa("Joao", "111.222.333-44", 30);
       Pessoa p2 = new Pessoa("Pedro", "111.222.333-45", 20);

       p1.idade = -4000;

       // 8 11 17 21

//       p1.nome = "Joao";
//       p1.cpf = "111.222.333-44";
//       p1.idade = 30;

       p1.fazerAniversario();

       p1.dizerOi("Alice");

       double resultado = p1.somar(2, 3);
        System.out.println(resultado);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("CPF: " + p1.cpf);
    }
}