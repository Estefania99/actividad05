/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import models.ModelRfc;
import views.ViewRfc;
/**
/**
 *
 * @author LAB-1
 */
public class ControllerRfc {
    ModelRfc modelRfc;
    ViewRfc viewRfc;
    
    MouseListener ml = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getSource()==viewRfc.jb_calcular)jb_calcularMouseClicked();
            else if(e.getSource()==viewRfc.jb_borrar)jb_borrarMouseClicked();
        }
            

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    };
    public ControllerRfc(ModelRfc modelRfc, ViewRfc viewRfc){
        viewRfc.setVisible(true);
        this.modelRfc = modelRfc;
        this.viewRfc = viewRfc;
        this.viewRfc.jb_calcular.addMouseListener(ml);
        this.viewRfc.jb_borrar.addMouseListener(ml);
        initComponets();
    }
     private void initComponets() {
        viewRfc.setVisible(true);
    }
    private void jb_calcularMouseClicked(){
        viewRfc.setVisible(true);
         modelRfc.setApellido_paterno(viewRfc.jtf_apellido_paterno.getText());
         modelRfc.setApellido_materno(viewRfc.jtf_apellido_materno.getText());
         modelRfc.setNombre(viewRfc.jtf_nombre.getText());
         modelRfc.setDia((String)viewRfc.jcb_dia.getSelectedItem());
         modelRfc.setMes((String)viewRfc.jcb_mes.getSelectedItem());
         modelRfc.setAnio((String)viewRfc.jcb_anio.getSelectedItem());
         String RFC="";
         RFC = modelRfc.getApellido_paterno().substring(0,2);
         RFC = RFC.concat(modelRfc.getApellido_materno().substring(0,1));
         RFC = RFC.concat(modelRfc.getNombre().substring(0,1));
         RFC = RFC.concat(modelRfc.getAnio().substring(2,4));
         RFC = RFC.concat(modelRfc.getMes());
         RFC = RFC.concat(modelRfc.getDia());
         
         viewRfc.jtf_rfc.setText(RFC.toUpperCase()+modelRfc.getSAT());
       
         
    }
     
        private void jb_borrarMouseClicked() {                                        
        String nombre="";
        String apellido_paterno="";
        String apellido_materno="";
        String RFC="";
        this.viewRfc.jtf_nombre.setText(String.valueOf(nombre));
        this.viewRfc.jtf_apellido_paterno.setText(String.valueOf(apellido_paterno));
        this.viewRfc.jtf_apellido_materno.setText(String.valueOf(apellido_materno)); 
        this.viewRfc.jtf_rfc.setText(String.valueOf(RFC));
        this.viewRfc.jcb_dia.setSelectedItem(0);
        this.viewRfc.jcb_mes.setSelectedItem(0);
        this.viewRfc.jcb_anio.setSelectedItem(0);
    }   
    
}

