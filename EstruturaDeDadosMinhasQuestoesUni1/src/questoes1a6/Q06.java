package questoes1a6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;



public class Q06 implements Initializable   {
	
	// construa um programa que gerencia a conta de uma piazzaria 
	//preço do refi = 1.50  //preco da fatia = 3.00 //taxa garçom = 10%
	// receber => qunatidade de refri, fatias e pessoas na mesa
	// Calcular e exibri => total sem taxa, total com taxa e rateio por pessoa 
	 
	    @FXML
	    private TextField quantRefri;

	    @FXML
	    private TextField quantFatias;

	    @FXML
	    private Label totalComTaxa;

	    @FXML
	    private Button gerar;

	    @FXML
	    private TextField quantMesa;

	    @FXML
	    private Label totalSemTaxa;

	    @FXML
	    private Label rateioPessoa;

	    
	    @FXML
	    void gerarConta(MouseEvent event) {
	    	
	    	System.out.println("teste dois");
	    	float quantR =  Float.parseFloat(quantRefri.getText());
	    	float quantfa = Float.parseFloat(quantFatias.getText());
	    	float quantMes = Float.parseFloat(quantMesa.getText());
	    	System.out.println("teste ");

	    	// ver decimal format
	    	
	    	System.out.println("qauntidade: " + quantR);
	    	float totalRefri = quantR * 1.50f;
	    	float totalFatias = quantfa * 3.0f;
	    	float totalSemtaxac = totalRefri + totalFatias;

	    	
	    	totalSemTaxa.setText(Double.toString(totalSemtaxac)); // label total sem taxa 
	    	
	    	float totalComTaxag = totalSemtaxac * 1.1f;
	    	totalComTaxa.setText(Float.toString(totalComTaxag)); // label total com taxa 

	    	float rateioPesso = totalComTaxag / quantMes;
	    	rateioPessoa.setText(Float.toString(rateioPesso));
	    	
	    	
	    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
