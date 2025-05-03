package domain;

public class Pet {

    private Cliente tutor;
    private String nome;

    public Pet(Cliente tutor, String nome) {
        this.tutor = tutor;
        this.nome = nome;
    }

    public Cliente getTutor() {
        return tutor;
    }

    public void setTutor(Cliente tutor) {
        this.tutor = tutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
