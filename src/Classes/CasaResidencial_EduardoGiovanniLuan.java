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
public class CasaResidencial_EduardoGiovanniLuan extends Imovel_EduardoGiovanniLuan{
    
    public CasaResidencial_EduardoGiovanniLuan(int codigoImovel, String endereço, LocalDate dataConstrucao, float areaTotal, float areaConstruida, int qtdDormitorios, int qtdBanheiros, int qtdVagasGaragem, float valorIPTU, float valorVenda, float valorAluguel) {
        super(codigoImovel, endereço, dataConstrucao, areaTotal, areaConstruida, qtdDormitorios, qtdBanheiros, qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel);
    }
    
}
