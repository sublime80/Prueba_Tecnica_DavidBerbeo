package starter.stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinition {

    String name;

    @Before
    public void setTheStage(){
        System.out.println("okescena");
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que (.*) es un usuario registrado")
    public void que_admin_es_un_usuario_registrado(String name) {
        this.name = name;
        System.out.println("okususario");
    }

    @Cuando("el ingrese sus credenciales")
    public void el_ingrese_sus_credenciales() {
        System.out.println("okcredenciales");
        //theActorInTheSpotlight().attemptsTo( NavigateTo.PhpTravels());
        theActorCalled(name).attemptsTo(NavigateTo.PhpTravels(), DoLogin.withCredential("admin@phptravels.com", "demoadmin"));

        System.out.println("okTask");
    }

    @Entonces("el tendrá un ingreso exitoso")
    public void el_tendra_un_ingreso_exitoso() {
        System.out.println("autenticación exitosa");

    }

}
