package VictorGopfert.Model;

public class Plus extends Quarto {

    public Plus(int numeroQuarto) {
        super(numeroQuarto, 4, 300);
    }

    @Override
    public String getTipo() {
        return "Plus";
    }
    
}
