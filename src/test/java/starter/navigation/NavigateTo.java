package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable PhpTravels() {
        return Task.where("{0} opens the PageLogin home page",
                Open.browserOn().the(PhpTravels.class)
        );
    }
}