package VictorGopfert.View;

import VictorGopfert.Controller.SistemaReservaController;
import VictorGopfert.View.RelatorioReservaView;

public class Main {
    public static void main(String[] args) {
        SistemaReservaController controller = new SistemaReservaController();
        RelatorioReservaView view = new RelatorioReservaView();
        
        try {
            view.exibirRelatorio(controller.getReservas());
        } catch (Exception e) {
            System.out.println("Erro ao gerar relatório: " + e.getMessage());
        }
    }
}