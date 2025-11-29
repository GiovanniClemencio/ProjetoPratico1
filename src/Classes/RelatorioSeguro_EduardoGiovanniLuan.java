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
public class RelatorioSeguro_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Seguro_EduardoGiovanniLuan> seguros;

    @Override
    protected void carregarDados() {
        Imobiliaria_EduardoGiovanniLuan imob = Imobiliaria_EduardoGiovanniLuan.getInstancia();
        seguros = new ArrayList<>(imob.getSeguros());
    }

    @Override
    protected void filtrar() {
        // Não precisa filtrar nada, lista todos os seguros
        // mas mantemos para seguir o template
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (seguros.isEmpty()) {
            resultado.append("Nenhum seguro cadastrado!\n");
            return;
        }

        for (Seguro_EduardoGiovanniLuan seguro : seguros) {
            resultado.append(seguro.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
