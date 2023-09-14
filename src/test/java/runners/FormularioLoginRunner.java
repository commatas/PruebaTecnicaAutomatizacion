package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/FormularioLogin.feature",
        glue = "stepdefinitions",
        //Se especifica el tag del escenario que se quiera correr
        tags = "@EscenarioConEjemplos",
        snippets = SnippetType.CAMELCASE

)
public class FormularioLoginRunner {
}
