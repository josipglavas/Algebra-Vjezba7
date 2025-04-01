public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {
    private String naziv;
    public abstract double povrsina();
    public abstract double opseg();

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString(){
        return "Naziv lika: " + getNaziv() + ", povrsina: " + povrsina() + ", opseg: " + opseg();
    }
    @Override
    public int compareTo(GeometrijskiLik drugiLik){
        return Double.compare(Double.valueOf(this.povrsina()), Double.valueOf(drugiLik.povrsina()));
    }
}
