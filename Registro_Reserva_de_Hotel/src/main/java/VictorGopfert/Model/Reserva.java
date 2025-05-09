package VictorGopfert.Model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva implements Reservavel {
    private static int proximoId = 1; // contador estático

    private final int id; // identificador único da reserva
    private final Hospede hospede;
    private final Quarto quarto;
    private final LocalDate dataEntrada;
    private final LocalDate dataSaida;
    private boolean checkinRealizado;
    private boolean checkoutRealizado;

    public Reserva(Hospede hospede, Quarto quarto, LocalDate dataEntrada, LocalDate dataSaida) {
        this.id = proximoId++;
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.checkinRealizado = false;
        this.checkoutRealizado = false;
    }

    public int getId() {
        return id;
    }
    
    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public boolean isCheckinRealizado() {
        return checkinRealizado;
    }

    public boolean isCheckoutRealizado() {
        return checkoutRealizado;
    }

    public long getQuantidadeDias() {
        return ChronoUnit.DAYS.between(dataEntrada, dataSaida);
    }

    public double getTotalAPagar() {
        return getQuantidadeDias() * quarto.getPrecoNoite();
    }

    @Override
    public void realizarCheckin() {
        if (!checkinRealizado) {
            this.checkinRealizado = true;
            quarto.setDisponivel(false);
            System.out.println("Check-in realizado com sucesso para o hóspede: " + hospede.getNome());
        } else {
            System.out.println("Check-in já foi realizado anteriormente.");
        }
    }

    @Override
    public void realizarCheckout() {
        if (!checkoutRealizado && checkinRealizado) {
            this.checkoutRealizado = true;
            quarto.setDisponivel(true);
            System.out.println("Check-out realizado com sucesso para o hóspede: " + hospede.getNome());
        } else if (!checkinRealizado) {
            System.out.println("Check-out não pode ser realizado sem check-in.");
        } else {
            System.out.println("Check-out já foi realizado anteriormente.");
        }
    }
}
