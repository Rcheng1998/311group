package sprint1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class CategoryList {
    ObservableList<Category> list = FXCollections.observableArrayList();

    public CategoryList() {
        initializeList();
    }

    public ObservableList<Category> getList() {
        return list;
    }

    private void initializeList() {
        list.add(new Category("Fire Location", "Fire Fighters", "12"));
        list.add(new Category("Human Injuries","EMS", "24"));
        list.add(new Category("Road Obstruction","Police, Fire Fighters", "22"));
  
    }
    
}
