
package labextrap2_diegoordonez;


public class Partido {
    
    private Equipo equipo = new Equipo();
    private int puntos;

    public Partido() {
    }

    public Partido(int puntos) {
        this.puntos = puntos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Partido{" + "equipo=" + equipo + ", puntos=" + puntos + '}';
    }
    
    
}
