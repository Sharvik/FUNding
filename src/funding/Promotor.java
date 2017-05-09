package funding;

import java.util.ArrayList;

public class Promotor extends Usuario{
    
    private ArrayList<Proyecto> proyecto;

    public Promotor() {
    }
    
    public Promotor(Proyecto proyecto, String dni, String nombre, int edad, 
            String email, String contraseña, String cuentaBancaria, double cantidad) {
        super(dni, nombre, edad, email, contraseña, cuentaBancaria);
        this.proyecto = new ArrayList<>();
        this.proyecto.add(proyecto);
    }
    
    public Promotor(String dni, String nombre, int edad, String email, 
            String nacionalidad, String contraseña, 
            String cuentaBancaria, Monedero dinero, double cantidad) {
        
        super(dni, nombre, edad, email, nacionalidad, contraseña, 
                cuentaBancaria, dinero, cantidad);
        this.proyecto = new ArrayList<>();
    }
    
    public ArrayList<Proyecto> getProyectoList() {
        return proyecto;
    }
    
    public Proyecto getProyecto(int i) {
        return proyecto.get(i);
    }

    public void crear(Proyecto proyecto) {
        this.proyecto.add(proyecto);
    }
    
    public void modificar(Proyecto proyecto) {
        this.proyecto.set(this.proyecto.indexOf(proyecto), proyecto);
    }
    
    public void eliminar(Proyecto proyecto) {
        this.proyecto.remove(proyecto);
    }
    
    public void prueba(Proyecto proyecto) {
        System.out.println("Hola");
    }
}
