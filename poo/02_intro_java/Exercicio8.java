//anaGabrielaFernandesDePaulaCoimbra //camel case para variaveis e afins
//AnaGabrielaFernandes //Camel case para classes
//ana_gabriela_fernandes_de_paula_coimbra //snake case
//ana-gabriela-fernandes-de-paula-coimbra //kebab case
import javax.swing.JOptionPane;
public class Exercicio8 {
    static public void main(String [] args) {
        //classes empacotadoras (wrapper)
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Digite um Inteiro")
        );
        StringBuilder tabuada = new StringBuilder();
        for(int i = 1; i <=10; i++){
            //7 x 1 = 7, 7 x 2 = 14, etc...
            tabuada
                .append(" X ")
                .append(i)
                .append(" = ")
                .append(numero * i)
                .append("\n");
        }
        javax.swing.JOptionPane.showMessageDialog( 
            null,
            tabuada.toString(),
            "Tabuada",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}