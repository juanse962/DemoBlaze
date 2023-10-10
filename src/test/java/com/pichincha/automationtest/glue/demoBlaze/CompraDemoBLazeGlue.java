package com.pichincha.automationtest.glue.demoBlaze;
import com.pichincha.automationtest.model.demoblaze.Cliente;
import com.pichincha.automationtest.model.demoblaze.Producto;
import com.pichincha.automationtest.tasks.demoblaze.CompraDemoBlaze;
import com.pichincha.automationtest.tasks.demoblaze.CompraDemoBlazeInformacion;
import com.pichincha.automationtest.ui.demoblaze.PageDemoBlaze;
import com.pichincha.automationtest.tasks.demoblaze.CompraDemoBlazeValidacion;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class CompraDemoBLazeGlue {
    @Given("que el {actor} ingresa a la pagina de demoblaze y selecciona el dispositivo1: {string} y el dispositivo2: {string}")
    public void queElClienteIngresaALaPaginaDeDemoblazeYSeleccionaElDispositivo1YElDispositivo2(Actor actor, String producto1, String producto2) {
        Producto producto = new Producto(producto1,producto2);
        System.out.println(" producto ---->"+producto);
        givenThat(actor).attemptsTo(Open.browserOn().the(PageDemoBlaze.class));
        andThat(actor).wasAbleTo(
                CompraDemoBlaze.datosProducto(producto));


    }
    @When("decide continuar con compra ingresa sus datos personales nombre:{string}, pais:{string}, ciudad:{string}, tarjeta:{string}, mes:{string} y anio:{string}")
    public void decideContinuarConCompraIngresaSusDatosPersonalesNombrePaisCiudadTarjetaMesYAnio(String nombre, String pais, String ciudad, String numeroTarjeta, String mes, String anio) {
        Cliente cliente = new Cliente(nombre,pais,ciudad,numeroTarjeta,mes,anio);
        when(theActorInTheSpotlight()).attemptsTo(
                CompraDemoBlazeInformacion.datosCliente(cliente)
        );

    }
    @Then("la compra se realiza de manera exitosa con el siguiente mensaje: {string}")
    public void laCompraSeRealizaDeManeraExitosaConElSiguienteMensaje(String mensaje) {
        Producto producto = new Producto(mensaje);
        when(theActorInTheSpotlight()).attemptsTo(
                CompraDemoBlazeValidacion.mensajeCompra(producto)
        );
    }
}