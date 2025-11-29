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
public class RelatorioPredioResidencial_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Imovel_EduardoGiovanniLuan> todos;
    private List<PredioResidencial_EduardoGiovanniLuan> predios;

    @Override
    protected void carregarDados() {
        Imobiliaria_EduardoGiovanniLuan imob = Imobiliaria_EduardoGiovanniLuan.getInstancia();

        todos = new ArrayList<>(imob.getImoveis());
        predios = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Imovel_EduardoGiovanniLuan imovel : todos) {
            if (imovel instanceof PredioResidencial_EduardoGiovanniLuan pr) {
                predios.add(pr);
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (predios.isEmpty()) {
            resultado.append("Nenhum Predio residencial cadastrado!\n");
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : predios) {
            resultado.append(imovel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
