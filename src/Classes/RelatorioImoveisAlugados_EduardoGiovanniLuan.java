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
public class RelatorioImoveisAlugados_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Aluguel_EduardoGiovanniLuan> alugueis;
    private List<Aluguel_EduardoGiovanniLuan> alugueisAtivos;

    @Override
    protected void carregarDados() {
        alugueis = new ArrayList<>(
                Imobiliaria_EduardoGiovanniLuan.getInstancia().getAlugueis()
        );
        alugueisAtivos = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Aluguel_EduardoGiovanniLuan aluguel : alugueis) {
            if (!aluguel.getFinalizado()) {
                alugueisAtivos.add(aluguel);
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (alugueisAtivos.isEmpty()) {
            resultado.append("Nenhum imóvel alugado cadastrado!\n");
            return;
        }

        for (Aluguel_EduardoGiovanniLuan aluguel : alugueisAtivos) {
            resultado.append(aluguel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
