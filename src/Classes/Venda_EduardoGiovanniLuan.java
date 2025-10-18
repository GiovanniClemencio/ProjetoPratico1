/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author luand
 */
public class Venda_EduardoGiovanniLuan implements Serializable{
    private int codigoVenda;
    private Cliente_EduardoGiovanniLuan cliente;
    private Corretor_EduardoGiovanniLuan corretor;
    private Imovel_EduardoGiovanniLuan imovel;
    private LocalDate dataVenda;
    private float valorTotalVenda;
    private Pagamento_EduardoGiovanniLuan formaPagamento;
    private Boolean finalizada;

    public Venda_EduardoGiovanniLuan(int codigoVenda, Cliente_EduardoGiovanniLuan cliente, Corretor_EduardoGiovanniLuan corretor, Imovel_EduardoGiovanniLuan imovel, LocalDate dataVenda, float valorTotalVenda, Pagamento_EduardoGiovanniLuan formaPagamento, Boolean finalizada) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataVenda = dataVenda;
        this.valorTotalVenda = valorTotalVenda;
        this.formaPagamento = formaPagamento;
        this.finalizada = finalizada;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Cliente_EduardoGiovanniLuan getCliente() {
        return cliente;
    }

    public void setCliente(Cliente_EduardoGiovanniLuan cliente) {
        this.cliente = cliente;
    }

    public Corretor_EduardoGiovanniLuan getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor_EduardoGiovanniLuan corretor) {
        this.corretor = corretor;
    }

    public Imovel_EduardoGiovanniLuan getImovel() {
        return imovel;
    }

    public void setImovel(Imovel_EduardoGiovanniLuan imovel) {
        this.imovel = imovel;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(float valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public Pagamento_EduardoGiovanniLuan getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Pagamento_EduardoGiovanniLuan formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }
    
    // Ver como vai ficar no final
    @Override
    public String toString(){
       return new StringBuffer("Código da Venda: ").append(codigoVenda).append("\n")
      .append("Cliente: ").append(cliente != null ? cliente.getNome() : "N/A").append("\n")
      .append("Corretor: ").append(corretor != null ? corretor.getNome() : "N/A").append("\n")
      .append("Imóvel Código: ").append(imovel != null ? imovel.getCodigoImovel() : "N/A").append("\n")
      .append("Data da Venda: ").append(dataVenda != null ? dataVenda : "Não definida").append("\n")
      .append("Valor Total da Venda: R$ ").append(String.format("%.2f", valorTotalVenda)).append("\n")
      .append("Forma de Pagamento: ").append(formaPagamento != null ? formaPagamento.getTipoPagamento() : "N/A").append("\n")
      .append("Venda Finalizada: ").append(finalizada ? "Sim" : "Não").append("\n")
      .append("===========================\n").toString();
    }
}
