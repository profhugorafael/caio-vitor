import menu.AluguelMenu;
import model.Veiculo;
import service.AluguelService;
import service.VeiculoService;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        int opcao = AluguelMenu.escolherOpcao();

        while (opcao != 0) {
            switch (opcao) {
                case 1 -> VeiculoService.adicionarVeiculo(veiculos);
                case 2 -> VeiculoService.buscarVeiculoPelaPlaca(veiculos);
                case 3 -> VeiculoService.listarTodos(veiculos);
                case 4 -> AluguelService.simularAluguel(veiculos);
            }

            opcao = AluguelMenu.escolherOpcao();
        }
    }
}
