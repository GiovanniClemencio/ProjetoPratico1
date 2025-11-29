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
public class PredioResidencialBuilder_EduardoGiovanniLuan {

    // exclusivos
    private int andar = 1;
    private float valorCondominio = 0;

    // padrão
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

    public PredioResidencialBuilder_EduardoGiovanniLuan andar(int a) {
        this.andar = a;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan condominio(float c) {
        this.valorCondominio = c;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan codigo(int c) {
        this.codigoImovel = c;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan endereco(String e) {
        this.endereco = e;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan areaTotal(float a) {
        this.areaTotal = a;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan dormitorios(int d) {
        this.qtdDormitorios = d;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan banheiros(int b) {
        this.qtdBanheiros = b;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan vagas(int v) {
        this.qtdVagasGaragem = v;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan areaConstruida(float a) {
        this.areaConstruida = a;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan iptu(float i) {
        this.valorIPTU = i;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan venda(float v) {
        this.valorVenda = v;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan aluguel(float a) {
        this.valorAluguel = a;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan dataConstrucao(LocalDate data) {
        this.dataConstrucao = data;
        return this;
    }

    public int getAndar() {
        return andar;
    }

    public float getValorCondominio() {
        return valorCondominio;
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

    public PredioResidencialBuilder_EduardoGiovanniLuan modeloStudio() {
        this.qtdDormitorios = 0;
        this.qtdBanheiros = 1;
        this.areaTotal = 28;
        this.valorIPTU = 120;
        this.valorAluguel = 900;
        this.valorVenda = 140000;
        this.qtdVagasGaragem = 0;
        this.valorCondominio = 400;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan modeloMedio() {
        this.qtdDormitorios = 2;
        this.qtdBanheiros = 2;
        this.areaTotal = 60;
        this.valorIPTU = 260;
        this.valorAluguel = 1600;
        this.valorVenda = 260000;
        this.qtdVagasGaragem = 1;
        this.valorCondominio = 500;
        return this;
    }

    public PredioResidencialBuilder_EduardoGiovanniLuan modeloCobertura() {
        this.qtdDormitorios = 4;
        this.qtdBanheiros = 3;
        this.areaTotal = 200;
        this.valorIPTU = 1100;
        this.valorAluguel = 5000;
        this.valorVenda = 1500000;
        this.valorCondominio = 700;
        this.qtdVagasGaragem = 2;
        this.andar = 15;
        return this;
    }

    public PredioResidencial_EduardoGiovanniLuan build() {
        return new PredioResidencial_EduardoGiovanniLuan(
                andar, valorCondominio,
                codigoImovel, endereco, dataConstrucao,
                areaTotal, areaConstruida,
                qtdDormitorios, qtdBanheiros,
                qtdVagasGaragem, valorIPTU, valorVenda, valorAluguel
        );
    }
}
