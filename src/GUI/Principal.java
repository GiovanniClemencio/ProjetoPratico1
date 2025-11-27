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
import Classes.Inicializar_EduardoGiovanniLuan;
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

    public static void inicializar() {

        Imobiliaria_EduardoGiovanniLuan nossaImobiliaria = Imobiliaria_EduardoGiovanniLuan.getInstancia();
        Configuracao_EduardoGiovanniLuan config = nossaImobiliaria.getConfiguracoes();
        
        System.out.println(config.getArquivoClientes());
        
        ArrayList<Usuario_EduardoGiovanniLuan> clientes = Inicializar_EduardoGiovanniLuan.carregarObjetos(config.getArquivoClientes());
        ArrayList<Usuario_EduardoGiovanniLuan> corretores = Inicializar_EduardoGiovanniLuan.carregarObjetos(config.getArquivoCorretores());
        ArrayList<Imovel_EduardoGiovanniLuan> imoveis = Inicializar_EduardoGiovanniLuan.carregarObjetos(config.getArquivoImoveis());
        ArrayList<Venda_EduardoGiovanniLuan> vendas = Inicializar_EduardoGiovanniLuan.carregarObjetos(config.getArquivoVendas());
        ArrayList<Aluguel_EduardoGiovanniLuan> alugueis = Inicializar_EduardoGiovanniLuan.carregarObjetos(config.getArquivoAlugueis());
        ArrayList<Seguro_EduardoGiovanniLuan> seguros = Inicializar_EduardoGiovanniLuan.carregarObjetos(config.getArquivoSeguros());
        
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
