package logica;

//import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearCliente(int num_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atención_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        
        Cliente client = new Cliente();
        
        client.setNum_cliente(num_cliente);
        client.setNombre_perro(nombre_perro);
        client.setRaza(raza);
        client.setColor(color);
        client.setAlergico(alergico);
        client.setAtención_especial(atención_especial);
        client.setNombre_duenio(nombre_duenio);
        client.setCelular_duenio(celular_duenio);
        client.setObservaciones(observaciones);
            
        controlPersis.crearCliente(client);
    }

    public void crearCliente(Cliente client) {
        controlPersis.crearCliente(client);
    }

    /* Proximamente...
    public void eliminarCliente(Cliente client) {
        controlPersis.eliminarCliente(client);
    }

    public void eliminarCliente(int id) {
        controlPersis.eliminarCliente(id);
    }

    public List<Cliente> obtenerClientes() {
        return controlPersis.obtenerClientes();
    }

    public void modificarCliente(Cliente client) {
        controlPersis.modificarCliente(client);
    }

    public Cliente buscarCliente(Cliente client) {
        return controlPersis.buscarCliente(client);
    }

    public Cliente buscarCliente(int id) {
        return controlPersis.buscarCliente(id);
    }
     */
}
