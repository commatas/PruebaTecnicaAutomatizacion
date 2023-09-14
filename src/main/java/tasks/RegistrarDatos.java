package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class RegistrarDatos implements Task {

    //Crear una variable para la clase, que va a recibir lo que se envie desde el step
    private String nombre;
    private String telefono;
    private String email;
    private String username;
    private String pais;
    private String ciudad;
    private String password;
    //Se crea su respectivo constructor
    public RegistrarDatos(String nombre, String telefono,String email, String username, String pais, String ciudad, String password){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.username = username;
        this.pais = pais;
        this.ciudad = ciudad;
        this.password = password;
    }

    //Override en este case hereda al actor que se viene trabajando en steps
    //Recibe la sesion para empezar a trabajar ahí mismo
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(INPUT_RELLENAR_NOMBRE), //Diligencia campo
                Enter.theValue(telefono).into(INPUT_RELLENAR_TELEFONO),
                Enter.theValue(email).into(INPUT_RELLENAR_EMAIL),
                Enter.theValue(username).into(INPUT_RELLENAR_USERNAME),
                SelectFromOptions.byVisibleText(pais).from(SELECT_RELLENAR_PAIS), //Seleccionar item del select de pais
                Enter.theValue(ciudad).into(INPUT_RELLNAR_CIUDAD),
                Enter.theValue(password).into(INPUT_RELLENAR_PASSWORD),

                //Dos opciones validas
                //Darle al enter
                Hit.the(Keys.ENTER).into(BUTTON_ENVIAR_FORMULARIO)
                //Seleccionar el submit mediante un click
                //Click.on()
                //Assert.assertTrue((VERIFICAR_ENVIO_FORMULARIO.equals("This is just a dummy form, you just clicked SUBMIT BUTTON"))

                //Assert.assertTrue(VERIFICAR_ENVIO_FORMULARIO)

        );

    }
    //Acciones que vamos a realizar dentro de nuestra task
    //Metodo performable es que tenga unos pasos a seguir
    //Retorna la accion al actor
    //Se cambia Performable por RegistrarDatos ya que un hijo puede reemplazar al padre
    public static RegistrarDatos rellenar(String nombre, String telefono, String email, String username, String pais, String ciudad, String password) {
        //Instrumented es para instanciar una clase, evitar hacerlo con el new
        return instrumented(RegistrarDatos.class, nombre, telefono, email, username, pais, ciudad, password);

    }
}
