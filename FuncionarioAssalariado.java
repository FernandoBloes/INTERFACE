public class FuncionarioAssalariado implements Funcionario {
    public double salarioBase;

    // Construtor para inicializar o salário do funcionário assalariado
    public FuncionarioAssalariado(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método que retorna um valor fixo de bônus
    @Override
    public double calcularBonus() {
        return 5000.0;
    }

    // Método para acessar o salário do funcionário
    public double getSalarioBase() {
        return salarioBase;
    }
}