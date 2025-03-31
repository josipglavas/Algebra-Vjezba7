public abstract class GeometrijskiLik {
    private String naziv;
    public abstract double povrsina();
    public abstract double opseg();

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }
}
