public class Aluno extends Pessoa {
    //private String nome;
    private int matricula;
    private double nota1, nota2, nota3, media;

    public Aluno(){

    }
    public Aluno(String nome, int mat) {

        super(nome);

        this.matricula = mat;
    }





   // public void setNome(String nome) {
    //    this.nome = nome;
    //}
    //public String getNome() {
    //    return nome;
    // }

    public void setMatricula(Double matricula) {
        this.matricula = matricula;
    }
    public Double getMatricula() {
        return matricula;
    }


    public void setNota1(Double nota1) {
            this.nota1 = nota1;
    }
    public Double getNota1() {
            return nota1;
    }


    public void setNota2 (Double nota2) {
        this.nota2 = nota2;
    }
    public Double getNota2() {
        return nota2;
    }


    public void setNota3 (Double nota3) {
        this.nota3 = nota3;
    }
    public Double getNota3() {
        return nota3;
    }

    public  void  calc() {
        media = (nota1 + nota2 + nota1) / 3;
        if (media >= 7) {
            System.out.println("Passou");
        } else if (media <= 6.9 && media >= 4.0) {
            System.out.println("Final");
        } else {
            System.out.println("reprovar");
        }
    }
}
