/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Luan
 */
public class RelatorioHistoricoVendas_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Venda_EduardoGiovanniLuan> vendas;

    @Override
    protected void carregarDados() {
        vendas = new ArrayList<>(
                Imobiliaria_EduardoGiovanniLuan.getInstancia().getVendas()
        );
    }

    @Override
    protected void filtrar() {
        // Não precisa filtrar: pega todas as vendas
    }

    @Override
    protected void ordenar() {
        // Ordena por data da venda (do mais antigo para o mais recente)
        vendas.sort(
                Comparator.comparing(Venda_EduardoGiovanniLuan::getDataVenda)
        );
    }

    @Override
    protected void montarTexto() {
        if (vendas.isEmpty()) {
            resultado.append("Nenhuma venda cadastrada!\n");
            return;
        }

        for (Venda_EduardoGiovanniLuan venda : vendas) {
            resultado.append(venda.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
