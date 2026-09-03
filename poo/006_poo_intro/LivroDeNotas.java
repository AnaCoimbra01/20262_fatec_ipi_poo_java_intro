//alta coesão: classes altamente coesas servem para 1 único propósito
//uma única função
//uma unica responsabilidade

public class LivroDeNotas {

    private String 
    nomeDaDisciplina;
    
    /*public LivroDeNotas() {
        //Esse bloco já existe de maneira oculta.
    }*/ 

    public  LivroDeNotas(String nomeDaDisciplina) {
        setNomeDaDisciplina(nomeDaDisciplina);
    }

    //setter
    public void setNomeDaDisciplina(String nomeDaDisciplina){
        //Shadowing = deixar nome de variáveis iguais.
        if (nomeDaDisciplina.length() >= 3)
        this.nomeDaDisciplina = nomeDaDisciplina; //this: operador de alto-referência
    }
    //getter
    public String getNomeDaDisciplina () {
        return nomeDaDisciplina;
    }
    
    public void exibirMensagem() {
        System.out.printf("Bem vindo ao livro de notas de %s\n", nomeDaDisciplina
        );
    }
}