package sistemaaerolineaconinterfaz;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * 24/3/2021 13:04
 *
 * @author JGR
 */
public class Aero {

    /**
     * El metodo recoge información de otras clases para iniciar el sistema
     */
    public static void inicio() {
        String mens = "";
        String menupaises = "";
        String info = "";
        sistemadatos datos = new sistemadatos();
        Date fecha = new Date();// objeto para imprimir fecha del dia exacto
        datos.datos();
        if (datos.nombre.equals("") || datos.apellidos.equals("") || datos.nacionalidad.equals("") || datos.edad.equals("") || datos.cedu.equals("") || datos.fechanacimiento.equals("") || datos.trabajo.equals("") || datos.pasaporte.equals("")) {
            //condición para impedir que se siga con el resto del programa 
            mens = "Debe ingresar sus datos personales para continuar";
            JOptionPane.showMessageDialog(null, mens);
        } else {
            menupaises = "Nuestros planes de viaje actuales tienen los siguientes destinos:\n"
                    + "1) París\n2) Miami\n3) Cancun\n4) Madrid\n5) Londres\n";

            JOptionPane.showMessageDialog(null, menupaises);//se imprimira en una interfaz los paises a los cuales e pueden viajar

            String menu = JOptionPane.showInputDialog("Digite el numero del país al que desea viajar:");
            //esta variable pedira al usuario mediante una interfaz cual es la opcion deseada
            switch (menu) {//utilizo un switch para dar diferente información segun el deseo del usuario

                case "1":
                    String mensaje = "\nParis:\nEl paquete de viaje se le presentara a continuación ";
                    JOptionPane.showMessageDialog(null, mensaje);
                    String horarios = "Paris:\nPor favor, eliga uno de los siguientes horarios:\n18:00 PM\n 02:00 AM\n00:30 AM";
                    String horar = JOptionPane.showInputDialog(horarios);
                    String dias = "Paris:\nPor favor, digite cuanto tiempo desea quedarse en el país: ";
                    String days = JOptionPane.showInputDialog(dias);
                    int numtiquet = (int) (Math.random() * 33000 + 1);//utilizo el Math random para devolver al cliente un numero de tiquete
                    info = "Datos personales:\n" + datos.toString() + "Destino: Paris" + "\nHorario de vuelo elegido: " + horar + "\nDias de estancia en el país:" + days + "\nNumero de tiquete:" + numtiquet + "\nFecha de retiro del tiquete:" + fecha;
                    JOptionPane.showMessageDialog(null, info);
                    break;
                case "2":
                    mensaje = "\nMiami:\nEl paquete de viaje se le presentara a continuación ";
                    JOptionPane.showMessageDialog(null, mensaje);
                    horarios = "Miami:\nPor favor, eliga uno de los siguientes horarios:\n22:00 PM\n09:00 AM\n10:30 AM";
                    horar = JOptionPane.showInputDialog(horarios);
                    dias = "Miami:\nPor favor, digite cuanto tiempo desea quedarse en el país: ";
                    days = JOptionPane.showInputDialog(dias);
                    numtiquet = (int) (Math.random() * 33000 + 1);
                    info = "Datos personales:\n" + datos.toString() + "Destino: Miami" + "\nHorario de vuelo elegido: " + horar + "\nDias de estancia en el país:" + days + "\nNumero de tiquete:" + numtiquet + "\nFecha de retiro del tiquete:" + fecha;
                    JOptionPane.showMessageDialog(null, info);
                    break;
                case "3":

                    mensaje = "\nCancún:\nEl paquete de viaje se le presentara a continuación ";
                    JOptionPane.showMessageDialog(null, mensaje);
                    horarios = "Cancún:\nPor favor, eliga uno de los siguientes horarios:\n18:00 PM\n2:00 AM\n00:30 AM";
                    horar = JOptionPane.showInputDialog(horarios);
                    dias = "Cancún:\nPor favor, digite cuanto tiempo desea quedarse en el país: ";
                    days = JOptionPane.showInputDialog(dias);
                    numtiquet = (int) (Math.random() * 33000 + 1);
                    info = "Datos personales:\n" + datos.toString() + "Destino: Cancún" + "\nHorario de vuelo elegido: " + horar + "\nDias de estancia en el país:" + days + "\nNumero de tiquete:" + numtiquet + "\nFecha de retiro del tiquete:" + fecha;
                    JOptionPane.showMessageDialog(null, info);
                    break;

                case "4":
                    mensaje = "\nMadrid:\nEl paquete de viaje se le presentara a continuación ";
                    JOptionPane.showMessageDialog(null, mensaje);
                    horarios = "Madrid:\nPor favor, eliga uno de los siguientes horarios:\n08:00 AM\n21:00 PM\n10:30 AM";
                    horar = JOptionPane.showInputDialog(horarios);
                    dias = "Madrid:\nPor favor, digite cuanto tiempo desea quedarse en el país: ";
                    days = JOptionPane.showInputDialog(dias);
                    numtiquet = (int) (Math.random() * 33000 + 1);
                    info = "Datos personales:\n" + datos.toString() + "Destino: Madrid" + "\nHorario de vuelo elegido: " + horar + "\nDias de estancia en el país:" + days + "\nNumero de tiquete:" + numtiquet + "\nFecha de retiro del tiquete:" + fecha;
                    JOptionPane.showMessageDialog(null, info);
                    break;

                case "5":

                    mensaje = "\nLondres:\nEl paquete de viaje se le presentara a continuación ";
                    JOptionPane.showMessageDialog(null, mensaje);
                    horarios = "Londres:\nPor favor, eliga uno de los siguientes horarios:\n20:00 PM\n12:00 PM\n01:30 AM";
                    horar = JOptionPane.showInputDialog(horarios);
                    dias = "Londres:\nPor favor, digite cuanto tiempo desea quedarse en el país: ";
                    days = JOptionPane.showInputDialog(dias);
                    numtiquet = (int) (Math.random() * 33000 + 1);
                    info = "Datos personales:\n" + datos.toString() + "Destino: Londres" + "\nHorario de vuelo elegido: " + horar + "\nDias de estancia en el país:" + days + "\nNumero de tiquete:" + numtiquet + "\nFecha de retiro del tiquete:" + fecha;
                    JOptionPane.showMessageDialog(null, info);
                    break;
            }
        }

    }

    public static void main(String[] args) {
        inicio();//donde se inicia el programa 
    }

}
