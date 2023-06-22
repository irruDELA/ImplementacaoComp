public class Empresa {
    private String nome;
    private String endereco;
    private int numeroFuncionarios;

    public Empresa(String nome, String endereco, int numeroFuncionarios) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // Outros métodos

    public void contratarFuncionario() {
        numeroFuncionarios++;
        // Lógica para contratar um novo funcionário
    }

    public void demitirFuncionario() {
        if (numeroFuncionarios > 0) {
            numeroFuncionarios--;
            // Lógica para demitir um funcionário
        }
    }

    public double calcularLucros() {
        // Lógica para calcular os lucros da empresa
        return 0.0;
    }
}