package guiatelefonica;

public class GuiaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        // Creacion de Contactos
        Contacto c1 = new Contacto("12345678", "Juan", "Perez", "Buenos Aires", "Calle Falsa 123");
        Contacto c2 = new Contacto("87654321", "Ana", "Lopez", "Rosario", "Calle Verdadera 321");
        Contacto c3 = new Contacto("11223344", "Luis", "Martinez", "Buenos Aires", "Calle Real 456");
        Contacto c4 = new Contacto("99887766", "Carla", "Garcia", "Mendoza", "Avenida Siempreviva 742");

        // A. Agregar contactos al directorio
        directorio.agregarContacto(2657154895L, c1);
        directorio.agregarContacto(2657122458L, c2);
        directorio.agregarContacto(3514645847L, c3);
        directorio.agregarContacto(11458451224L, c4);

        // B. Buscar contacto por teléfono
        System.out.println("Buscar contacto por teléfono (2657154895): " + directorio.buscarContacto(2657154895L));

        // C. Buscar teléfonos por apellido
        System.out.println("Buscar teléfonos por apellido (Perez): " + directorio.buscarTelefono("Perez"));

        // D. Buscar contactos por ciudad
        System.out.println("Buscar contactos por ciudad (Buenos Aires): " + directorio.buscarContactos("Buenos Aires"));

        // E. Borrar contacto por teléfono
        directorio.borrarContacto(2657154895L);
        System.out.println("Después de eliminar contacto con teléfono 2657154895: ");
        System.out.println("Buscar contacto por teléfono (2657154895): " + directorio.buscarContacto(2657154895L));
    }
}