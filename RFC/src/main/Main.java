/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
    import controller.ControllerRfc;
    import models.ModelRfc;
    import views.ViewRfc;
/**
 *
 * @author LAB-1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelRfc model = new ModelRfc();
        ViewRfc view = new ViewRfc();
        ControllerRfc ControllerRfc = new ControllerRfc( model ,  view);
    }
    
}
