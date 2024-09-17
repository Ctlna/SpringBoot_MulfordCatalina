package EjBean;

public class Persona implements SerVivo {
    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String caminar(){
        return "Caminando "+nombre+", planea llegar. Algun día.";
    }
}
