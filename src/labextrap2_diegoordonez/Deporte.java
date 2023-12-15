
package labextrap2_diegoordonez;

import java.util.ArrayList;
import java.util.Date;


public class Deporte {
    
    private ArrayList<Torneo> tonament = new ArrayList();
    private String nombre;
 

    public Deporte() {
        
    }

    public Deporte(String nombre) {
        this.nombre = nombre;
    }
    

    public ArrayList<Torneo> getTonament() {
        return tonament;
    }

    public void setTonament(ArrayList<Torneo> tonament) {
        this.tonament = tonament;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "Deporte{" + "tonament=" + tonament + ", fecha=" ;
    }
    
    
}
