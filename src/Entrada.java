import javax.swing.*;


public class Entrada {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VentanaEmail ventana = new VentanaEmail();
                ventana.todoEmail();

            }
        });

    }
}
