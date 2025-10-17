/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import Classes.Configuracao_EduardoGiovanniLuan;
import Classes.Imobiliaria_EduardoGiovanniLuan;

/**
 *
 * @author Portu
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static Imobiliaria_EduardoGiovanniLuan nossaImobiliaria;
    
    public static void inicializar(){
        String nomeImo = "Imobiliaria Digital";
        String endereco = "Rua Barramento, 10, Parque Eletrico";
        Configuracao_EduardoGiovanniLuan caminhosArquivo = new Configuracao_EduardoGiovanniLuan();
        nossaImobiliaria = new Imobiliaria_EduardoGiovanniLuan(nomeImo, endereco, caminhosArquivo);
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
