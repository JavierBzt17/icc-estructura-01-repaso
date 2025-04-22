import Models.Persona;
import Models.ViewConsole;
import Controllers.PersonaController;

public class App {
    public static void main(String[] args) {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
        };

        PersonaController pc = new PersonaController();
        ViewConsole vc = new ViewConsole();
        vc.printMessage("Personas antes de ordenar:", true);
        vc.mostrarPersonas(personas);
        pc.ordenarPorEdad(personas);
        vc.printMessage("Personas después de ordenar por edad:", true);
        vc.mostrarPersonas(personas);
        int edadBuscada = 28;
        vc.printMessage("Buscando persona con edad: " + edadBuscada, true);
        Persona encontrada = pc.buscarPorEdad(personas, edadBuscada);
        vc.mostrarPersona(encontrada);
    }
}