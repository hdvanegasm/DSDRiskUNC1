package AppAccount;

import Controller.ConnectionStatus;
import Controller.AllServices;
import Controller.Connection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author GROUP 1 UNC
 */
public class AccountManager {

    static final Boolean type = true;

    public static ConnectionStatus createAccount(String username, String password, String confirmPassword, String email) {

        if (type) {
            
            System.out.println("Entro original");
            if (password.equals(confirmPassword)) {

                JSONObject obj = new org.json.simple.JSONObject();
                obj.put("username", username);
                obj.put("password", password);
                obj.put("e-mail", email);
                obj.put("confirmPass", confirmPassword);

                try {

                    Connection c = new Connection();
                    JSONObject response = c.createConnection(AllServices.createUser, obj);
                    
                    System.out.println(response.toJSONString());
                    JSONParser parser = new JSONParser();
                    JSONArray array = (JSONArray) parser.parse("[" + response.toJSONString() + "]");

                    if (((JSONObject) (array.get(0))).get("result").equals("true")) {

                        return ConnectionStatus.SUCCESSFUL;
                    } else {
                        return ConnectionStatus.FAILED;
                    }

                } catch (Exception ex) {

                    ex.printStackTrace();
                    return ConnectionStatus.WITHOUT_CONNECTION;

                }

            } else {

                return ConnectionStatus.INVALID_PARAMETERS;
            }
        } else {

            if (password.equals(confirmPassword)) {

                JSONObject obj = new org.json.simple.JSONObject();
                obj.put("username", username);
                obj.put("password", password);
                obj.put("e-mail", email);
                obj.put("confirmPass", confirmPassword);

                try {

                    Connection c = new Connection();
                    JSONObject response = c.createConnection(AllServices.createUser, obj);
                    
                    System.out.println(c.getHttpCon().getHeaderField("result"));
                    return ConnectionStatus.SUCCESSFUL;
                    
                } catch (Exception ex) {

                    ex.printStackTrace();
                    return ConnectionStatus.WITHOUT_CONNECTION;

                }

            } else {

                return ConnectionStatus.INVALID_PARAMETERS;
            }
        }
    } 
}
