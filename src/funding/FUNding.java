package funding;

import gui.Panel;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FUNding {

    public static void main(String[] args) throws IOException {
        Monedero monedero1 = new Monedero();
        Monedero monedero2 = new Monedero();
        Monedero monedero3 = new Monedero();

        ArrayList<Proyecto> proyecto1 = new ArrayList<>();
        ArrayList<Proyecto> proyecto2 = new ArrayList<>();
        ArrayList<Proyecto> proyecto3 = new ArrayList<>();

        Promotor usuario1 = new Promotor("1", "John Cena", 45, "repartoostias@gmail.com",
                "alienigena", "ironfist", "banco1", monedero1, 312.09);
        Gestor usuario2 = new Gestor("2", "Mark Zuckerberg Jr.", 65, "tugestor@gmail.com",
                "albano", "manageme", "banco2", monedero2, 7012.19);
        Promotor usuario3 = new Promotor("3", "Pepe Benavente", 42, "cantofatal@gmail.com",
                "francés", "promote", "banco3", monedero3, 0.0);

        Calendar hoy = GregorianCalendar.getInstance();
        Calendar c1 = GregorianCalendar.getInstance();
        Calendar c2 = GregorianCalendar.getInstance();
        Calendar c3 = GregorianCalendar.getInstance();
        Calendar c4 = GregorianCalendar.getInstance();

        c1.set(2000, 10, 05);
        c2.set(1955, 02, 14);
        c3.set(2017, 02, 14);
        c4.set(2018, 02, 14);

        Bolsa bolsa1 = new Bolsa(2000.01);
        Bolsa bolsa2 = new Bolsa(-15.05);
        Bolsa bolsa3 = new Bolsa(0.55);

        Proyecto proye1 = new Proyecto(0, "Nuevo proyecto", "Nueva descripción",
                hoy, EstadoProyecto.INICIADO);
        Proyecto proye2 = new Proyecto(1, "Nuevo proyecto 2", "Nueva descripción 2",
                c1, EstadoProyecto.INICIADO);
        Proyecto proye3 = new Proyecto(2, "Nuevo proyecto 3", "Nueva descripción 3",
                c2, EstadoProyecto.FINALIZADO, bolsa1);
        Proyecto proye4 = new Proyecto(3, "Nuevo proyecto 4", "Nueva descripción 4",
                c3, EstadoProyecto.INICIADO, bolsa2);
        Proyecto proye5 = new Proyecto(4, "Nuevo proyecto 5", "Nueva descripción 5",
                c4, EstadoProyecto.FINALIZADO, bolsa3);

        usuario1.crear(proye1);
        usuario1.crear(proye2);
        usuario1.crear(proye3);

        usuario3.crear(proye4);
        usuario3.crear(proye5);

        FileWriter fw;
        BufferedWriter bw;
        String line;

        bw = new BufferedWriter(new FileWriter("proyectos.txt"));

        proyecto1 = usuario1.getProyectoList();
        proyecto3 = usuario3.getProyectoList();
        proyecto2.addAll(proyecto1);
        proyecto2.addAll(proyecto3);

        for (int i = 0; i < proyecto1.size(); i++) {
            line = usuario1.getEmail() + ":" + usuario1.getContraseña()
                    + ":"+"Promotor"+":" + usuario1.getNombre() + ":"
                    + usuario1.getDinero().mostrarSaldo() + ":"
                    + usuario1.getProyecto(i).getTitulo() + ":"
                    + usuario1.getProyecto(i).getDescripción() + ":" 
                    + usuario1.getProyecto(i).getBolsa().mostrarFondo() + ":"
                    + usuario1.getProyecto(i).getEstado();
            bw.write(line);
            bw.newLine();
        }
        
        for (int i = 0; i < proyecto3.size(); i++) {
            line = usuario3.getEmail() + ":" + usuario3.getContraseña()
                    + "Promotor"+ ":" + usuario3.getNombre() + ":"
                    + usuario3.getDinero().mostrarSaldo() + ":"
                    + usuario3.getProyecto(i).getTitulo() + ":"
                    + usuario3.getProyecto(i).getDescripción() + ":" 
                    + usuario3.getProyecto(i).getBolsa().mostrarFondo() + ":"
                    + usuario3.getProyecto(i).getEstado();
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        Panel panel = new Panel();
        panel.setVisible(true);
    }

}
