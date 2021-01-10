package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import usertInterfaces.PaginaSimon;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Go implements Task
{
private PaginaSimon paginaSimon;

    public static Go toSimonPage()
    {
        return instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaSimon));
    }
}
