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

public class Corretor_EduardoGiovanniLuan extends Usuario_EduardoGiovanniLuan
{
    protected String creci;
    protected float salario;
    protected String pis;
    protected LocalDate dataAdmissao;

    public Corretor_EduardoGiovanniLuan(int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String endereco, String cep, String telefone, String email, String creci, float salario, String pis, LocalDate dataAdmissao)
    {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, endereco, cep, telefone, email);
        this.creci = creci;
        this.salario = salario;
        this.pis = pis;
        this.dataAdmissao = dataAdmissao;
    }

    public String getCreci() { return creci; }
    public void setCreci(String creci) { this.creci = creci; }

    public float getSalario() { return salario; }
    public void setSalario(float salario) { this.salario = salario; }

    public String getPis() { return pis; }
    public void setPis(String pis) { this.pis = pis; }

    public LocalDate getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(LocalDate dataAdmissao) { this.dataAdmissao = dataAdmissao; }

    @Override
    public String toString()
    {
        return new StringBuffer("\nCorretor {").append("CRECI: ")
                .append(creci)
                .append(", Salário: ")
                .append(salario)
                .append(", PIS: ")
                .append(pis)
                .append(", Data de Admissão: ")
                .append(dataAdmissao).toString();
    }
}

