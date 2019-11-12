
package sprint1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class LoginFXMLController implements Initializable {
    
    @FXML private Label label;
    @FXML TextField userName;
    @FXML PasswordField passWord;
    @FXML private Text actiontarget;
    @FXML private Button btn1;
    UserList users;

    public LoginFXMLController() throws FileNotFoundException {
        this.users = new UserList();
    }
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
        
        boolean authenticated = authenticateUser();
        if(authenticated)
        {
            Stage primaryStage = new Stage();
            Parent test = FXMLLoader.load(getClass().getResource("NavFXML.fxml"));
            Scene scene = new Scene(test, 500, 400);
            primaryStage.setTitle("Main Menu");
            primaryStage.setScene(scene);
            primaryStage.show();  
            userName.getScene().getWindow().hide();
            System.out.println("Authenticated");
        }
        else
        {
            System.out.println("Not authenticated");
            actiontarget.setText("User could not be authenticated");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public boolean authenticateUser()
    {
        int count = users.size();
        int x = 0;
        boolean authenticated = false;
        while(x < count)
        {
            if(users.getUser(x).getUserName().equalsIgnoreCase((userName.getCharacters().toString())) && users.getUser(x).getPassWord().equalsIgnoreCase(passWord.getCharacters().toString()))
            {
                authenticated = true;
                break;
            }
            else
            {
                authenticated = false;
            }
            x++;
        }
        return authenticated;
    }
    
}
