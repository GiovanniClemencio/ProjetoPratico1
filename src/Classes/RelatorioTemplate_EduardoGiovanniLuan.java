/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Luan
 */
public abstract class RelatorioTemplate_EduardoGiovanniLuan {

    protected StringBuilder resultado;

    public final String gerar() {
        resultado = new StringBuilder();

        carregarDados();
        filtrar();
        ordenar();
        montarTexto();

        return resultado.toString();
    }

    protected abstract void carregarDados(); // buscar objetos da imobiliária

    protected abstract void filtrar();       // filtra por tipo, ativo, etc.

    protected abstract void ordenar();       // ordenação opcional

    protected abstract void montarTexto();   // monta o texto final
}
