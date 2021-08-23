/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.ParseException;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;




/**
 *
 * @author Ulb-Kalema
 */
public class clsJson {

    
    
   public void readJsonfile(){
      JSONParser jsonParser;
        jsonParser = new JSONParser("./.json", null, true);
      try {
         //Parsing the contents of the JSON file
         JSONObject jsonObject = (JSONObject) jsonParser.parse();
         //Retrieving the array
         JSONArray jsonArray = (JSONArray) jsonObject.get("people");
         for(Object object : jsonArray) {
            JSONObject record = (JSONObject) object;
        }  
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}
