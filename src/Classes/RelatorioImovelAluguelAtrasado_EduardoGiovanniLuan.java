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
public class RelatorioImovelAluguelAtrasado_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Aluguel_EduardoGiovanniLuan> alugueis;
    private List<Imovel_EduardoGiovanniLuan> atrasados;

    @Override
    protected void carregarDados() {
        Imobiliaria_EduardoGiovanniLuan imob = Imobiliaria_EduardoGiovanniLuan.getInstancia();

        alugueis = new ArrayList<>(imob.getAlugueis());
        atrasados = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Aluguel_EduardoGiovanniLuan aluguel : alugueis) {
            if (!aluguel.getPago()) {
                Imovel_EduardoGiovanniLuan imovel = aluguel.getImovel();

                if (imovel != null) {
                    atrasados.add(imovel);
                }
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (atrasados.isEmpty()) {
            resultado.append("Nenhum imóvel com aluguel atrasado cadastrado!\n");
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : atrasados) {
            resultado.append(imovel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
