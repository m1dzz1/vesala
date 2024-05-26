package control;

import model.DatabaseUpravljac;
import model.Rec;
import view.GlavniProzor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;



/**
 *
 * @author Comp
 */
 //public class Logika {
    /*private DatabaseUpravljac dbUpravljac;
    private GlavniProzor view;

    public Logika(DatabaseUpravljac dbUpravljac, GlavniProzor view) {
        this.dbUpravljac = dbUpravljac;
        this.view = view;

        view.addAddWordListener(new AddWordListener());
        view.addAddCategoryListener(new AddCategoryListener());
        view.addGetRandomWordListener(new GetRandomWordListener());
}
    

class AddRecListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String rec = view.getRec();
                int kategorijaId = Integer.parseInt(view.getCategoryId());
                dbUpravljac.DodajRec(rec, kategorijaId);
                view.setDisplayText("Reč dodata uspešno!");
            } catch (SQLException ex) {
                ex.printStackTrace();
                view.setDisplayText("Greška pri dodavanju reči.");
            }
        }
    }
*/


