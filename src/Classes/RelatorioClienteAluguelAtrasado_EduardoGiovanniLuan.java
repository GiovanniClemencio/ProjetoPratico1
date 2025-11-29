/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Luan
 */
public class RelatorioClienteAluguelAtrasado_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Aluguel_EduardoGiovanniLuan> alugueis;
    private Set<Cliente_EduardoGiovanniLuan> clientesAtrasados;
    // Set evita repetição do mesmo cliente

    @Override
    protected void carregarDados() {
        alugueis = new ArrayList<>(
                Imobiliaria_EduardoGiovanniLuan.getInstancia().getAlugueis()
        );

        clientesAtrasados = new HashSet<>();
    }

    @Override
    protected void filtrar() {
        for (Aluguel_EduardoGiovanniLuan aluguel : alugueis) {
            if (!aluguel.getPago()) { // cliente com aluguel atrasado
                Cliente_EduardoGiovanniLuan cliente = aluguel.getCliente();
                clientesAtrasados.add(cliente);
            }
        }
    }

    @Override
    protected void ordenar() {
        // converte para lista para ordenar
        List<Cliente_EduardoGiovanniLuan> lista = new ArrayList<>(clientesAtrasados);

        lista.sort(
                Comparator.comparing(Cliente_EduardoGiovanniLuan::getNome)
        );

        clientesAtrasados = new HashSet<>(lista);
    }

    @Override
    protected void montarTexto() {
        if (clientesAtrasados.isEmpty()) {
            resultado.append("Nenhum cliente com aluguel atrasado cadastrado!\n");
            return;
        }

        for (Cliente_EduardoGiovanniLuan cliente : clientesAtrasados) {
            resultado.append(cliente.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
