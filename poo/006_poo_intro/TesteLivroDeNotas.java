//Objetivo do uso de Boas Práticas: Reusabilidade, Manutenção, Alteração

public class TesteLivroDeNotas {
    public static void main (String[] args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas(); //livroDeNotas é uma nova variável criada referenciando apenas obejetos de sue próprio tipo.
        livroDeNotas.setNomeDaDisciplina("POO");
        livroDeNotas.exibirMensagem();
        LivroDeNotas livroDeNotas2 = new LivroDeNotas(); //new = operador de construção de objetos
        livroDeNotas2.setNomeDaDisciplina("PAOO");
        livroDeNotas2.exibirMensagem();
        //Esse livro é de: POO
        System.out.printf("Esse livro é de: %s\n", livroDeNotas.getNomeDaDisciplina());
        //Esse livro é de: PAOO
        System.out.printf("Esse livro é de: %s\n", livroDeNotas2.getNomeDaDisciplina());
    }
}