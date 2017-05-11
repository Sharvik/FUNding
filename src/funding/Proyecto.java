package funding;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Proyecto {

    private int id;
    private String titulo;
    private String descripción;
    private Calendar fechaInicio;
    private Calendar fechaLimite;
    private EstadoProyecto estado;
    private Bolsa bolsa;

    public Proyecto() {
        this.bolsa = new Bolsa();
    }    
    
    public Proyecto(int id, String titulo, String descripción, 
            Calendar fechaLimite, EstadoProyecto estado, Bolsa bolsa) {
        this.id = id;
        this.titulo = titulo;
        this.descripción = descripción;
        this.fechaInicio = GregorianCalendar.getInstance();
        this.fechaLimite = fechaLimite;
        this.estado = estado;
        this.bolsa = bolsa;
    }
    
    public Proyecto(int id, String titulo, String descripción, 
            Calendar fechaLimite, EstadoProyecto estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripción = descripción;
        this.fechaInicio = GregorianCalendar.getInstance();
        this.fechaLimite = fechaLimite;
        this.estado = estado;
        this.bolsa = new Bolsa();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripción() {
        return descripción;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public Calendar getFechaLimite() {
        return fechaLimite;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public Bolsa getBolsa() {
        return bolsa;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaLimite(Calendar fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void finalizarProyecto(Proyecto proyecto) {
        estado = EstadoProyecto.FINALIZADO;
    }

    public EstadoProyecto estadoProyecto(Proyecto proyecto) {
        return estado;
    }

    public void pagarGestor(Usuario usuario) {
        Monedero dinero = usuario.getDinero();
        dinero.aumentarSaldo(bolsa.porcentajeGestor());
        usuario.ingresar(dinero);
    }

    public void pagarPromotor(Usuario usuario) {
        Monedero dinero = usuario.getDinero();
        dinero.aumentarSaldo(bolsa.porcentajePromotor());
        usuario.ingresar(dinero);
    }
    
}
