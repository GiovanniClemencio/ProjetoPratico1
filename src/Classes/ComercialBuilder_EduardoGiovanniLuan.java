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
public class ComercialBuilder_EduardoGiovanniLuan {

    // exclusivo
    private float taxaImpostoFederal = 0;

    // padrão
    private int codigoImovel;
    private String endereco;
    private float areaTotal;
    private LocalDate dataConstrucao = LocalDate.now();
    private float areaConstruida = 0;
    private int qtdDormitorios = 0;   // comercial normalmente não tem
    private int qtdBanheiros = 1;
    private int qtdVagasGaragem = 0;
    private float valorIPTU = 0f;
    private float valorVenda = 0f;
    private float valorAluguel = 0f;

    public ComercialBuilder_EduardoGiovanniLuan impostoFederal(float t) {
        this.taxaImpostoFederal = t;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan codigo(int c) {
        this.codigoImovel = c;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan endereco(String e) {
        this.endereco = e;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan areaTotal(float a) {
        this.areaTotal = a;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan areaConstruida(float a) {
        this.areaConstruida = a;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan banheiros(int b) {
        this.qtdBanheiros = b;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan vagas(int v) {
        this.qtdVagasGaragem = v;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan iptu(float i) {
        this.valorIPTU = i;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan venda(float v) {
        this.valorVenda = v;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan aluguel(float a) {
        this.valorAluguel = a;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan dataConstrucao(LocalDate data) {
        this.dataConstrucao = data;
        return this;
    }

    public float getTaxaImpostoFederal() {
        return taxaImpostoFederal;
    }

    public int getCodigoImovel() {
        return codigoImovel;
    }

    public String getEndereco() {
        return endereco;
    }

    public float getAreaTotal() {
        return areaTotal;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public int getQtdDormitorios() {
        return qtdDormitorios;
    }

    public int getQtdBanheiros() {
        return qtdBanheiros;
    }

    public int getQtdVagasGaragem() {
        return qtdVagasGaragem;
    }

    public float getValorIPTU() {
        return valorIPTU;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public ComercialBuilder_EduardoGiovanniLuan lojaPequena() {
        this.areaTotal = 40;
        this.qtdBanheiros = 1;
        this.areaConstruida = 36;
        this.valorIPTU = 180;
        this.valorAluguel = 1300;
        this.valorVenda = 200000;
        this.taxaImpostoFederal = 3;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan lojaMedia() {
        this.areaTotal = 120;
        this.qtdBanheiros = 2;
        this.qtdVagasGaragem = 1;
        this.areaConstruida = 100;
        this.valorIPTU = 340;
        this.valorAluguel = 2600;
        this.valorVenda = 450000;
        this.taxaImpostoFederal = 5;
        return this;
    }

    public ComercialBuilder_EduardoGiovanniLuan lojaGrande() {
        this.areaTotal = 250;
        this.qtdBanheiros = 3;
        this.qtdVagasGaragem = 4;
        this.areaConstruida = 180;
        this.valorIPTU = 780;
        this.valorAluguel = 5200;
        this.valorVenda = 1200000;
        this.taxaImpostoFederal = 8;
        return this;
    }

    public Comercial_EduardoGiovanniLuan build() {
        return new Comercial_EduardoGiovanniLuan(
                taxaImpostoFederal,
                codigoImovel, endereco, dataConstrucao,
                areaTotal, areaConstruida,
                qtdDormitorios, qtdBanheiros,
                qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel
        );
    }
}
