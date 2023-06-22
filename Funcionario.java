public class Funcionario {
    private String nome;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Construtor da classe Funcionario
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Funcionario
        Funcionario funcionario = new Funcionario("João", 2500.0);
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salário: " + funcionario.getSalario());

        funcionario.setSalario(3000.0);
        System.out.println("Novo salário: " + funcionario.getSalario());
    }
}