package usertInterfaces;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistroSimon extends PageObject
{

    public static final Target primerClik =
            Target.the("select type of person").located(By.id("select2-drop-mask"));

    public static final Target Typer_Personal_Natural =
            Target.the("select type of person").located(By.xpath("//*[@id='select2-results-15']/li[1]"));

    public static final Target Typer_Identificacion_Ced =
            Target.the("select type of identify").located(By.xpath("//*[@id='select2-results-16']/li[1]"));

    public static final Target Number_Identificacion =
            Target.the("Number").located(By.id("numeroidentificacion"));

    public static final Target Names=
            Target.the("Names").located(By.id("nombres"));

    public static final Target Last_Name=
            Target.the("Last Name").located(By.id("apellidos"));

    public static final Target Typer_Genero =
            Target.the("select type of Sex").located(By.xpath("//*[@id='genero']/option[3]"));

    public static final Target Birthday=
            Target.the("Birthday").located(By.id("fechanacimiento"));

    public static final Target Password=
            Target.the("password").located(By.id("clave_uno"));

    public static final Target Rep_Password=
            Target.the("password").located(By.id("clave_dos"));
}
