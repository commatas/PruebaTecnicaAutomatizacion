package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.GetAlertText;

@DefaultUrl("https://www.way2automation.com/way2auto_jquery/index.php")
public class HomePage extends PageObject {

//Identificar los objetos con los cuales vamos a interactuar
    public static final Target INPUT_RELLENAR_NOMBRE = Target.the("Input donde se ingresa el nombre").locatedBy("//div//div//fieldset[1]//input[1]");
    public static final Target INPUT_RELLENAR_TELEFONO = Target.the("Input donde se ingresa el telefono").locatedBy("//input[@type='tel']");
    public static final Target INPUT_RELLENAR_EMAIL = Target.the("Input donde se ingresa el email").locatedBy("//input[@type='email']");
    public static final Target INPUT_RELLENAR_USERNAME = Target.the("Input donde se ingresa el username").locatedBy("//fieldset[6]//input[1]");
    public static final Target SELECT_RELLENAR_PAIS = Target.the("Select donde se ingresa el pais").locatedBy("//form[@id='load_form']//fieldset//select");
    public static final Target INPUT_RELLNAR_CIUDAD = Target.the("Input donde se ingresa  la ciudad").locatedBy("//fieldset[5]//input[1]");
    public static final Target INPUT_RELLENAR_PASSWORD = Target.the("Input donde se ingresa la password").locatedBy("//div[@id='load_box']//input[@type='password']");

    public static final Target BUTTON_ENVIAR_FORMULARIO = Target.the("Boton enviar formulario").locatedBy("//div[@id='load_box']//form[@id='load_form']//div//input[@value='Submit']");

    public static final Target VERIFICAR_ENVIO_FORMULARIO = Target.the("Alerta envio satisfactorio").located(By.id("alert"));








   //username   select.pais     ciudad      password




}
