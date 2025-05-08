package VictorGopfert.Model;

public class Premium extends Quarto {

    public Premium(int numeroQuarto) {
        super(numeroQuarto, 6, 500);
    }

    @Override
    public String getTipo() {
        return "Premium";
    }
    
}
