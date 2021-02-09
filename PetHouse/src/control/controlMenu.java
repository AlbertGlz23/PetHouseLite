/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Albert
 */
public class controlMenu implements ActionListener{
    private mainPHL vista;
    
    public controlMenu(mainPHL vista){
        this.vista = vista;
        this.vista.getClientes().addActionListener(this);
        this.vista.getMascotasR().addActionListener(this);
        this.vista.getMascotasA().addActionListener(this);
        this.vista.getMascotasC().addActionListener(this);
        this.vista.getSolicitudesA().addActionListener(this);
        this.vista.getSolicitudesE().addActionListener(this);
        this.vista.getRInventario().addActionListener(this);
    }
    
   public void actionPerformed(ActionEvent event){
        if(vista.getClientes() == event.getSource()){
            VistaCliente vc = new VistaCliente();
            controlCliente cc = new controlCliente(vc);
            vc.setVisible(true);
            vista.dispose();
        }
        if(vista.getMascotasR() == event.getSource()){
            VistaMascotasR vm = new VistaMascotasR();
            vm.setVisible(true);
            vista.dispose();
        }
        if(vista.getMascotasA() == event.getSource()){
            VistaMascotasA vm = new VistaMascotasA();
            vm.setVisible(true);
            vista.dispose();
        }
        if(vista.getMascotasC() == event.getSource()){
            VistaMascotasC vm = new VistaMascotasC();
            vm.setVisible(true);
            vista.dispose();
        }
        if(vista.getSolicitudesA() == event.getSource()){
            VistaSolicitudA vs = new VistaSolicitudA();
            vs.setVisible(true);
            vista.dispose();
        }
        if(vista.getSolicitudesE() == event.getSource()){
            VistaSolicitudE vs = new VistaSolicitudE();
            vs.setVisible(true);
            vista.dispose();
        }
        if(vista.getRInventario() == event.getSource()){
            VistaInventario vi = new VistaInventario();
            vi.setVisible(true);
            vista.dispose();
        }
   }
   
}
