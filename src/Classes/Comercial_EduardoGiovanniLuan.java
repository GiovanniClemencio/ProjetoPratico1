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
public class Comercial_EduardoGiovanniLuan extends Imovel_EduardoGiovanniLuan{
    protected float taxaImpostoFederal;

    public Comercial_EduardoGiovanniLuan(float taxaImpostoFederal, int codigoImovel, String endereço, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereço, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public void setTaxaImpostoFederal(float taxaImpostoFederal) {
        this.taxaImpostoFederal = taxaImpostoFederal;
    }

    @Override
    public float getValorAluguel(){
        return super.getValorAluguel()*(1+taxaImpostoFederal);
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
            .append("Taxa do imposto federal: ").append(taxaImpostoFederal)
            .append("Valor do IPTU: R$ ").append(valorIPTU)
            .append("Valor de Venda: R$ ").append(valorVenda)
            .append("Valor de Aluguel: R$ ").append(getValorAluguel())
            .toString();
    }
}
