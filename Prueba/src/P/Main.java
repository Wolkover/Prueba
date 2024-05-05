package P;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Object[] options = {"Opción 1", "Opción 2", "Cancelar"};
        int result = JOptionPane.showOptionDialog(null, "Selecciona una opción",
                "Título del diálogo", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Opción 1 seleccionada");
        } else if (result == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Opción 2 seleccionada");
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada");
        }
    }
}
