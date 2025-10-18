/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Portu
 */
public class Contadores_EduardoGiovanniLuan {
    private static int codigoUsuario = 0;
    private static int codigoSeguro = 0;
    private static int codigoVenda = 0;
    private static int codigoAluguel = 0;
    private static int codigoImovel = 0;

    public static int getCodigoUsuario() {
        int usado = codigoUsuario;
        codigoUsuario++;
        return usado;
        
    }

    public static int getCodigoSeguro() {
        int usado = codigoSeguro;
        codigoSeguro++;
        return usado;
    }
    
    public static int getCodigoVenda() {
        int usado = codigoVenda;
        codigoVenda++;
        return usado;
    }
    
    public static int getCodigoAluguel() {
        int usado = codigoAluguel;
        codigoAluguel++;
        return usado;
    }
    
    public static int getCodigoImovel() {
        int usado = codigoImovel;
        codigoImovel++;
        return usado;
    }
    
}
