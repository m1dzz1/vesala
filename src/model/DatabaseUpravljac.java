/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Comp
 */
public class DatabaseUpravljac {
    
    private Connection c;

    public DatabaseUpravljac(){//1
        
    try
    {//2
    c=DriverManager.getConnection("jdbc:ucanaccess://src\\resursi\\DatabaseVesala.accdb");
    }//2
    catch(SQLException ex)
    {
        Logger.getLogger(DatabaseUpravljac.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ne mogu da se povezem sa bazom", "Greska", JOptionPane.ERROR_MESSAGE);
    }
    
}//1
    
    

    public void DodajRec(String r, int kID ) throws SQLException {
        String query = "INSERT INTO Reci (Rec, KategorijaID) VALUES (?, ?)";
        PreparedStatement preparedStatement = c.prepareStatement(query);
        preparedStatement.setString(1, r);
        preparedStatement.setInt(2, kID);
        preparedStatement.executeUpdate();
    }

    public void DodajKategoriju(String ka) throws SQLException {
        String query = "INSERT INTO Kategorije (KategorijaIme) VALUES (?)";
        PreparedStatement preparedStatement = c.prepareStatement(query);
        preparedStatement.setString(1, ka);
        preparedStatement.executeUpdate();
    }

    public Rec getRandomRec() throws SQLException {
        List<Rec> reci = new ArrayList<>();
        String query = "SELECT * FROM reci";
        Statement statement = c.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            reci.add(new Rec(resultSet.getString("Rec"), resultSet.getInt("KategorijaID")));
        }
        Random random = new Random();
        return reci.get(random.nextInt(reci.size()));
    }
}
    
    
    
    

