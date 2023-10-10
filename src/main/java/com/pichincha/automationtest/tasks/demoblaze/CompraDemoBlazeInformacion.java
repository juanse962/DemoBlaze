package com.pichincha.automationtest.tasks.demoblaze;

import com.pichincha.automationtest.model.demoblaze.Cliente;
import com.pichincha.automationtest.ui.demoblaze.PageDemoBlaze;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CompraDemoBlazeInformacion implements Task {

    private  Cliente cliente ;

    public CompraDemoBlazeInformacion(Cliente cliente) {
        this.cliente = cliente;
    }

    public static CompraDemoBlazeInformacion datosCliente(Cliente cliente) {
        return instrumented(CompraDemoBlazeInformacion.class, cliente);

    }

    @Step("{0} seleciona el producto")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Task.where("Agregar la informacion del cliente",
                        Enter.theValue(cliente.getNombreApellido()).into(PageDemoBlaze.NAME),
                        Enter.theValue(cliente.getNombrePais()).into(PageDemoBlaze.COUNTRY),
                        Enter.theValue(cliente.getNombreCiudad()).into(PageDemoBlaze.CITY),
                        Enter.theValue(cliente.getNumoroTarjeta()).into(PageDemoBlaze.CREDIT_CARD),
                        Enter.theValue(cliente.getMes()).into(PageDemoBlaze.MONTH),
                        Enter.theValue(cliente.getAnio()).into(PageDemoBlaze.YEAR)
                ),
                Task.where("Continuar con la compra",
                        Click.on(PageDemoBlaze.BUTTON_PURCHASE)
                )
        );

    }

}

