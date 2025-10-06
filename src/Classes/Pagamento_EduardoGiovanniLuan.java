/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Portu
 */
public abstract class Pagamento_EduardoGiovanniLuan {
    private String tipoPagamento;

    public Pagamento_EduardoGiovanniLuan(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Pagamento_EduardoGiovanniLuan() {
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public abstract String toString();
}
