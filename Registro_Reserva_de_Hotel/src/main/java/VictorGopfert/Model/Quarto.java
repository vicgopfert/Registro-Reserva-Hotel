package VictorGopfert.Model;

public abstract class Quarto {
    private int numeroQuarto;
    private int capacidadePessoas;
    private double precoNoite;
    private boolean disponivel;

    public Quarto(int numeroQuarto, int capacidadePessoas, double precoNoite) {
        this.numeroQuarto = numeroQuarto;
        this.capacidadePessoas = capacidadePessoas;
        this.precoNoite = precoNoite;
        this.disponivel = true; // por padrão, o quarto está disponível ao ser criado
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) { 
        this.disponivel = disponivel;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public double getPrecoNoite() {
        return precoNoite;
    }

    // Método que deve ser implementado por subclasses como QuartoSimples, QuartoDuplo, etc.
    public abstract String getTipo();

    @Override
    public String toString() {
        return "Nº Quarto: " + numeroQuarto + ", Tipo: " + getTipo() +
               ", Capacidade: " + capacidadePessoas +
               ", Preço/Noite: R$" + precoNoite +
               ", Disponível: " + (disponivel ? "Sim" : "Não");
    }
}
