/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import view.mainPHL;
import control.*;
/**
 *
 * @author green
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainPHL i = new mainPHL();
        i.setVisible(true);
        controlMenu controlm = new controlMenu(i);
    }
    
}
