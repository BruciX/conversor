import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MonedayTiempo {
    public static void main(String[] args) {

        Object[] options = { "Convertir Monedas", "Conversor de Temperatura", "Salir" };
        int choice = JOptionPane.showOptionDialog(null, "Que Quieres hacer?", "Convertir",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (choice == 2) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        if (choice == 0) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Soles a Euros", "Soles a Dólares", "Soles a Libras Esterlinas", "Soles a Yen",
                        "Soles a Won" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog("Ingrese la cantidad en soles peruanos: ");
                double soles;
                try {
                    soles = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.");
                    return;
                }

                if (cambio.equals("Soles a Dólares")) {
                    double dollars = soles / 3.58;
                    JOptionPane.showMessageDialog(null,
                            soles + " soles peruanos son " + FormatearDecimal.format(dollars) + " dólares.");
                } else if (cambio.equals("Soles a Euros")) {
                    double euros = soles / 4.21;
                    JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + euros + " euros.");
                } else if (cambio.equals("Soles a Libras Esterlinas")) {
                    double pounds = soles / 4.92;
                    JOptionPane.showMessageDialog(null,
                            soles + " soles peruanos son " + pounds + " libras esterlinas.");
                } else if (cambio.equals("Soles a Yen")) {
                    double yen = soles / 0.03;
                    JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + yen + " yenes japoneses.");
                } else if (cambio.equals("Soles a Won")) {
                    double won = soles / 0.0027;
                    JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + won + " wones surcoreanos.");
                }

                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }

        }
        if (choice == 1) {

            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Elige una opción de conversión:",
                        "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opciones, opciones[0]);

                String valorStr = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Celsius son " + resultado + " grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Fahrenheit son " + resultado + " grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}
