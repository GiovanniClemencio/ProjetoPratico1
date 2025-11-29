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
public class CasaResidencialBuilder_EduardoGiovanniLuan {

    private int codigoImovel;
    private String endereco;
    private float areaTotal;
    private LocalDate dataConstrucao = LocalDate.now();
    private float areaConstruida = 0;
    private int qtdDormitorios = 1;
    private int qtdBanheiros = 1;
    private int qtdVagasGaragem = 0;
    private float valorIPTU = 0f;
    private float valorVenda = 0f;
    private float valorAluguel = 0f;

    public CasaResidencialBuilder_EduardoGiovanniLuan codigo(int codigo) {
        this.codigoImovel = codigo;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan endereco(String e) {
        this.endereco = e;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan dataConstrucao(LocalDate data) {
        this.dataConstrucao = data;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan areaTotal(float a) {
        this.areaTotal = a;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan dormitorios(int d) {
        this.qtdDormitorios = d;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan banheiros(int b) {
        this.qtdBanheiros = b;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan vagas(int v) {
        this.qtdVagasGaragem = v;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan construida(float c) {
        this.areaConstruida = c;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan iptu(float i) {
        this.valorIPTU = i;
        return this;
    }

    public CasaResidencialBuilder_EduardoGiovanniLuan venda(float v) {
        this.valorVenda = v;
        return this;
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

    public CasaResidencialBuilder_EduardoGiovanniLuan aluguel(float a) {
        this.valorAluguel = a;
        return this;
    }

    // Casa simples (econômica)
    public CasaResidencialBuilder_EduardoGiovanniLuan modeloSimples() {
        this.qtdDormitorios = 1;
        this.qtdBanheiros = 1;
        this.areaTotal = 40;
        this.areaConstruida = 36;
        this.valorIPTU = 150;
        this.valorAluguel = 600;
        this.valorVenda = 80000;
        return this;
    }

    // Casa padrão
    public CasaResidencialBuilder_EduardoGiovanniLuan modeloPadrao() {
        this.qtdDormitorios = 2;
        this.qtdBanheiros = 2;
        this.qtdVagasGaragem = 1;
        this.areaTotal = 70;
        this.areaConstruida = 50;
        this.valorIPTU = 250;
        this.valorAluguel = 1200;
        this.valorVenda = 180000;
        return this;
    }

    // Casa de luxo
    public CasaResidencialBuilder_EduardoGiovanniLuan modeloLuxo() {
        this.qtdDormitorios = 4;
        this.qtdBanheiros = 3;
        this.qtdVagasGaragem = 3;
        this.areaTotal = 180;
        this.areaConstruida = 144;
        this.valorIPTU = 750;
        this.valorAluguel = 3500;
        this.valorVenda = 900000;
        return this;
    }

    // BUILD
    public CasaResidencial_EduardoGiovanniLuan build() {
        return new CasaResidencial_EduardoGiovanniLuan(
                codigoImovel, endereco, dataConstrucao,
                areaTotal, areaConstruida,
                qtdDormitorios, qtdBanheiros,
                qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel
        );
    }
}
