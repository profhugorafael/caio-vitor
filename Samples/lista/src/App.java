import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

    public static void log (List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
//            System.out.println(i + "i");

            System.out.print(numeros.get(i) + ", ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        // Add Item na Lista
        numeros.add(10);
        numeros.add(999);
        numeros.add(1);
        log(numeros);

        // Remover um elemento
        numeros.remove(0);
        numeros.remove((Integer) 999);
        log(numeros);

        // Encontrar a posicao de um ITEM na LISTA
        int posicaoDoUm = numeros.indexOf(1);
        numeros.forEach((numero) -> System.out.println(numero));

        List<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Bia");
        nomes.add("Alice");
        nomes.add("Alberto");
        nomes.add("Ana");
        nomes.add("Marcelo");

        nomes.forEach(nome -> System.out.println(nome));

        Animal cachorro1 = new Animal("Thor", 8, true);
        int a = 2;

        System.out.println(cachorro1);

        List<Animal> animais = new ArrayList<>();
        animais.add(new Animal("Toto", 6, true));
        animais.add(new Animal("Gato", 4, true));
        animais.add(new Animal("Zeca", 4, true));

        animais.forEach(animal -> System.out.print(animal + ", "));
        System.out.println();

        System.out.println(animais);

    }
}