/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;

/**
 *
 * @author Luan
 */
public class PredioResidencial_EduardoGiovanniLuan extends Imovel_EduardoGiovanniLuan{
    protected int andar;
    protected float valorCondominio;

    public PredioResidencial_EduardoGiovanniLuan(int andar, float valorCondominio, int codigoImovel, String endereço, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereço, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    public float getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(float valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
    
    // Preciso ver como vai ser a parte dos seguros depois porque já tem uma classe seguro
    @Override
    public float getValorAluguel(){
        return super.getValorAluguel()+valorCondominio;
    }
    
    @Override
    public String toString(){
        return new StringBuilder()
            .append("Código do Imóvel: ").append(codigoImovel)
            .append("Endereço: ").append(endereço)
            .append("Data de Construção: ").append(dataConstrucao)
            .append("Área Total: ").append(areaTotal)
            .append("Área Construída: ").append(areaConstruida)
            .append("Quantidade de Dormitórios: ").append(qtdDormitorios)
            .append("Quantidade de Banheiros: ").append(qtdBanheiros)
            .append("Quantidade de Vagas na Garagem: ").append(qtdVagasGaragem)
            .append("Andar do imóvel: ").append(andar)
            .append("Valor do Condominio: ").append(valorCondominio)
            .append("Valor do IPTU: R$ ").append(valorIPTU)
            .append("Valor de Venda: R$ ").append(valorVenda)
            .append("Valor de Aluguel: R$ ").append(getValorAluguel())
            .toString();
    }
}
