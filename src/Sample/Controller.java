package Sample;

import Factory.Enum.TipoDeAmendoim;
import Factory.Enum.TipoDeBebida;
import Factory.Enum.TipoDeChocolate;
import Factory.Enum.TipoDeJujuba;
import Factory.Maquinas.*;
import Factory.Snacks.Snacks;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private MaquinaDeSnacks maquina;

    @FXML
    private ComboBox<String> cbJujubas;
    private List<String> jujubas = new ArrayList<>();
    private ObservableList<String> obJujubas;

    @FXML
    private ComboBox<String> cbBebidas;
    private List<String> bebidas = new ArrayList<>();
    private ObservableList<String> obBebidas;

    @FXML
    private ComboBox<String> cbChocolates;
    private List<String> chocolates = new ArrayList<>();
    private ObservableList<String> obChocolates;

    @FXML
    private ComboBox<String> cbAmendoins;
    private List<String> amendoins = new ArrayList<>();
    private ObservableList<String> obAmendoins;

    @FXML
    private Button btnJujubas;

    @FXML
    private Button btnBebidas;

    @FXML
    private Button btnChocolates;

    @FXML
    private Button btnAmendoins;

    @FXML
    void pegarAmendoins() {
        MaquinaDeAmendoim maquina = new MaquinaDeAmendoim();
        String op = cbAmendoins.getSelectionModel().getSelectedItem();
        if(op.equals(amendoins.get(0)))
            maquina.entregaSnacks(TipoDeAmendoim.CHOCOLATE);
        else if(op.equals(amendoins.get(1)))
            maquina.entregaSnacks(TipoDeAmendoim.SALGADO);
        else if(op.equals(amendoins.get(2)))
            maquina.entregaSnacks(TipoDeAmendoim.JAPONES);
    }

    @FXML
    void pegarChocolates() {
        MaquinaDeChocolate maquina = new MaquinaDeChocolate();
        String op = cbChocolates.getSelectionModel().getSelectedItem();
        if(op.equals(chocolates.get(0)))
            maquina.entregaSnacks(TipoDeChocolate.BELGA);
        else if(op.equals(chocolates.get(1)))
            maquina.entregaSnacks(TipoDeChocolate.AMARGO);
        else if(op.equals(chocolates.get(2)))
            maquina.entregaSnacks(TipoDeChocolate.AO_LEITE);
    }

    @FXML
    void pegarBebidas() {
        MaquinaDeBebidas maquina =  new MaquinaDeBebidas();
        String op = cbBebidas.getSelectionModel().getSelectedItem();
        if(op.equals(bebidas.get(0)))
            maquina.entregaSnacks(TipoDeBebida.COCACOLA);
        else if(op.equals(bebidas.get(1)))
            maquina.entregaSnacks(TipoDeBebida.SPRITE);
        else if(op.equals(bebidas.get(2)))
            maquina.entregaSnacks(TipoDeBebida.CHÁ_GELADO);
        else if(op.equals(bebidas.get(3)))
            maquina.entregaSnacks(TipoDeBebida.DELL_VALE);
    }

    @FXML
    void pegarJujubas() {
        MaquinaDeJujubas maquina = new MaquinaDeJujubas();
        String op = cbJujubas.getSelectionModel().getSelectedItem();
        if(op.equals(jujubas.get(0)))
            maquina.entregaSnacks(TipoDeJujuba.GOMA);
        else if(op.equals(jujubas.get(1)))
            maquina.entregaSnacks(TipoDeJujuba.AÇUCARADA);
        else if(op.equals(jujubas.get(2)))
            maquina.entregaSnacks(TipoDeJujuba.IOGURTE);
    }


    public void carregarSnacks(){
        //Bebidas
        String coca = "Coca-Cola";
        String sprite = "Sprite";
        String cháGelado = "Chá Gelado";
        String dellVale = "Dell Vale";
        bebidas.add(coca);
        bebidas.add(sprite);
        bebidas.add(cháGelado);
        bebidas.add(dellVale);
        obBebidas = FXCollections.observableArrayList(bebidas);
        cbBebidas.setItems(obBebidas);

        //Amendoins
        String amendoimChocolate = "Amendoim de Chocolate";
        String amendoimSalgado = "Amendoim Salgado";
        String amendoimJapones = "Amendoim Japones";
        amendoins.add(amendoimChocolate);
        amendoins.add(amendoimSalgado);
        amendoins.add(amendoimJapones);
        obAmendoins = FXCollections.observableArrayList(amendoins);
        cbAmendoins.setItems(obAmendoins);

        //Jujubas
        String jujubaDeGoma = "Jujuba de Goma";
        String jujubaAçucarada = "Jujuba Açucarada";
        String jujubaDeIogurte = "Jujuba de Iogurte";
        jujubas.add(jujubaDeGoma);
        jujubas.add(jujubaAçucarada);
        jujubas.add(jujubaDeIogurte);
        obJujubas = FXCollections.observableArrayList(jujubas);
        cbJujubas.setItems(obJujubas);

        //Chocolates
        String chocolateBelga = "Chocolate Belga";
        String chocolateAmargo = "Chocolate Amargo";
        String chocolateAoLeite = "Chocolate Ao Leite";
        chocolates.add(chocolateBelga);
        chocolates.add(chocolateAmargo);
        chocolates.add(chocolateAoLeite);
        obChocolates = FXCollections.observableArrayList(chocolates);
        cbChocolates.setItems(obChocolates);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        carregarSnacks();
    }
}
