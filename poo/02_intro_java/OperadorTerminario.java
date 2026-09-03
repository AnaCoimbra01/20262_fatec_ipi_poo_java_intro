public class OperadorTerminario {
    static public void main(String args []){
        double nota = 2;
        //se a nota for pelo menos 6, a criatura esta aprovada
        //caso contrário, esta reprovada
        System.out.println(nota >= 6 ? "Aprovado" : nota >= 4? "Exame Final" : "Reprovado");
    }
}