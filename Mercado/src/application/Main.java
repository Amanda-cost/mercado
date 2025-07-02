package application;
	
import dao.ClienteDAO;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Cliente;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ClienteDAO clienteDAO = new ClienteDAO();
		
		cliente.setNomeCliente("Amanda Costa");
		cliente.setCpfCliente("43236598541");
		cliente.setDataNasc("2005-05-11");
		cliente.setTelefone("63993894110");
		cliente.setEndereco("rua alamedas, numero 73");
		cliente.setEmail("amanda@gmail.com");
		
		clienteDAO.create(cliente);
		
		launch(args);
	}
}
