package EjComponenete;

public class Personita implements SerVivo{
    private String nombre;

    public Personita(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String caminar() {
        return " sabe correr y caminar, pero prefiere dormir.";
    }

    @Override
    public String toString() {
        return "Personita{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
