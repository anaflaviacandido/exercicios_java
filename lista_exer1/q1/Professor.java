public class Professor extends Pessoa {

    private double valorHora, salario;
    private int horasTrabalhadas;

    public Professor(){

    }
    public Professor(String nome, int idade ) {
        super(nome);
        this.idade = idade;
    }



    public void setValorHora(double valorHora) {

        this.valorHora = valorHora;

    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {

        this.horasTrabalhadas = horasTrabalhadas;

    }
    public double getValorHora() {

        return valorHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void calcularSalario() {

        salario = valorHora * horasTrabalhadas;
        System.out.println("O salário do funcionário é: R$ " + salario);
    }
}

