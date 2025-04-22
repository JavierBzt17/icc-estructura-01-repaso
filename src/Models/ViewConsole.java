package Models;

public class ViewConsole {
    public void mostrarPersonas(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void mostrarPersona(Persona persona) {
        if (persona != null) {
            System.out.println("Persona encontrada: " + persona);
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    public void printMessage(String message, boolean newLine) {
        if (newLine) {
            System.out.println(message);
        } else {
            System.out.print(message);
        }
    }
}