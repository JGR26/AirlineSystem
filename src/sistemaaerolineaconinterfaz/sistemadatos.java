/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaaerolineaconinterfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author HP USER
 */
public class sistemadatos {
    String nombre;
    String apellidos;
    String nacionalidad;
    String cedu;
    String edad;
    String fechanacimiento;
    String trabajo;
    String pasaporte;
    
    /**
     *Metodo en el cual el sistema le pide los datos al usuario
     */
    public void datos(){
        
        this.nombre= JOptionPane.showInputDialog("----Bienvenido a JGR Airlines----"+"\nDigite su nombre:");
        this.apellidos=JOptionPane.showInputDialog("Digite sus apellidos:");
        this.nacionalidad=JOptionPane.showInputDialog("Digite su nacionalidad:");
        this.cedu= JOptionPane.showInputDialog("Digite su numero de cedula:");
        this.edad= JOptionPane.showInputDialog("Digite su edad:");
        this.fechanacimiento= JOptionPane.showInputDialog("Digite su fecha de nacimiento:");
        this.trabajo= JOptionPane.showInputDialog("Cual es su empleo:");
        this.pasaporte=JOptionPane.showInputDialog("Digite su número de Pasaporte: ");
        String mensaje=toString();
        JOptionPane.showMessageDialog(null, mensaje);
  
        
    }

    @Override
    public String toString() {
        
        return "Sus datos son:\n"+"Nombre:"+nombre+"\nApellidos: "+apellidos+"\nNacionalidad: "+nacionalidad+"\nNumero de identificación: "+cedu+"\nEdad: "+edad+"\nFecha de Nacimiento: "+fechanacimiento+"\nEmpleo: "+trabajo+"\nNumero de pasaporte: "+pasaporte;
    //retorna al usuario los datos personales
    }

   
    
            
    
}
