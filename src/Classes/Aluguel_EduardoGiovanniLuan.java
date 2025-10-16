/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Classes;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author luand
 */
public class Aluguel_EduardoGiovanniLuan {

    private int codigoAluguel;
    private Cliente_EduardoGiovanniLuan cliente;
    private Corretor_EduardoGiovanniLuan corretor;
    private Imovel_EduardoGiovanniLuan imovel;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;
    private LocalDate dataPagamentoMensal;
    private float valorTotalAluguel;
    private Pagamento_EduardoGiovanniLuan formaPagamento;
    private ArrayList<Seguro_EduardoGiovanniLuan> segurosContratados;
    private Boolean finalizado;
    private Boolean pago;

    public Aluguel_EduardoGiovanniLuan(int codigoAluguel, Cliente_EduardoGiovanniLuan cliente, Corretor_EduardoGiovanniLuan corretor, Imovel_EduardoGiovanniLuan imovel, LocalDate dataAluguel, LocalDate dataDevolucao, LocalDate dataPagamentoMensal, float valorTotalAluguel, Pagamento_EduardoGiovanniLuan formaPagamento, ArrayList<Seguro_EduardoGiovanniLuan> segurosContratados, Boolean finalizado, Boolean pago) {
        this.codigoAluguel = codigoAluguel;
        this.cliente = cliente;
        this.corretor = corretor;
        this.imovel = imovel;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.dataPagamentoMensal = dataPagamentoMensal;
        this.valorTotalAluguel = valorTotalAluguel;
        this.formaPagamento = formaPagamento;
        this.segurosContratados = segurosContratados;
        this.finalizado = finalizado;
        this.pago = pago;
    }

    public float calcularValorTotal() {
        float total = imovel.getValorAluguel();

        if (possuiSeguro()) {
            for (Seguro_EduardoGiovanniLuan seguro : segurosContratados) {
                total += seguro.getValor();
            }
        }

        valorTotalAluguel = total; // atualiza o atributo
        return total;
    }

    public Boolean possuiSeguro() {
        return !segurosContratados.isEmpty();
    }

    public Boolean verificarAtraso() {
        LocalDate hoje = LocalDate.now();

        // Está atrasado se ainda não foi pago e o dia de pagamento já passou
        if (!pago && dataPagamentoMensal.isBefore(hoje)) {
            return true;
        }

        return false;
    }

    
    // Ver como vai ficar no final
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("===== DADOS DO ALUGUEL =====\n")
                .append("Código do Aluguel: ").append(codigoAluguel).append("\n")
                .append("Cliente: ").append(cliente != null ? cliente.getNome() : "N/A").append("\n")
                .append("Corretor: ").append(corretor != null ? corretor.getNome() : "N/A").append("\n")
                .append("Imóvel Código: ").append(imovel != null ? imovel.getCodigoImovel() : "N/A").append("\n")
                .append("Data do Aluguel: ").append(dataAluguel).append("\n")
                .append("Data de Devolução: ").append(dataDevolucao != null ? dataDevolucao : "Não definida").append("\n")
                .append("Data de Pagamento Mensal: ").append(dataPagamentoMensal).append("\n")
                .append("Forma de Pagamento: ").append(formaPagamento != null ? formaPagamento.getTipoPagamento(): "N/A").append("\n")
                .append("Valor Total do Aluguel: R$ ").append(String.format("%.2f", calcularValorTotal())).append("\n")
                .append("Possui Seguro: ").append(possuiSeguro() ? "Sim" : "Não").append("\n");

        if (possuiSeguro()) {
            sb.append("Seguros Contratados:\n");
            for (Seguro_EduardoGiovanniLuan seguro : segurosContratados) {
                sb.append("  - ").append(seguro.getDescricao())
                        .append(" (R$ ").append(String.format("%.2f", seguro.getValor())).append(")\n");
            }
        }

        sb.append("Aluguel Pago: ").append(pago ? "Sim" : "Não").append("\n")
                .append("Aluguel Finalizado: ").append(finalizado ? "Sim" : "Não").append("\n")
                .append("Está em Atraso: ").append(verificarAtraso() ? "Sim" : "Não").append("\n")
                .append("============================\n");

        return sb.toString();
    }
}
