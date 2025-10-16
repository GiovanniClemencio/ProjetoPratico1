/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author eduar
 */
import java.time.LocalDate;

public class Cliente_EduardoGiovanniLuan extends Usuario_EduardoGiovanniLuan
{
    protected LocalDate dataCadastro;

    public Cliente_EduardoGiovanniLuan(int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String telefone, String email, LocalDate dataCadastro)
    {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(LocalDate dataCadastro) { this.dataCadastro = dataCadastro; }

    @Override
    public String toString()
    {
        return new StringBuffer("\nCliente {")
                .append("\nData de Cadastro: ")
                .append(this.dataCadastro).toString();
    }
}

