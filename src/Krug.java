public class Krug extends GeometrijskiLik {
    private double radius;

    public Krug(String naziv, double radius) {
        super(naziv);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double povrsina() {
        return radius * radius * Math.PI;
    }

    @Override
    public double opseg() {
        return 2 * radius * Math.PI;
    }
}
