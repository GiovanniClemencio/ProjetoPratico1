package Classes;

public class PessoaFactory {
    
    public static Object criarPessoa(String tipo, int codigoUsuario, String nome, String cpf, String rg, 
                                   java.time.LocalDate dataNascimento, String endereco, String cep, 
                                   String telefone, String email, Object... adicional) {
        switch (tipo.toLowerCase()) {
            case "cliente":
                return new Cliente_EduardoGiovanniLuan(codigoUsuario, nome, cpf, rg, dataNascimento, 
                                                     endereco, cep, telefone, email, java.time.LocalDate.now());
            
            case "corretor":
                if (adicional.length >= 3) {
                    String creci = (String) adicional[0];
                    float salario = (Float) adicional[1];
                    String pis = (String) adicional[2];
                    return new Corretor_EduardoGiovanniLuan(codigoUsuario, nome, cpf, rg, dataNascimento, 
                                                          endereco, cep, telefone, email, creci, salario, pis, 
                                                          java.time.LocalDate.now());
                }
                throw new IllegalArgumentException("Corretor precisa de CRECI, salário e PIS");
                
            default:
                throw new IllegalArgumentException("Tipo de pessoa desconhecido: " + tipo);
        }
    }
}