import javax.swing.JOptionPane;
public static class Exercicio5{
    public void main(String args []){
        // float(4bytes), double(8bytes)
        float media = Float.parseFloat(
            JOptionPane.showInputDialog("Digite a sua Média:")
    );
    String situacao;

    //if/else encadeado
    if (media >= 6){
    situacao = "Aprovado";
    }
     else if(media >= 4){
        situacao = "Recuperacao";
    }
    else 
    situacao = "Reprovado";
    JOptionPane.showDialog(null,"A sua Situaçao é:" + situaçao);
    }
}