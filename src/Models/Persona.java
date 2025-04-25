package Models;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion dirección;
//-------------------------------------------------------------------------------------------------------------
    public Persona(String nombre, int edad, Direccion dirección) {
        this.nombre = nombre;
        this.edad = edad;
        this.dirección = dirección;
    }
//-------------------------------------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDirección() {
        return dirección;
    }

    public void setDirección(Direccion dirección) {
        this.dirección = dirección;
    }

    public int getCodigoDirreccion(){
        return dirección.getCodigo();
    }
//-------------------------------------------------------------------------------------------------------------
    public boolean compareCodigoDireccion(Persona persona){
        return getCodigoDirreccion() > persona.getCodigoDirreccion();
    }
    public boolean compareCodigoDireccion(int codigo){
        return getCodigoDirreccion() > codigo;
    }
//-------------------------------------------------------------------------------------------------------------
    public boolean equalsByCodigoDireccion(int codigo){
        return getCodigoDirreccion() == codigo;
    }
//-------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Persona: Nombre:" + nombre + ", edad=" + edad + ", dirección=" + dirección + "]";
    }
    
}
