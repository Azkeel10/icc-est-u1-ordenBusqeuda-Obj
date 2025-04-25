package Controllers;
import Models.Persona;

public class PersonaController {
//-------------------------------------------------------------------------------------------------------------
    public void sortByDireccionCodigo(Persona[] people){
        for (int i = 0; i < people.length; i++){
            int index = i;

            for (int j = i + 1; j < people.length; j++){
                if (people[j].getCodigoDirreccion() < people[index].getCodigoDirreccion()){
                    index = j;
                }
            }

            if (index != i){
                Persona temp = people[index];
                people[index] = people[i];
                people[i] = temp; 
            }
        }
    }
//-------------------------------------------------------------------------------------------------------------
    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo){
        int bajo = 0;
        int alto=personas.length - 1;

        while (bajo<alto) {
            int center = (bajo+alto) /2;

            if(personas[center].equalsByCodigoDireccion(codigo)){
                return personas[center];
            }
            if(personas[center].getCodigoDirreccion() < codigo){
                bajo = center + 1;
            }else{
                alto = center - 1;
            }
        }
        return null;
    }
}
