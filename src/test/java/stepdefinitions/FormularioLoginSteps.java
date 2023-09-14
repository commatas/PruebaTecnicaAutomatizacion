package stepdefinitions;
import cucumber.api.java.es.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import tasks.RegistrarDatos;
import userinterfaces.HomePage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterfaces.HomePage.VERIFICAR_ENVIO_FORMULARIO;


public class FormularioLoginSteps {

    //Decirle que navegador vamos a usar para la ejecución de las pruebas
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Marionette");
    private HomePage homePage = new HomePage();



    @Dado("^que un nuevo usuario accede hasta la pagina web$")
    public void queUnNuevoUsuarioAccedeHastaLaPaginaWeb() {
        //El actor puede navegar la web con el navegador
        actor.can(BrowseTheWeb.with(navegador));
        //Va a la página
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    //Con datos quemados directamente

    @Cuando("^el agrega (.*), (.*), (.*), (.*), (.*), (.*), (.*) al formulario$")
    public void elAgregaDatosAlFormulario(String nombre, String telefono, String email, String username, String pais, String ciudad, String password) {
        actor.wasAbleTo(
                RegistrarDatos.rellenar(nombre,telefono,email, username, pais, ciudad, password)

        );


    }

    @Entonces("^el usuario queda registrado$")
    public void elUsuarioQuedaRegistrado() {
        //El actor tiene que ver el texto presente
        actor.should(seeThat(the(VERIFICAR_ENVIO_FORMULARIO),  isPresent())
        );
    }

    //Con lista de datos

    @Cuando("^el agrega datos al formulario$")
    public void elAgregaDatosAlFormulario(List<String> datos) {
        actor.wasAbleTo(
                RegistrarDatos.rellenar(datos.get(0),datos.get(1),datos.get(2),datos.get(3),datos.get(4),datos.get(5),datos.get(6))
        );
    }

}
