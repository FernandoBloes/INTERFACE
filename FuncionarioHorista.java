public class FuncionarioHorista implements Funcionario {
    public double valorHora;
    public int totalHoras;

    // Construtor que inicialiaza o valor da hora e as horas trabalhadas do
    // funcionário horista
    public FuncionarioHorista(double valorHora, int totalHoras) {
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    // Método que calcula o bônus como 10% do total ganho no ano
    @Override
    public double calcularBonus() {
        return (valorHora * totalHoras) * 0.10;
    }

    // Método de acesso para o valor da hora e total de horas
    public double getValorHora() {
        return valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }
}
