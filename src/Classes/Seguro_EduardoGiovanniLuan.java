/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Portu
 */
public class Seguro_EduardoGiovanniLuan {
    private int codigoSeguro;
    private String nomeSeguradora;
    private String tipo;
    private String descricao;
    private float valor;

    public Seguro_EduardoGiovanniLuan(int codigoSeguro, String nomeSeguradora, String tipo, String descricao, float valor) {
        this.codigoSeguro = codigoSeguro;
        this.nomeSeguradora = nomeSeguradora;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Seguro_EduardoGiovanniLuan() {
    }
    
    public int getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public String getNomeSeguradora() {
        return nomeSeguradora;
    }

    public void setNomeSeguradora(String nomeSeguradora) {
        this.nomeSeguradora = nomeSeguradora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        
        return new StringBuffer("Tipo de seguro: ")
                .append(this.tipo)
                .append("\nCodigo: ")
                .append(this.codigoSeguro)
                .append("\nSeguradora: ")
                .append(this.nomeSeguradora)
                .append("\nDescricao: ")
                .append(this.descricao)
                .append("\nValor do pacote: ")
                .append(this.valor)
                .toString();
    }
    
}
