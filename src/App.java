import Controllers.PersonaController;
import Models.Direccion;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------Programa funcionando----------");

        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));

        ViewConsole cV = new ViewConsole();
        PersonaController pC =  new PersonaController();

        System.out.println("\n----------Arreglo----------");
        cV.printArray(personas);

        System.out.println("\n----------Arreglo ordenado----------");
        pC.sortByDireccionCodigo(personas);
        cV.printArray(personas);

        System.out.println("\n----------Busqueda----------");
        Persona encontrado = pC.findPersonaByCodigoDireccion(personas, 78);
        if (encontrado == null){
            System.out.println("No encontrado");
        }else{
            System.out.println("Encontrado: " + encontrado.toString());
        }
    }
}
