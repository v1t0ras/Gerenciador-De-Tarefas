/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication2;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Vitor
 */
public class MainController implements Initializable {

    /**
     *
     * Initializes the controller class.
     */
    @FXML
    private TableView<Tarefa> tableLista;
    
    @FXML
    private TableColumn<Tarefa, String> nomeTarefa;
    
    @FXML
    private TableColumn<Tarefa, String> descTarefa;
    
    @FXML
    private TableColumn<Tarefa, String> valTarefa;
    
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnLimpar;
    
    @FXML
    private TextArea txtDesc;

    @FXML
    private TextArea txtNome;

    @FXML
    private DatePicker txtVal;
    
    String nome;
    String desc;
    LocalDate val;

    
    ObservableList<Tarefa> lista = FXCollections.observableArrayList();
    
    public void clear(){
        txtNome.setText(null);
        txtDesc.setText(null);
        txtVal.setValue(null);
    }
    
    @FXML
    public void onBtnClear(ActionEvent event){
       clear();
    }
    
    @FXML
    public void onBtnAdd(ActionEvent event){
        nome = txtNome.getText();
        desc = txtDesc.getText();
        val = txtVal.getValue();
        
        clear();
        lista.add(new Tarefa(nome,desc,val));
        tableLista.refresh();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        nomeTarefa.setCellValueFactory(new PropertyValueFactory<>("nome"));
        descTarefa.setCellValueFactory(new PropertyValueFactory<>("desc"));
        valTarefa.setCellValueFactory(new PropertyValueFactory<>("val"));
        
        tableLista.setItems(lista);
    }    
    
}
