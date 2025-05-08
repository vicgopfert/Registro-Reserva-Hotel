package VictorGopfert.Model;

public class Comum extends Quarto {

    public Comum(int numeroQuarto) {
        super(numeroQuarto, 2, 150);
    }

    @Override
    public String getTipo() {
        return "Comum";
    }
    
}
