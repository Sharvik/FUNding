package funding;

public class Gestor extends Usuario {

    public Gestor() {
    }
    
    public Gestor(String dni, String nombre, int edad, String email, 
            String contraseña, String cuentaBancaria) {
        
        super(dni, nombre, edad, email, contraseña, cuentaBancaria);
    }

    
    
    public Gestor(String dni, String nombre, int edad, String email, 
            String nacionalidad, String contraseña, 
            String cuentaBancaria, Monedero dinero, double cantidad) {
        
        super(dni, nombre, edad, email, nacionalidad, contraseña, 
                cuentaBancaria, dinero, cantidad);
    }
    
    
    public void modificar(Proyecto proyecto, Promotor usuario) {
        usuario.modificar(proyecto);
    }
    
    public void eliminar(Proyecto proyecto, Promotor usuario) {
        usuario.eliminar(proyecto);
    }
    
}
