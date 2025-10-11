/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


/**
 *
 * @author Portu
 */
public class Dinheiro_EduardoGiovanniLuan extends Pagamento_EduardoGiovanniLuan {    

    public Dinheiro_EduardoGiovanniLuan() {
        super("Dinheiro");
    }

    @Override
    public String toString() {
        return new StringBuffer("Tipo de pagamento: ")
                .append(getTipoPagamento())
                .toString();
    }
}
