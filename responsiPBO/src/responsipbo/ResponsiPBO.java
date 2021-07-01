/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

/**
 *
 * @author wachid op
 */
public class ResponsiPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBKoneksi DB = new DBKoneksi();
        ViewHome viewhome = new ViewHome(DB);
        viewhome.setVisible(true);
    }
    
}
