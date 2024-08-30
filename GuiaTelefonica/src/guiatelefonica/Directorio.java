package guiatelefonica;

import java.util.*;

public class Directorio {
    private final TreeMap<Long, Contacto> contactos;

    public Directorio() {
        this.contactos = new TreeMap<>();
    }

    // A. Agregar contacto
    public void agregarContacto(Long telefono, Contacto contacto) {
        contactos.put(telefono, contacto);
    }

    // B. Buscar contacto por teléfono
    public Contacto buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

    // C. Buscar teléfonos por apellido
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    // D. Buscar contactos por ciudad
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactosEnCiudad = new ArrayList<>();
        for (Contacto contacto : contactos.values()) {
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosEnCiudad.add(contacto);
            }
        }
        return contactosEnCiudad;
    }

    // E. Borrar contacto por teléfono
    public void borrarContacto(Long telefono) {
        contactos.remove(telefono);
    }
}

