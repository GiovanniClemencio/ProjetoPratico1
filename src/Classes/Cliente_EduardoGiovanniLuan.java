/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author eduar
 */
import java.io.Serializable;
import java.time.LocalDate;

public class Cliente_EduardoGiovanniLuan extends Usuario_EduardoGiovanniLuan implements Serializable
{
    protected LocalDate dataCadastro;

    public Cliente_EduardoGiovanniLuan(int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String telefone, String email, LocalDate dataCadastro)
    {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.dataCadastro = dataCadastro;
    }
    
    public Cliente_EduardoGiovanniLuan() {
        super(0, "", "", "", null, "", "", "", "");
        this.dataCadastro = LocalDate.now();
    }

    public LocalDate getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(LocalDate dataCadastro) { this.dataCadastro = dataCadastro; }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("===== DADOS DO CLIENTE =====\n");
    sb.append("Código: ").append(this.codigoUsuario).append("\n");
    sb.append("Nome: ").append(this.nome).append("\n");
    sb.append("CPF: ").append(this.cpf).append("\n");
    sb.append("RG: ").append(this.rg).append("\n");
    sb.append("Data de Nascimento: ").append(this.dataNascimento).append("\n");
    sb.append("Endereço: ").append(this.endereco).append("\n");
    sb.append("CEP: ").append(this.cep).append("\n");
    sb.append("Telefone: ").append(this.telefone).append("\n");
    sb.append("E-mail: ").append(this.email).append("\n");
    sb.append("Data de Cadastro: ").append(dataCadastro != null ? dataCadastro.toString() : "N/A").append("\n");
    sb.append("=============================\n");
    return sb.toString();
}
}

