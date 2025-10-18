/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Luan
 */
public class CasaResidencial_EduardoGiovanniLuan extends Imovel_EduardoGiovanniLuan implements Serializable{
    
    public CasaResidencial_EduardoGiovanniLuan(int codigoImovel, String endereço, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereço, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
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
            .append("Valor do IPTU: R$ ").append(valorIPTU)
            .append("Valor de Venda: R$ ").append(valorVenda)
            .append("Valor de Aluguel: R$ ").append(valorAluguel)
            .toString();
    }
    
}
