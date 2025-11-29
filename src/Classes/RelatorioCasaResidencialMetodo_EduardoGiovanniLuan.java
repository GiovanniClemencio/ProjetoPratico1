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
public class RelatorioCasaResidencialMetodo_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Imovel_EduardoGiovanniLuan> todosImoveis;
    private List<CasaResidencial_EduardoGiovanniLuan> casas;

    @Override
    protected void carregarDados() {
        todosImoveis = new ArrayList<>(
                Imobiliaria_EduardoGiovanniLuan.getInstancia().getImoveis()
        );
        casas = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Imovel_EduardoGiovanniLuan imovel : todosImoveis) {
            if (imovel instanceof CasaResidencial_EduardoGiovanniLuan casa) {
                casas.add(casa);
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {

        if (casas.isEmpty()) {
            resultado.append("Nenhuma Casa Residencial cadastrada!\n");
            return;
        }

        for (CasaResidencial_EduardoGiovanniLuan casa : casas) {
            resultado.append(casa.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}