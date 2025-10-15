/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopooii_eduardo;

/**
 *
 * @author eduar
 */
import java.util.ArrayList;

public class Imobiliaria_EduardoGiovanniLuan
{
    private String nome;
    private String endereco;
    private ArrayList<Aluguel> alugueis;
    private ArrayList<Venda> vendas;
    private ArrayList<Imovel> imoveis;
    private ArrayList<Usuario_EduardoGiovanniLuan> clientes;
    private ArrayList<Usuario_EduardoGiovanniLuan> corretores;
    private ArrayList<Seguro> seguros;
    private Configuracao_EduardoGiovanniLuan configuracoes;

    public Imobiliaria_EduardoGiovanniLuan(String nome, String endereco, ArrayList<Aluguel> alugueis, ArrayList<Venda> vendas, ArrayList<Imovel> imoveis, ArrayList<Usuario_EduardoGiovanniLuan> clientes, ArrayList<Usuario_EduardoGiovanniLuan> corretores, ArrayList<Seguro> seguros, Configuracao_EduardoGiovanniLuan configuracoes)
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

    public ArrayList<Aluguel> getAlugueis() { return alugueis; }
    public void setAlugueis(ArrayList<Aluguel> alugueis) { this.alugueis = alugueis; }

    public ArrayList<Venda> getVendas() { return vendas; }
    public void setVendas(ArrayList<Venda> vendas) { this.vendas = vendas; }

    public ArrayList<Imovel> getImoveis() { return imoveis; }
    public void setImoveis(ArrayList<Imovel> imoveis) { this.imoveis = imoveis; }

    public ArrayList<Usuario_EduardoGiovanniLuan> getClientes() { return clientes; }
    public void setClientes(ArrayList<Usuario_EduardoGiovanniLuan> clientes) { this.clientes = clientes; }

    public ArrayList<Usuario_EduardoGiovanniLuan> getCorretores() { return corretores; }
    public void setCorretores(ArrayList<Usuario_EduardoGiovanniLuan> corretores) { this.corretores = corretores; }

    public ArrayList<Seguro> getSeguros() { return seguros; }
    public void setSeguros(ArrayList<Seguro> seguros) { this.seguros = seguros; }

    public Configuracao_EduardoGiovanniLuan getConfiguracoes() { return configuracoes; }
    public void setConfiguracoes(Configuracao_EduardoGiovanniLuan configuracoes) { this.configuracoes = configuracoes; }

    @Override
    public String toString()
    {
        return "Imobiliária {" +
                "Nome: " + nome +
                ", Endereço: " + endereco +
                ", Aluguéis: " + (alugueis != null ? alugueis.size() : 0) +
                ", Vendas: " + (vendas != null ? vendas.size() : 0) +
                ", Imóveis: " + (imoveis != null ? imoveis.size() : 0) +
                ", Clientes: " + (clientes != null ? clientes.size() : 0) +
                ", Corretores: " + (corretores != null ? corretores.size() : 0) +
                ", Seguros: " + (seguros != null ? seguros.size() : 0) +
                ", Configurações: " + configuracoes +
                '}';
    }
}

