public class Principal {
    public static void main(String[] args) {
        // Instância do funcionário assalariado e exibição de seu bônus
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(60000);
        System.out.println("Bônus do Funcionário Assalariado: R$ " + funcionarioAssalariado.calcularBonus());

        // Instância do funcionário horista e exibição de seu bônus
        Funcionario funcionarioHorista = new FuncionarioHorista(50, 2000);
        System.out.println("Bônus do Funcionário Horista: R$ " + funcionarioHorista.calcularBonus());
    }
}