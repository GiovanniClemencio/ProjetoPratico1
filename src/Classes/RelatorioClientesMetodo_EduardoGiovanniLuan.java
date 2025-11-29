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
public class RelatorioClientesMetodo_EduardoGiovanniLuan extends RelatorioTemplate_EduardoGiovanniLuan {

    private List<Usuario_EduardoGiovanniLuan> todosUsuarios;
    private List<Cliente_EduardoGiovanniLuan> clientes;

    @Override
    protected void carregarDados() {
        todosUsuarios = new ArrayList<>(
            Imobiliaria_EduardoGiovanniLuan.getInstancia().getClientes()
        );
        clientes = new ArrayList<>();
    }

    @Override
    protected void filtrar() {
        for (Usuario_EduardoGiovanniLuan usuario : todosUsuarios) {
            if (usuario instanceof Cliente_EduardoGiovanniLuan cliente) {
                clientes.add(cliente);
            }
        }
    }

    @Override
    protected void ordenar() {
    }

    @Override
    protected void montarTexto() {
        if (clientes.isEmpty()) {
            resultado.append("Nenhum cliente cadastrado!\n");
            return;
        }

        for (Cliente_EduardoGiovanniLuan cliente : clientes) {
            resultado.append(cliente.toString());
            resultado.append("\n -=-=-=-=-=- \n");
        }
    }
}
