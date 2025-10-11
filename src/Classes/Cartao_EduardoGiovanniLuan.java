/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


/**
 *
 * @author Portu
 */
public class Cartao_EduardoGiovanniLuan extends Pagamento_EduardoGiovanniLuan {
    private String nome;
    private String bandeira;
    private String numero;

    public Cartao_EduardoGiovanniLuan(String nome, String bandeira, String numero) {
        super("Cartao");
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }

    public Cartao_EduardoGiovanniLuan() {
        super("Cartao");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Ajustando para o armazenamento em arquivo
    @Override
    public String toString() {
        return new StringBuffer("Tipo de pagamento: ")
                .append(getTipoPagamento())
                .append("\nNome: ")
                .append(this.nome)
                .append("\nBandeira: ")
                .append(this.bandeira)
                .append("\nNumero: ")
                .append(this.numero)
                .toString();
    }  
}
