package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class ApiTest {

	ApiTest apitest = new ApiTest();

	@Dado("que eu esteja  api")
	public void que_eu_esteja_api(String string) {

		apitest.que_eu_esteja_api("https://jsonplaceholder.typicode.com/users/");

	}

	@Entao("valido o status code de retorno {string}")
	public void valido_o_status_code_de_retorno(String string) {

	   
	}

	@Dado("que eu acesse api para consultar o profissional")
	public void que_eu_acesse_api_para_consultar_o_profissional() {

	}

	@Entao("valido o nome")
	public void valido_o_nome() {

	}

}
