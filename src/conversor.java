import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Soles a Euros", "Soles a Dólares", "Soles a Libras Esterlinas", "Soles a Yen",
                    "Soles a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en soles peruanos: ");
            double soles;
            try {
                soles = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Soles a Dólares")) {
                double dollars = soles / 3.58;
                JOptionPane.showMessageDialog(null,
                        soles + " soles peruanos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Soles a Euros")) {
                double euros = soles / 4.21;
                JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + euros + " euros.");
            } else if (choice.equals("Soles a Libras Esterlinas")) {
                double pounds = soles / 4.92;
                JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + pounds + " libras esterlinas.");
            } else if (choice.equals("Soles a Yen")) {
                double yen = soles / 0.03;
                JOptionPane.showMessageDialog(null, soles + " soles peruanos son " + yen + " yenes japoneses.");
            } else if (choice.equals("Soles a Won")) {
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
}