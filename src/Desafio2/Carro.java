package Desafio2;

public class Carro  extends Veiculo{

    public Carro() {
        super("Carro", 60);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getVelocidade() {
        return super.getVelocidade();
    }

    @Override
    public void Mover() {
        System.out.println("Vruuummmm!");
    }
}

