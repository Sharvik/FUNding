package funding;

public class Monedero {
    private double dinero;

    public Monedero() {
        dinero = .0;
    }
    
    public Monedero(double dinero) {
        this.dinero = dinero;
    }
    
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double mostrarSaldo() {
        return dinero;
    }
    
    public void aumentarSaldo(double dinero){
        this.dinero += dinero;
    }
    
    public void disminuirSaldo() {
        this.dinero -= dinero;
    }
}
