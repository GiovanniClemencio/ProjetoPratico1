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
public class RelatorioImoveisVendidos_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Venda_EduardoGiovanniLuan> vendas;
    private List<Imovel_EduardoGiovanniLuan> vendidos;

    @Override
    protected void carregarDados() {
        Imobiliaria_EduardoGiovanniLuan imob = Imobiliaria_EduardoGiovanniLuan.getInstancia();

        vendas = new ArrayList<>(imob.getVendas());
        vendidos = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Venda_EduardoGiovanniLuan venda : vendas) {
            Imovel_EduardoGiovanniLuan imovel = venda.getImovel();
            if (imovel != null) {
                vendidos.add(imovel);
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (vendidos.isEmpty()) {
            resultado.append("Nenhum imóvel vendido cadastrado!\n");
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : vendidos) {
            resultado.append(imovel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
