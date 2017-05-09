package funding;

public class Bolsa {
    private double dinero;

    public Bolsa() {
        dinero = .0;
    }

    public Bolsa(double dinero) {
        this.dinero = dinero;
    }
    
    public void aumentarFondo(double dinero) {
        this.dinero += dinero;
    }
    
    public void disminuirFondo(double dinero) {
        this.dinero -= dinero;
    }
    
    public double mostrarFondo() {
        return dinero;
    }
    
    public double porcentajePromotor() {
        return 0.6*dinero;
    }
    
    public double porcentajeGestor() {
        return 0.4*dinero;
    }
}
