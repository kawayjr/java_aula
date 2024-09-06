import javax.swing.*;

public class IdadeComIfElse {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Forneça o número de mês:");
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12) {
                    JOptionPane.showMessageDialog(null, "Número de mês válido: " + mes);
                } else {
                    JOptionPane.showMessageDialog(null, "Número de mês inválido: " + mes);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros: " + erro.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            System.exit(0);
        }
    }
}
