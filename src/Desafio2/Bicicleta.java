package Desafio2;

public class Bicicleta extends Veiculo {
    public Bicicleta() {
        super("Bicicleta", 15);
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
        System.out.println("Pedalando...");
    }
}
