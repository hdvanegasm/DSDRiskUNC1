package Model;

import Vista.LogInGUI;
import Controller.AllServices;
import Controller.Connection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author GROUP 1 UNC
 */
public class Account {

    public String username;
    private String password;
    private String email;
    public Integer numberOfSessionslost;
    public Integer numberOfSessionsWon;
    public Float percentageOfWins;
    public ArrayList<Contact> contactList;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        numberOfSessionslost = 0;
        numberOfSessionsWon = 0;
        percentageOfWins = (float) 0;
        contactList = new ArrayList<Contact>();
    }

    public static Account createAccount(String username, String password, String email) {
        return null;
    }

    public static Account loginAccount(String username, String password, LogInGUI frame) {

        JSONObject obj = new org.json.simple.JSONObject();

        obj.put("username", username);
        obj.put("password", password);

        try {
            //connection.createConnection(controller.AllServices.logIn, obj);

            return new Account(username, password, "email");

        } catch (Exception e) {

            System.out.println("entro aqui 1");
            JOptionPane.showConfirmDialog(frame, "The connection has a problem, try again", "Error message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public static boolean logoutAccount() {
        //se envia al servidor un txt con el username de quein se esta
        //saliendo de la cuenta
        return true;
    }

    public boolean changePassword(String username, String password, String newPassword) {
        //Se envia al servidor un txt con username, contraseña y contraseña nueva
        //y se espera respuesta si se cambio la contraseña con exito o fallo
        return true;
    }

}
