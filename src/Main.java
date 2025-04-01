import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        Krug krug1 = new Krug("Krug 1", 8);
        Krug krug2 = new Krug("Krug 2", 20);

        Pravokutnik pravokutnik1 = new Pravokutnik("pravokutnik 1", 8, 13.24);
        Pravokutnik pravokutnik2 = new Pravokutnik("pravokutnik 2", 4, 8);

        Trokut trokut1 = new Trokut("trokut 1", 4, 5, 6);
        Trokut trokut2 = new Trokut("trokut 2", 12, 12.6, 15.64);

        Ucilica ucilica = new Ucilica();

        ucilica.getLikovi().add(krug1);
        ucilica.getLikovi().add(krug2);
        ucilica.getLikovi().add(pravokutnik1);
        ucilica.getLikovi().add(pravokutnik2);
        ucilica.getLikovi().add(trokut1);
        ucilica.getLikovi().add(trokut2);

        Collections.sort(ucilica.getLikovi());

        for (GeometrijskiLik lik : ucilica.getLikovi()){
            System.out.println(lik.toString());
        }
    }
}
