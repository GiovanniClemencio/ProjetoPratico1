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
public class RelatorioAluguelFinalizadoMetodo_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Aluguel_EduardoGiovanniLuan> alugueis;

    @Override
    protected void carregarDados() {
        alugueis = new ArrayList<>(Imobiliaria_EduardoGiovanniLuan
                .getInstancia()
                .getAlugueis());
    }

    @Override
    protected void filtrar() {
        alugueis.removeIf(a -> !a.getFinalizado());
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (alugueis.isEmpty()) {
            resultado.append("Nenhum aluguel finalizado cadastrado!\n");
            return;
        }

        for (Aluguel_EduardoGiovanniLuan a : alugueis) {
            resultado.append(a.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
