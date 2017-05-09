package funding;

abstract public class Usuario {
    private String dni;
    private String nombre;
    private int edad;
    private String email;
    private String nacionalidad;
    private String contraseña;
    private String cuentaBancaria;
    private Monedero dinero;
    
    public Usuario() {  
        this.dinero = new Monedero();
    }

    public Usuario(String dni, String nombre, int edad, String email, 
            String nacionalidad, String contraseña, 
            String cuentaBancaria, Monedero dinero, double cantidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.nacionalidad = nacionalidad;
        this.contraseña = contraseña;
        this.cuentaBancaria = cuentaBancaria;
        this.dinero = new Monedero(cantidad);
    }

    public Usuario(String dni, String nombre, int edad, String email, 
            String contraseña, String cuentaBancaria) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.contraseña = contraseña;
        this.cuentaBancaria = cuentaBancaria;
        dinero = new Monedero();
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public Monedero getDinero() {
        return dinero;
    }
    
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
    
    // Dudo...
    public void ingresar(Monedero dinero) {
        this.dinero = dinero;
    }
    
} 