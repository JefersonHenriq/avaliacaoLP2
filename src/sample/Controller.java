package sample;

import com.data.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSobrenome;

    @FXML
    private Label labelSet;

    @FXML
    private void sendAction(ActionEvent event){

        Funcionario funcS = new Funcionario();

        funcS.setNome(txtNome.getText());
        funcS.setSobrenome(txtSobrenome.getText());

        labelSet.setText("O funcionario " + funcS.getNome() + " " + funcS.getSobrenome() + " foi adcionado com sucesso");

    }

    @FXML
    private void cancelAction(ActionEvent event){

        Funcionario funcS = new Funcionario();

        txtNome.setText("");
        txtSobrenome.setText("");

        funcS.setNome(txtNome.getText());
        funcS.setSobrenome(txtSobrenome.getText());

        labelSet.setText("Cancelado");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }

}
