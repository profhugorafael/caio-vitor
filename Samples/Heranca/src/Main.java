import model.Caminhao;
import model.Moto;
import model.Veiculo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // abstracao
        // encapsulamento
        // herança
        // polimorfismo

        // Integer { private int number; }
        // wrapper class = classe embrulhadora
        Integer a = 2;
        String nome = "Caio";
        // upcasting -> up (pra cima) -> mencionando o objeto como sua classe mae
        Veiculo v1 = new Moto();
        // enviarMensagem(new MensagemDeAudio()); // Mensagem mensagem = new MensagemDeAudio()

        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for(int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        List<Moto> motos = new ArrayList<>();

        Moto m2 = new Moto(
                "abc1d23",
                "mt-03 connected abs",
                "preta",
                2024,
                300,
                false
        );


        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(m2);
        veiculos.add(new Caminhao());

        motos.add(m2);

       Moto m1 = new Moto();
       Caminhao c1 = new Caminhao();

       m1.setPezinhoLevantado(true);
       m1.ligar();
       c1.ligar();

       System.out.println(m1.isLigado());
       System.out.println(c1.isLigado());

    }
}