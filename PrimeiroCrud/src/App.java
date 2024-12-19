import java.util.Scanner;

class Carro {
     // atributos (tem...)
    String modelo;
    String fabricante;
    int ano;
    String placa;
    String dono;

    // construtor
    Carro(String modeloInput, String fabricanteInput, int anoInput, String placaInput, String donoInput) {
        modelo = modeloInput;
        fabricante = fabricanteInput;
        ano = anoInput;
        placa = placaInput;
        dono = donoInput;
    }
}

public class App {

    public static void exibirCarro(int id, String modelo, String marca, int ano, String placa, String dono) {
        System.out.println("ID: " + id + ", Fabricante: " + marca + ", Modelo: " + modelo + " " + ano);
        System.out.println("Placa: " + placa + ", Dono: " + dono);
        System.out.println("-");
    }

    public static void criarCarro(Scanner teclado, int posicaoVazia, Carro[] carros) {
        System.out.print("Digite o modelo do carro: ");
        String modelo = teclado.nextLine();

        System.out.print("Digite a fabricante do carro: ");
        String fabricante = teclado.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite a placa do carro: ");
        String placa = teclado.nextLine();

        System.out.print("Digite o dono do carro: ");
        String dono = teclado.nextLine();

        Carro c1 = new Carro(
                "Etios",
                "toyota",
                2024,
                "abc123",
                "Pedro"
        );

        carros[posicaoVazia] = new Carro(modelo, fabricante, ano, placa, dono);
    }

//    public static void exibirCarros(int quantidade, String[] modelos, String[] marcas, int[] anos, String[] placas, String[] donos) {
//        for(int i = 0; i < quantidade; i++) {
//            exibirCarro(i, modelos[i], marcas[i], anos[i], placas[i], donos[i]);
//        }
//    }
//
//    public static void buscarPelaPlaca(Scanner teclado, int quantidade, String[] modelos, String[] marcas, int[] anos, String[] placas, String[] donos) {
//        System.out.print("Digite uma placa para buscar: ");
//        String placaParaBuscar = teclado.nextLine();
//
//        // TODO: validar antes de buscar se a placa esta no formato
//
//        for (int i = 0; i < quantidade; i++) {
//            if( placaParaBuscar.equals(placas[i]) ) {
//                exibirCarro(i, modelos[i], marcas[i], anos[i], placas[i], donos[i]);
//            }
//        }
//    }
//
//    public static void deletarCarro(Scanner teclado, int quantidade, String[] modelos, String[] marcas, int[] anos, String[] placas, String[] donos) {
//        exibirCarros(quantidade, modelos, marcas, anos, placas, donos);
//        System.out.print("Escolha um id para deletar: ");
//        int idParaDeletar = teclado.nextInt();
//        teclado.nextLine();
//
//        if(idParaDeletar < 0 || idParaDeletar > quantidade) {
//            System.out.println("escolha um id valido!");
//            return;
//        }
//
//        if(modelos[idParaDeletar] == null) {
//            System.out.println("não há elemento para deletar neste id");
//            return;
//        }
//
//        modelos[idParaDeletar] = null;
//        marcas[idParaDeletar] = null;
//        anos[idParaDeletar] = 0;
//        placas[idParaDeletar] = null;
//        donos[idParaDeletar] = null;
//    }
//
//    public static void atualizarDonoCarro(Scanner teclado, int quantidade, String[] modelos, String[] marcas, int[] anos, String[] placas, String[] donos) {
//        exibirCarros(quantidade, modelos, marcas, anos, placas, donos);
//        System.out.print("Escolha um id para atualizar: ");
//        int idParaAtualizar = teclado.nextInt();
//        teclado.nextLine();
//
//        if(idParaAtualizar < 0 || idParaAtualizar > quantidade) {
//            System.out.println("escolha um id valido!");
//            return;
//        }
//
//        if(modelos[idParaAtualizar] == null) {
//            System.out.println("não há elemento para atualizar neste id");
//            return;
//        }
//
//        System.out.print("Digite o nome do novo dono: ");
//        String novoDono = teclado.nextLine();
//        donos[idParaAtualizar] = novoDono;
//    }

    public static int escolherOpcaoMenu(Scanner teclado) {
        System.out.println("1 - para cadastrar um carro");
        System.out.println("2 - para exibir todos os carros cadastrados");
        System.out.println("3 - para buscar pela placa");
        System.out.println("4 - para deletar um carro");
        System.out.println("5 - para atualizar o dono de um carro");
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

        int a = 2, b = 3;
        int temp = a;
        a = b;
        b = temp;

        // class = Classificacao, Molde, Tipo personalizado

        Carro[] carros = new Carro[capacidade];

        int opcao = escolherOpcaoMenu(teclado);

        while(opcao != 0) {
            System.out.println("------------------------");
            switch (opcao) {
                case 1 -> criarCarro(teclado, posicaoVazia++, carros);
//                case 2 -> exibirCarros(posicaoVazia, modelos, marcas, anos, placas, donos);
//                case 3 -> buscarPelaPlaca(teclado, posicaoVazia, modelos, marcas, anos, placas, donos);
//                case 4 -> deletarCarro(teclado, posicaoVazia, modelos, marcas, anos, placas, donos);
//                case 5 -> atualizarDonoCarro(teclado, posicaoVazia, modelos, marcas, anos, placas, donos);
                default -> System.out.println("Opcao invalida!");
            }
            System.out.println("------------------------");

            opcao = escolherOpcaoMenu(teclado);
        }

        System.out.println("Ate logo!");
//        criarCarro(teclado, posicaoVazia++, modelos, marcas, anos, placas, donos);

    }
}

