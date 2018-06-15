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
        try {
            switch (op){
                case "Amendoim de Chocolate":
                    maquina.entregaSnacks(TipoDeAmendoim.CHOCOLATE);
                    break;

                case "Amendoim Salgado":
                    maquina.entregaSnacks(TipoDeAmendoim.SALGADO);
                    break;

                case "Amendoim Japones":
                    maquina.entregaSnacks(TipoDeAmendoim.JAPONES);
                    break;
            }
        } catch (RuntimeException e){
            System.out.println("nada");
        }
    }

    @FXML
    void pegarChocolates() {
        MaquinaDeChocolate maquina = new MaquinaDeChocolate();
        String op = cbChocolates.getSelectionModel().getSelectedItem();
        try {
            switch (op) {
                case "Chocolate Belga":
                    maquina.entregaSnacks(TipoDeChocolate.BELGA);
                    break;

                case "Chocolate Amargo":
                    maquina.entregaSnacks(TipoDeChocolate.AMARGO);
                    break;

                case "Chocolate Ao Leite":
                    maquina.entregaSnacks(TipoDeChocolate.AO_LEITE);
                    break;
            }
        } catch (RuntimeException e){
            System.out.println("Escolha um Chocolate");
        }
    }

    @FXML
    void pegarBebidas() {
        MaquinaDeBebidas maquina =  new MaquinaDeBebidas();
        String op = cbBebidas.getSelectionModel().getSelectedItem();
        try {
            switch (op){
                case "Coca-Cola":
                    maquina.entregaSnacks(TipoDeBebida.COCACOLA);
                    break;

                case "Sprite":
                    maquina.entregaSnacks(TipoDeBebida.SPRITE);
                    break;

                case "Chá Gelado":
                    maquina.entregaSnacks(TipoDeBebida.CHÁ_GELADO);
                    break;

                case "Dell Vale":
                    maquina.entregaSnacks(TipoDeBebida.DELL_VALE);
                    break;
            }
        } catch (RuntimeException e){
            System.out.println("Escolha uma Bebida");
        }
    }

    @FXML
    void pegarJujubas() {
        MaquinaDeJujubas maquina = new MaquinaDeJujubas();
        String op = cbJujubas.getSelectionModel().getSelectedItem();
        try {
            switch (op){
                case "Jujuba de Goma":
                    maquina.entregaSnacks(TipoDeJujuba.GOMA);
                    break;

                case "Jujuba Açucarada":
                    maquina.entregaSnacks(TipoDeJujuba.AÇUCARADA);
                    break;

                case "Jujuba de Iogurte":
                    maquina.entregaSnacks(TipoDeJujuba.IOGURTE);
                    break;
            }
        } catch (RuntimeException e){
            System.out.println("Escolha uma Jujuba");
        }
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
