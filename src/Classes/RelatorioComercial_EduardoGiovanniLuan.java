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
public class RelatorioComercial_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Imovel_EduardoGiovanniLuan> todosImoveis;
    private List<Comercial_EduardoGiovanniLuan> comerciais;

    @Override
    protected void carregarDados() {
        todosImoveis = new ArrayList<>(
                Imobiliaria_EduardoGiovanniLuan.getInstancia().getImoveis()
        );
        comerciais = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Imovel_EduardoGiovanniLuan imovel : todosImoveis) {
            if (imovel instanceof Comercial_EduardoGiovanniLuan c) {
                comerciais.add(c);
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (comerciais.isEmpty()) {
            resultado.append("Nenhum Imóvel comercial cadastrado!\n");
            return;
        }

        for (Comercial_EduardoGiovanniLuan c : comerciais) {
            resultado.append(c.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
