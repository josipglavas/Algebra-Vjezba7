public class Pravokutnik extends GeometrijskiLik {

    public Pravokutnik(String naziv, double stranicaA, double stranicaB) {
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    private double stranicaA;
    private double stranicaB;

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        return stranicaA * stranicaB;
    }

    @Override
    public double opseg() {
        return 2 * (stranicaA + stranicaB);
    }
}
