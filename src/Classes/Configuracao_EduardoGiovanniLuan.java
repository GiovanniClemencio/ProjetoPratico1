/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author eduar
 */
public class Configuracao_EduardoGiovanniLuan
{
    private static Configuracao_EduardoGiovanniLuan instancia = null;
    private String arquivoAlugueis;
    private String arquivoVendas;
    private String arquivoImoveis;
    private String arquivoClientes;
    private String arquivoCorretores;
    private String arquivoSeguros;

    private Configuracao_EduardoGiovanniLuan()
    {
        this.arquivoAlugueis = "./armazenamento/arquivoAluguel.dat";
        this.arquivoVendas = "./armazenamento/arquivoVendas.dat";
        this.arquivoImoveis = "./armazenamento/arquivoImoveis.dat";
        this.arquivoClientes = "./armazenamento/arquivoClientes.dat";
        this.arquivoCorretores = "./armazenamento/arquivoCorretores.dat";
        this.arquivoSeguros = "./armazenamento/arquivoSeguros.dat";
    }

    public String getArquivoAlugueis() { return arquivoAlugueis; }
    public void setArquivoAlugueis(String arquivoAlugueis) { this.arquivoAlugueis = arquivoAlugueis; }

    public String getArquivoVendas() { return arquivoVendas; }
    public void setArquivoVendas(String arquivoVendas) { this.arquivoVendas = arquivoVendas; }

    public String getArquivoImoveis() { return arquivoImoveis; }
    public void setArquivoImoveis(String arquivoImoveis) { this.arquivoImoveis = arquivoImoveis; }

    public String getArquivoClientes() { return arquivoClientes; }
    public void setArquivoClientes(String arquivoClientes) { this.arquivoClientes = arquivoClientes; }

    public String getArquivoCorretores() { return arquivoCorretores; }
    public void setArquivoCorretores(String arquivoCorretores) { this.arquivoCorretores = arquivoCorretores; }

    public String getArquivoSeguros() { return arquivoSeguros; }
    public void setArquivoSeguros(String arquivoSeguros) { this.arquivoSeguros = arquivoSeguros; }

    public static Configuracao_EduardoGiovanniLuan getInstancia(){
        if(instancia == null) new Configuracao_EduardoGiovanniLuan();
        return instancia;
    }
    
    @Override
    public String toString()
    {
        return new StringBuffer("\nConfiguração")
                .append("\nAlugueis")
                .append(this.arquivoAlugueis)
                .append("\nVendas")
                .append(this.arquivoVendas)
                .append("\nImoveis")
                .append(this.arquivoImoveis)
                .append("\nClientes")
                .append(this.arquivoClientes)
                .append("\nCorretores")
                .append(this.arquivoCorretores)
                .append("\nSeguros")
                .append(this.arquivoSeguros)
                .toString();
    }
}

