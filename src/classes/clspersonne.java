/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ulb-Kalema
 */
public class clspersonne {
    private int id;
    private int age;
    private String nom;
    private String postnom;
    private String prenom;
    private String genre;
    private String ville;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the postnom
     */
    public String getPostnom() {
        return postnom;
    }

    /**
     * @param postnom the postnom to set
     */
    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }
    
    
    public static Connection ConnectToDB() throws Exception {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/bd_json_msyql";
      java.sql.Connection con = DriverManager.getConnection(mysqlUrl, "root", "MQ4k4z22MhB6vD8GvsrY87du75KiNW");
      return (Connection) con;
   }
    
   public void insertdata(clspersonne pers){
        try {
            Connection con = ConnectToDB();
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO tb_population (`id`, `nom`, `postnom`, `prenom`, `age`, `genre`, `ville`) values (?, ?, ?, ?, ?, ?, ? )");
            pstmt.setInt(1, pers.getId());
            pstmt.setString(2, pers.getNom());
            pstmt.setString(3, pers.getPostnom());
            pstmt.setString(4, pers.getPostnom());
            pstmt.setInt(5, pers.getAge());
            pstmt.setString(6, pers.getGenre());
            pstmt.setString(7, pers.getVille());
            pstmt.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(clspersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public void chargement(JTable tbl) throws SQLException {
        try {
            Connection con = ConnectToDB();
            PreparedStatement st = con.prepareStatement("SELECT * FROM `v_popupation`");
            ResultSet rs = st.executeQuery();
            tbl.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        } catch (Exception ex) {
            Logger.getLogger(clspersonne.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
