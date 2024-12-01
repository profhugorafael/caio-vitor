import java.util.Scanner;

public class Main {

    public static void criarCarro(Scanner teclado, int posicaoVazia, String[] modelos, String[] marcas, int[] anos, String[] placas, String[] donos) {
        System.out.print("Digite o modelo do carro: ");
        String modelo = teclado.nextLine();

        System.out.print("Digite a fabricante do carro: ");
        String marca = teclado.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite a placa do carro: ");
        String placa = teclado.nextLine();

        System.out.print("Digite o dono do carro: ");
        String dono = teclado.nextLine();

        modelos[posicaoVazia] = modelo;
        marcas[posicaoVazia] = marca;
        anos[posicaoVazia] = ano;
        placas[posicaoVazia] = placa;
        donos[posicaoVazia] = dono;
    }

    public static void exibirCarros(int quantiddade, String[] modelos, String[] marcas, int[] anos, String[] placas, String[] donos) {
        for(int i = 0; i < quantiddade; i++) {
            System.out.println("Fabricante: " + marcas[i] + ", Modelo: " + modelos[i] + " " + anos[i]);
            System.out.println("Placa: " + placas[i] + ", Dono: " + donos[i]);
            System.out.println("-");
        }
    }

    public static void buscarPelaPlaca(Scanner teclado, int quantidade, String[] modelos, String[] marcas, int[] anos, String[] placas, String[] donos) {
        System.out.print("Digite uma placa para buscar: ");
        String placaParaBuscar = teclado.nextLine();

        // TODO: validar antes de buscar se a placa esta no formato

        for (int i = 0; i < quantidade; i++) {
            if( placaParaBuscar.equals(placas[i]) ) {
                System.out.println("Fabricante: " + marcas[i] + ", Modelo: " + modelos[i] + " " + anos[i]);
                System.out.println("Placa: " + placas[i] + ", Dono: " + donos[i]);
                System.out.println("-");
            }
        }


    }

    public static int escolherOpcaoMenu(Scanner teclado) {
        System.out.println("1 - para cadastrar um carro");
        System.out.println("2 - para exibir todos os carros cadastrados");
        System.out.println("3 - para buscar pela placa");
        System.out.println("0 - para sair");

        System.out.print("digite sua opcao: ");

        int opcao = teclado.nextInt();
        teclado.nextLine();

        return opcao;
    }

    public static void main(String[] args) {
        // Crud = Create Read Update Delete

        // Tasks:
        // - Criar carro OK
        // - Ler todos os carros OK
        // - buscar um carro pela placa OK
        // - deletar um carro
        // - atualizar o dono de um carro

        Scanner teclado = new Scanner(System.in);

        int capacidade = 100;
        int posicaoVazia = 0;

        String[] modelos = new String[capacidade];
        String[] marcas = new String[capacidade];
        int[] anos = new int[capacidade];
        String[] placas = new String[capacidade];
        String[] donos = new String[capacidade];

        int opcao = escolherOpcaoMenu(teclado);

        while(opcao != 0) {
            System.out.println("------------------------");
            switch (opcao) {
                case 1 -> criarCarro(teclado, posicaoVazia++, modelos, marcas, anos, placas, donos);
                case 2 -> exibirCarros(posicaoVazia, modelos, marcas, anos, placas, donos);
                case 3 -> buscarPelaPlaca(teclado, posicaoVazia, modelos, marcas, anos, placas, donos);
                default -> System.out.println("Opcao invalida!");
            }
            System.out.println("------------------------");

            opcao = escolherOpcaoMenu(teclado);
        }

        System.out.println("Ate logo!");
//        criarCarro(teclado, posicaoVazia++, modelos, marcas, anos, placas, donos);

    }
}

