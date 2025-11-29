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
public class RelatorioCompradoMesmoCliente_EduardoGiovanniLuan
        extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Venda_EduardoGiovanniLuan> vendas;
    private List<Imovel_EduardoGiovanniLuan> imoveisComprados;
    private final String nomeCliente;

    public RelatorioCompradoMesmoCliente_EduardoGiovanniLuan(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    protected void carregarDados() {
        vendas = new ArrayList<>(
                Imobiliaria_EduardoGiovanniLuan.getInstancia().getVendas()
        );
        imoveisComprados = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Venda_EduardoGiovanniLuan venda : vendas) {
            if (venda.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                imoveisComprados.add(venda.getImovel());
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (imoveisComprados.isEmpty()) {
            resultado.append("Nenhuma compra desse cliente cadastrada!\n");
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : imoveisComprados) {
            resultado.append(imovel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
