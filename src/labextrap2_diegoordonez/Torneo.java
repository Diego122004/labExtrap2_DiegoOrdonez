
package labextrap2_diegoordonez;

import java.util.ArrayList;


public class Torneo {
    
    private String name;
    private String Tipo;
    private ArrayList<Equipo> equipos = new ArrayList();
    private ArrayList<Partido> partidos = new ArrayList();

    public Torneo(String name) {
        this.name = name;
    }

    public Torneo(String name, String tipo) {
        this.name = name;
        this.Tipo = tipo;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return "Torneo{" + "name=" + name + ", equipos=" + equipos + ", partidos=" + partidos + '}';
    }
    
}
