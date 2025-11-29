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
public class RelatorioImoveisParaVenda_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Imovel_EduardoGiovanniLuan> todosImoveis;
    private List<Venda_EduardoGiovanniLuan> vendas;
    private List<Imovel_EduardoGiovanniLuan> disponiveis;

    @Override
    protected void carregarDados() {
        Imobiliaria_EduardoGiovanniLuan imob = Imobiliaria_EduardoGiovanniLuan.getInstancia();

        todosImoveis = new ArrayList<>(imob.getImoveis());
        vendas = new ArrayList<>(imob.getVendas());
        disponiveis = new ArrayList<>();
    }

    @Override
    protected void filtrar() {

        // Se não existe nenhuma venda → todos imóveis estão disponíveis
        if (vendas.isEmpty()) {
            disponiveis.addAll(todosImoveis);
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : todosImoveis) {
            boolean foiVendido = false;

            for (Venda_EduardoGiovanniLuan venda : vendas) {
                if (venda.getImovel() == imovel) {
                    foiVendido = true;
                    break;
                }
            }

            if (!foiVendido) {
                disponiveis.add(imovel);
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (disponiveis.isEmpty()) {
            resultado.append("Nenhum imóvel disponível para venda cadastrado!\n");
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : disponiveis) {
            resultado.append(imovel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
