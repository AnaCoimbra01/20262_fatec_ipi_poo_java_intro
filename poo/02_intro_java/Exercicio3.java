import javax.swing.JOptionPane;
public class Exercicio3{
    public static void main(String args []){
        double prova = Double.parseDouble(
            JOptionPane.showInputDialog("Nota de prova")
        );
        double trabalho = Double.parseDouble(
            JOption.Pane.showInputDialog("Nota de trabalho: ")
        );

        double media = (prova * 6 + trabalho * 4) / 10;

        JOptionPane.showMessageDialog(
            null,
            string.format("Media ponderada: %.2f", media)
        );
    }

}