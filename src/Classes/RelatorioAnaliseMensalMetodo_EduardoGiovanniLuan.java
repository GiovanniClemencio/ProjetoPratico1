/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luan
 */
public class RelatorioAnaliseMensalMetodo_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Venda_EduardoGiovanniLuan> vendas;
    private List<Venda_EduardoGiovanniLuan> vendasDoMes;
    private final int mesSelecionado; // 1 a 12
    private float ganhosMes = 0;

    public RelatorioAnaliseMensalMetodo_EduardoGiovanniLuan(int mesSelecionado) {
        this.mesSelecionado = mesSelecionado;
    }

    @Override
    protected void carregarDados() {
        vendas = new ArrayList<>(
                Imobiliaria_EduardoGiovanniLuan.getInstancia().getVendas()
        );
        vendasDoMes = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Venda_EduardoGiovanniLuan venda : vendas) {
            if (venda.getDataVenda().getMonthValue() == mesSelecionado) {
                vendasDoMes.add(venda);
                ganhosMes += venda.getValorTotalVenda();
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (vendasDoMes.isEmpty()) {
            resultado.append("Nenhuma venda registrada nesse mês.\n");
            return;
        }

        for (Venda_EduardoGiovanniLuan venda : vendasDoMes) {
            resultado.append(venda.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }

        resultado.append("Ganhos do mês selecionado: ")
                .append(ganhosMes)
                .append("\n");
    }
}
