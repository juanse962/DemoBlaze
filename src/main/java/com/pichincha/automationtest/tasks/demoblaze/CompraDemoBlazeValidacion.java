package com.pichincha.automationtest.tasks.demoblaze;

import com.pichincha.automationtest.model.demoblaze.Producto;
import com.pichincha.automationtest.ui.demoblaze.PageDemoBlaze;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CompraDemoBlazeValidacion implements Task {

    private Producto producto ;

    public CompraDemoBlazeValidacion(Producto producto) {
        this.producto = producto;
    }

    public static CompraDemoBlazeValidacion mensajeCompra(Producto producto) {
        return instrumented(CompraDemoBlazeValidacion.class, producto);

    }

    @Step("{0} compra exitosa")
    @Override
    public <T extends Actor> void performAs(T actor) {
        Task.where("Mensaje de compra exitosa",
                Ensure.that(PageDemoBlaze.SUCCESSFULL_PURCHASE).hasText(producto.getMensaje())
        );
    }

}

