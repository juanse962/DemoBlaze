package com.pichincha.automationtest.tasks.demoblaze;
import com.pichincha.automationtest.model.demoblaze.Producto;
import com.pichincha.automationtest.ui.demoblaze.PageDemoBlaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CompraDemoBlaze implements Task {

    private   Producto producto;

    public CompraDemoBlaze(Producto producto) {
        this.producto = producto;
    }

    public static CompraDemoBlaze datosProducto(Producto producto) {
        return instrumented(CompraDemoBlaze.class, producto);

    }
    @Step("{0} seleciona el producto")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Task.where(" Agregar el producto 1",
                        Click.on(PageDemoBlaze.BUTTON_MENU),
                        Click.on(PageDemoBlaze.SELECTED_PRODUCT),
                        Click.on(PageDemoBlaze.BUTTON_ADD_CART))
        );
        acceptProduct(actor);
        actor.attemptsTo(
                Task.where("Agregar el producto 2",
                        Click.on(PageDemoBlaze.BUTTON_MENU),
                        Click.on(PageDemoBlaze.SELECTED_PRODUCT2),
                        Click.on(PageDemoBlaze.BUTTON_ADD_CART)
                ));


        actor.attemptsTo(
                Task.where("Ir al carrito de compras y continuar",
                        Click.on(PageDemoBlaze.BUTTON_CART),
                        Click.on(PageDemoBlaze.BUTTON_PLACE_ORDER)
                ));
    }
    public void acceptProduct(Actor actor) {
        WebDriverWait wait = new WebDriverWait(BrowseTheWeb.as(actor).getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
    }
}

