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
public class RelatorioImoveisLocacao_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Imovel_EduardoGiovanniLuan> todosImoveis;
    private List<Aluguel_EduardoGiovanniLuan> alugueis;
    private List<Imovel_EduardoGiovanniLuan> disponiveis;

    @Override
    protected void carregarDados() {
        Imobiliaria_EduardoGiovanniLuan imob = Imobiliaria_EduardoGiovanniLuan.getInstancia();

        todosImoveis = new ArrayList<>(imob.getImoveis());
        alugueis = new ArrayList<>(imob.getAlugueis());
        disponiveis = new ArrayList<>();
    }

    @Override
    protected void filtrar() {

        // Se não há alugueis → todos os imóveis estão livres
        if (alugueis.isEmpty()) {
            disponiveis.addAll(todosImoveis);
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : todosImoveis) {
            boolean temAluguelAtivo = false;

            for (Aluguel_EduardoGiovanniLuan aluguel : alugueis) {
                if (aluguel.getImovel() == imovel && !aluguel.getFinalizado()) {
                    temAluguelAtivo = true;
                    break;
                }
            }

            if (!temAluguelAtivo) {
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
            resultado.append("Nenhum imóvel para locação cadastrado!\n");
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : disponiveis) {
            resultado.append(imovel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
