/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import Classes.Aluguel_EduardoGiovanniLuan;
import Classes.Configuracao_EduardoGiovanniLuan;
import Classes.Corretor_EduardoGiovanniLuan;
import Classes.Imobiliaria_EduardoGiovanniLuan;
import Classes.Imovel_EduardoGiovanniLuan;
import static Classes.Inicializar_EduardoGiovanniLuan.carregarObjetos;
import Classes.Seguro_EduardoGiovanniLuan;
import Classes.Usuario_EduardoGiovanniLuan;
import Classes.Venda_EduardoGiovanniLuan;
import java.util.ArrayList;

/**
 *
 * @author Portu
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static Imobiliaria_EduardoGiovanniLuan nossaImobiliaria;
    private static Configuracao_EduardoGiovanniLuan config = new Configuracao_EduardoGiovanniLuan();

    public static void inicializar() {

        
        
        String nomeImo = "Imobiliaria Digital";
        String endereco = "Rua Barramento, 10, Parque Eletrico";
        Configuracao_EduardoGiovanniLuan caminhosArquivo = new Configuracao_EduardoGiovanniLuan();
        nossaImobiliaria = new Imobiliaria_EduardoGiovanniLuan(nomeImo, endereco, caminhosArquivo);
        
        ArrayList<Usuario_EduardoGiovanniLuan> clientes = carregarObjetos(config.getArquivoClientes());
        ArrayList<Usuario_EduardoGiovanniLuan> corretores = carregarObjetos(config.getArquivoCorretores());
        ArrayList<Imovel_EduardoGiovanniLuan> imoveis = carregarObjetos(config.getArquivoImoveis());
        ArrayList<Venda_EduardoGiovanniLuan> vendas = carregarObjetos(config.getArquivoVendas());
        ArrayList<Aluguel_EduardoGiovanniLuan> alugueis = carregarObjetos(config.getArquivoAlugueis());
        ArrayList<Seguro_EduardoGiovanniLuan> seguros = carregarObjetos(config.getArquivoSeguros());
        
        nossaImobiliaria.setClientes(clientes);
        nossaImobiliaria.setCorretores(corretores);
        nossaImobiliaria.setImoveis(imoveis);
        nossaImobiliaria.setVendas(vendas);
        nossaImobiliaria.setAlugueis(alugueis);
        nossaImobiliaria.setSeguros(seguros);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        inicializar();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaHome janela = new JanelaHome();
                janela.setLocationRelativeTo(null); // Centraliza na tela
                janela.setVisible(true);            // Torna a janela visível
            }
        });
    }

}
