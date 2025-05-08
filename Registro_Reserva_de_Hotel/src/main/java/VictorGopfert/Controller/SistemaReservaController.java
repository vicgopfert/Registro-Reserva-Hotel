package VictorGopfert.Controller;

import VictorGopfert.Model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaReservaController {
    private List<Hospede> hospedes;
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public SistemaReservaController() {
        this.hospedes = new ArrayList<>();
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    
        // Cadastro de hóspedes
        hospedes.add(new Hospede("12345678900", "João Silva", "99999-0001", "joao@email.com"));
        hospedes.add(new Hospede("98765432100", "Maria Souza", "99999-0002", "maria@email.com"));
        hospedes.add(new Hospede("11122233344", "Lucas Carvalho", "99999-0003", "lucas@email.com"));
        hospedes.add(new Hospede("22233344455", "Ana Beatriz", "99999-0004", "ana@email.com"));
        hospedes.add(new Hospede("33344455566", "Carlos Eduardo", "99999-0005", "carlos@email.com"));
        hospedes.add(new Hospede("44455566677", "Fernanda Lima", "99999-0006", "fernanda@email.com"));
        hospedes.add(new Hospede("55566677788", "Paulo Oliveira", "99999-0007", "paulo@email.com"));
    
        // Adição de quartos
        quartos.add(new Comum(101));
        quartos.add(new Comum(102));
        quartos.add(new Comum(103));
        quartos.add(new Plus(201));
        quartos.add(new Plus(202));
        quartos.add(new Premium(301));
        quartos.add(new Premium(302));
    
        // Reservas com datas e check-in/check-out simulados
        reservas.add(new Reserva(hospedes.get(0), quartos.get(0), LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 5)));
        reservas.get(0).realizarCheckin();
        reservas.get(0).realizarCheckout();
    
        reservas.add(new Reserva(hospedes.get(1), quartos.get(1), LocalDate.of(2025, 5, 2), LocalDate.of(2025, 5, 4)));
        reservas.get(1).realizarCheckin();
    
        reservas.add(new Reserva(hospedes.get(2), quartos.get(2), LocalDate.of(2025, 5, 3), LocalDate.of(2025, 5, 6)));
    
        reservas.add(new Reserva(hospedes.get(3), quartos.get(3), LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 3)));
        reservas.get(3).realizarCheckin();
        reservas.get(3).realizarCheckout();
    
        reservas.add(new Reserva(hospedes.get(4), quartos.get(4), LocalDate.of(2025, 5, 5), LocalDate.of(2025, 5, 10)));
    
        reservas.add(new Reserva(hospedes.get(5), quartos.get(5), LocalDate.of(2025, 5, 6), LocalDate.of(2025, 5, 9)));
        reservas.get(5).realizarCheckin();
    
        reservas.add(new Reserva(hospedes.get(6), quartos.get(6), LocalDate.of(2025, 5, 7), LocalDate.of(2025, 5, 10)));
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }
    
    public List<Quarto> getQuartos() {
        return quartos;
    }
    
    public List<Reserva> getReservas() {
        return reservas;
    }
}
