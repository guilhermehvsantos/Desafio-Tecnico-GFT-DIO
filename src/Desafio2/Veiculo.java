package Desafio2;

public abstract class Veiculo {
    private String nome;
    private int velocidade;

    public Veiculo() {

    }

    public void Mover() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
