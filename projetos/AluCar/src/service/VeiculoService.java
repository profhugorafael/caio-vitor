package service;

import enums.Momento;
import menu.AluguelMenu;
import model.Aluguel;
import model.Veiculo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.NoSuchElementException;

public class VeiculoService {

    public static void buscarVeiculoPelaPlaca(List<Veiculo> veiculos) {
        String placa = AluguelMenu.solicitarPlaca();

        Veiculo veiculoEncontrado = veiculos.stream()
                .filter(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Veiculo nao encontrado!"));

        AluguelMenu.mostrarVeiculo(veiculoEncontrado);
    }

    public static void listarTodos(List<Veiculo> veiculos) {
        AluguelMenu.listarVeiculos(veiculos);
    }

    public static void adicionarVeiculo(List<Veiculo> veiculos) {
        Veiculo novoVeiculo = AluguelMenu.solicitarNovoVeiculo();

        boolean ehNovoVeiculo = veiculos.stream()
                .filter(veiculo -> veiculo.getPlaca().equalsIgnoreCase(novoVeiculo.getPlaca()))
                .toList()
                .isEmpty();

        if(!ehNovoVeiculo) {
            throw new NoSuchElementException("Veiculo ja cadastrado");
        }

        veiculos.add(novoVeiculo);
    }
}
