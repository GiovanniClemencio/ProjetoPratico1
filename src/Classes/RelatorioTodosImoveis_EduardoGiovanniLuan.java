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
public class RelatorioTodosImoveis_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Imovel_EduardoGiovanniLuan> imoveis;

    @Override
    protected void carregarDados() {
        Imobiliaria_EduardoGiovanniLuan imob = Imobiliaria_EduardoGiovanniLuan.getInstancia();
        imoveis = new ArrayList<>(imob.getImoveis());
    }

    @Override
    protected void filtrar() {
        // Nada para filtrar — queremos TODOS os imóveis
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (imoveis.isEmpty()) {
            resultado.append("Nenhum imóvel cadastrado!\n");
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : imoveis) {
            resultado.append(imovel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
