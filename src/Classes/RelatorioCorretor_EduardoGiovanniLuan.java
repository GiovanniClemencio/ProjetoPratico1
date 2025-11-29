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
public class RelatorioCorretor_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Usuario_EduardoGiovanniLuan> todosUsuarios;
    private List<Corretor_EduardoGiovanniLuan> corretores;

    @Override
    protected void carregarDados() {
        todosUsuarios = new ArrayList<>(
                Imobiliaria_EduardoGiovanniLuan.getInstancia().getCorretores()
        );
        corretores = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Usuario_EduardoGiovanniLuan usuario : todosUsuarios) {
            if (usuario instanceof Corretor_EduardoGiovanniLuan c) {
                corretores.add(c);
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (corretores.isEmpty()) {
            resultado.append("Nenhum corretor cadastrado!\n");
            return;
        }

        for (Corretor_EduardoGiovanniLuan c : corretores) {
            resultado.append(c.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
