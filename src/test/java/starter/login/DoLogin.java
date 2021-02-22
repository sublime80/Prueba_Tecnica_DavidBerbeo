package starter.login;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.apache.commons.io.FileUtils.waitFor;
import static starter.login.LocatorsForm.BLOG_BUTTON_ADD;

public class DoLogin implements Task {

    private final String username;
    private final String password;


    public DoLogin(String username, String password){
        this.username = username;
        this.password = password;
    }
     public  static Performable withCredential(String username, String password){
        return instrumented(DoLogin.class, username, password);
     }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LocatorsForm.USERNAME_FIELD),
                Enter.theValue(password).into(LocatorsForm.PASSWORD_FIELD),
                Click.on(LocatorsForm.LOGIN_BUTTON),
                Click.on(LocatorsForm.BLOG_BUTTON),
                Click.on(LocatorsForm.BLOG_BUTTONCATEGORIES)

        );
        WebDriver driver;
        //System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;

        actor.attemptsTo(
                Click.on(BLOG_BUTTON_ADD),
                Click.on(LocatorsForm.BLOG_FIELD_CATEGORYNAME)
        );
    }
}
