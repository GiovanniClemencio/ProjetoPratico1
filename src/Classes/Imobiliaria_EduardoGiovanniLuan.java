/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author eduar
 */
import java.util.ArrayList;

public class Imobiliaria_EduardoGiovanniLuan
{
    private String nome;
    private String endereco;
    private ArrayList<Aluguel_EduardoGiovanniLuan> alugueis;
    private ArrayList<Venda_EduardoGiovanniLuan> vendas;
    private ArrayList<Imovel_EduardoGiovanniLuan> imoveis;
    private ArrayList<Usuario_EduardoGiovanniLuan> clientes;
    private ArrayList<Usuario_EduardoGiovanniLuan> corretores;
    private ArrayList<Seguro_EduardoGiovanniLuan> seguros;
    private Configuracao_EduardoGiovanniLuan configuracoes;

    public Imobiliaria_EduardoGiovanniLuan(String nome, String endereco, ArrayList<Aluguel_EduardoGiovanniLuan> alugueis, ArrayList<Venda_EduardoGiovanniLuan> vendas, ArrayList<Imovel_EduardoGiovanniLuan> imoveis, ArrayList<Usuario_EduardoGiovanniLuan> clientes, ArrayList<Usuario_EduardoGiovanniLuan> corretores, ArrayList<Seguro_EduardoGiovanniLuan> seguros, Configuracao_EduardoGiovanniLuan configuracoes)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.alugueis = alugueis;
        this.vendas = vendas;
        this.imoveis = imoveis;
        this.clientes = clientes;
        this.corretores = corretores;
        this.seguros = seguros;
        this.configuracoes = configuracoes;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public ArrayList<Aluguel_EduardoGiovanniLuan> getAlugueis() { return alugueis; }
    public void setAlugueis(ArrayList<Aluguel_EduardoGiovanniLuan> alugueis) { this.alugueis = alugueis; }

    public ArrayList<Venda_EduardoGiovanniLuan> getVendas() { return vendas; }
    public void setVendas(ArrayList<Venda_EduardoGiovanniLuan> vendas) { this.vendas = vendas; }

    public ArrayList<Imovel_EduardoGiovanniLuan> getImoveis() { return imoveis; }
    public void setImoveis(ArrayList<Imovel_EduardoGiovanniLuan> imoveis) { this.imoveis = imoveis; }

    public ArrayList<Usuario_EduardoGiovanniLuan> getClientes() { return clientes; }
    public void setClientes(ArrayList<Usuario_EduardoGiovanniLuan> clientes) { this.clientes = clientes; }

    public ArrayList<Usuario_EduardoGiovanniLuan> getCorretores() { return corretores; }
    public void setCorretores(ArrayList<Usuario_EduardoGiovanniLuan> corretores) { this.corretores = corretores; }

    public ArrayList<Seguro_EduardoGiovanniLuan> getSeguros() { return seguros; }
    public void setSeguros(ArrayList<Seguro_EduardoGiovanniLuan> seguros) { this.seguros = seguros; }

    public Configuracao_EduardoGiovanniLuan getConfiguracoes() { return configuracoes; }
    public void setConfiguracoes(Configuracao_EduardoGiovanniLuan configuracoes) { this.configuracoes = configuracoes; }

    @Override
    public String toString()
    {
        return new StringBuffer("Imobiliária")
                .append("\nNome")
                .append(this.nome)
                .append("\nEndereco")
                .append(this.endereco)
                .append("\nAlugueis")
                .append(this.alugueis)
                .append("\nVendas")
                .append(this.vendas)
                .append("\nImoveis")
                .append(this.imoveis)
                .append("\nClientes")
                .append(this.clientes)
                .append("\nCorretores")
                .append(this.corretores)
                .append("\nSeguros")
                .append(this.seguros)
                .append("\nConfiguracoes")
                .append(this.configuracoes)
                .toString();
    }
}

