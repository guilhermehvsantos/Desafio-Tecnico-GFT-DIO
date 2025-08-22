package Desafio2;

public class Moto extends Veiculo{

    public Moto() {
        super("Moto", 50);
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
        System.out.println("Burururuuummmm!");
    }
}
