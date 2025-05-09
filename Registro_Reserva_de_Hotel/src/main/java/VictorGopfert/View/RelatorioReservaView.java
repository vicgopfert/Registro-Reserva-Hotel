package VictorGopfert.View;

import VictorGopfert.Model.Reserva;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class RelatorioReservaView {

    public void exibirRelatorio(List<Reserva> reservas) throws IOException {
        String caminho = "relatorio_reservas.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(caminho));

        writer.write("RELATÓRIO DE RESERVAS DE HOTEL\n");
        writer.write("====================================\n\n");

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Reserva reserva : reservas) {
            System.out.println("------------------------------------------");
            System.out.println("ID da Reserva: " + reserva.getId());
            System.out.println("Hóspede: " + reserva.getHospede().getNome());
            System.out.println("CPF: " + reserva.getHospede().getCpf());
            System.out.println("Quarto Nº: " + reserva.getQuarto().getNumeroQuarto());
            System.out.println("Tipo de Quarto: " + reserva.getQuarto().getTipo());
            System.out.println("Data de Entrada: " + reserva.getDataEntrada().format(formato));
            System.out.println("Data de Saída: " + reserva.getDataSaida().format(formato));
            System.out.println("Total de Dias Reservados: " + reserva.getQuantidadeDias());
            System.out.printf("Total a Pagar: R$%.2f%n", reserva.getTotalAPagar());
            System.out.println("Check-in realizado? " + (reserva.isCheckinRealizado() ? "Sim" : "Não"));
            System.out.println("Check-out realizado? " + (reserva.isCheckoutRealizado() ? "Sim" : "Não"));

            writer.write("------------------------------------------\n");
            writer.write("ID da Reserva: " + reserva.getId() + "\n");
            writer.write("Hóspede: " + reserva.getHospede().getNome() + "\n");
            writer.write("CPF: " + reserva.getHospede().getCpf() + "\n");
            writer.write("Quarto Nº: " + reserva.getQuarto().getNumeroQuarto() + "\n");
            writer.write("Tipo de Quarto: " + reserva.getQuarto().getTipo() + "\n");
            writer.write("Data de Entrada: " + reserva.getDataEntrada().format(formato) + "\n");
            writer.write("Data de Saída: " + reserva.getDataSaida().format(formato) + "\n");
            writer.write("Total de Dias Reservados: " + reserva.getQuantidadeDias() + "\n");
            writer.write(String.format("Total a Pagar: R$%.2f\n", reserva.getTotalAPagar()));
            writer.write("Check-in realizado? " + (reserva.isCheckinRealizado() ? "Sim" : "Não") + "\n");
            writer.write("Check-out realizado? " + (reserva.isCheckoutRealizado() ? "Sim" : "Não") + "\n");
        }

        writer.write("\nRelatório realizado por Victor Gopfert.\n");
        writer.close();

        System.out.println("\nRelatório também salvo em: " + caminho);
    }
}
