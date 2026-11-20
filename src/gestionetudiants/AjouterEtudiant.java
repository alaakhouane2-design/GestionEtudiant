/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionetudiants;

import java.awt.event.ActionEvent;

/**
 *
 * @author hp
 */
class AjouterEtudiant {

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void jButton1ActionPerformed(ActionEvent evt, Dashboord dashboord) {
        CarteEtudiant c = new CarteEtudiant();
        c.setVisible(true);
        dashboord.dispose();
    }
    
}
