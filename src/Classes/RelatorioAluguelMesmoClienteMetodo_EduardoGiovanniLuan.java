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
public class RelatorioAluguelMesmoClienteMetodo_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Aluguel_EduardoGiovanniLuan> alugueis;
    private List<Imovel_EduardoGiovanniLuan> imoveisCliente;
    private final String nomeCliente;

    public RelatorioAluguelMesmoClienteMetodo_EduardoGiovanniLuan(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    protected void carregarDados() {
        alugueis = new ArrayList<>(Imobiliaria_EduardoGiovanniLuan
                .getInstancia()
                .getAlugueis());

        imoveisCliente = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Aluguel_EduardoGiovanniLuan aluguel : alugueis) {
            if (aluguel.getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                imoveisCliente.add(aluguel.getImovel());
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (imoveisCliente.isEmpty()) {
            resultado.append("Nenhum aluguel desse cliente cadastrado!\n");
            return;
        }

        for (Imovel_EduardoGiovanniLuan imovel : imoveisCliente) {
            resultado.append(imovel.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
