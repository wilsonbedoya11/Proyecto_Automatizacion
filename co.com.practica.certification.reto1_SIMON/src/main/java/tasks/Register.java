package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import usertInterfaces.PaginaRegistroSimon;

public class Register implements Task {
    private String tipo_persona;
    private String tipo_identificacion;
    private String numero_identificacion;
    private String name;
    private String last_name;
    private String gener;
    private String birthday;
    private String password;


    public Register(String tipo_persona, String tipo_identificacion, String numero_identificacion, String name, String last_name, String gener, String birthday, String password) {
        this.tipo_persona = tipo_persona;
        this.tipo_identificacion = tipo_identificacion;
        this.numero_identificacion = numero_identificacion;
        this.name = name;
        this.last_name = last_name;
        this.gener = gener;
        this.birthday = birthday;
        this.password = password;
    }

    public static Register FillIn(String tipo_persona, String tipo_identificacion, String numero_identificacion, String name, String last_name, String gener, String birthday, String password) {
       System.out.println(name);
        return Tasks.instrumented(Register.class, tipo_persona, tipo_identificacion, numero_identificacion, name, last_name, gener, birthday, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(PaginaRegistroSimon.primerClik),
                Click.on(PaginaRegistroSimon.Typer_Personal_Natural),
                Enter.theValue(name).into(PaginaRegistroSimon.Names));

    }
}