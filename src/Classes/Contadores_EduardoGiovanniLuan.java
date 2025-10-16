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
    private static int codigoAluguel = 0;

    public static int getCodigoUsuario() {
        int usado = codigoUsuario;
        codigoUsuario++;
        return usado;
        
    }

    public static int getCodigoSeguro() {
        int usado = codigoSeguro;
        codigoSeguro++;
        return codigoSeguro;
    }
    
    
}
