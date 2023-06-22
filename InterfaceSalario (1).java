: import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;
    
    public Empresa() {
        funcionarios = new ArrayList<>();
    }
    
    public void adicionaFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    
    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }
}
 public interface Salario {
    double calcularSalario();
}