package categoryui;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sprint1.Category;
import sprint1.CategoryList;

public class CategoryUIController implements Initializable {
    
    @FXML private Button leftTicketButton;
    @FXML private Button leftCategoryButton;
    @FXML private Button leftUsersButton;
    @FXML private Button leftRoadButton;
    @FXML private Button removeButton;
    @FXML private Button editButton;
    @FXML private Button createButton;
    @FXML private TableView<Category> tableView;
    @FXML private TableColumn<Category, String> categoryName;
    @FXML private TableColumn<Category, String> categoryBranch;
    @FXML private TableColumn<Category, String> categoryTickets;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        categoryName.setCellValueFactory(new PropertyValueFactory<Category, String>("name"));
        categoryBranch.setCellValueFactory(new PropertyValueFactory<Category, String>("branch"));
        categoryTickets.setCellValueFactory(new PropertyValueFactory<Category, String>("numNotes"));
        
        tableView.getItems().setAll(getCategoryList());
        
        System.out.println("I am in categoryUI controller");
    }    
    
    public ObservableList<Category> getCategoryList(){
        CategoryList categoryList = new CategoryList();
        
        return categoryList.getList();
      
    }
    
    @FXML protected void leftTicketPressed(ActionEvent event) throws IOException
    {
        
    }
    @FXML protected void leftCategoryPressed(ActionEvent event) throws IOException
    {
        
    }
    @FXML protected void leftUserPressed(ActionEvent event) throws IOException
    {
        
    }
    @FXML protected void leftRoadPressed(ActionEvent event) throws IOException
    {
        
    }
     @FXML protected void removeButtonPressed(ActionEvent event) throws IOException
    {
        
    }
      @FXML protected void editButtonPressed(ActionEvent event) throws IOException
    {
        
    }
     @FXML protected void createButtonPressed(ActionEvent event) throws IOException
    {
   
    }
    
}
