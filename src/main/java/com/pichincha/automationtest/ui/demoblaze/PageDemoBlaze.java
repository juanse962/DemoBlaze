package com.pichincha.automationtest.ui.demoblaze;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
@DefaultUrl("page:webdriver.base.url.demoblaze")
public class PageDemoBlaze extends PageObject  {
    public static final Target SELECTED_PRODUCT = Target.the("'seleccionar producto1 {0}'").locatedBy("//a[normalize-space()='Samsung galaxy s6']");
    public static final Target SELECTED_PRODUCT2 = Target.the("'seleccionar producto2'").locatedBy("//a[contains(text(),'Samsung galaxy s7')]");
    public static final Target BUTTON_ADD_CART = Target.the("'agregar al carrito'").locatedBy("//a[normalize-space()='Add to cart']");
    public static final Target BUTTON_MENU = Target.the("'boton menu'").locatedBy("//a[@id='nava']//img");
    public static final Target BUTTON_CART = Target.the("'ir al carrito'").locatedBy("//a[@id='cartur']");

    public static final Target NAME = Target.the("'nombre del Cliente'").located(By.id("name"));
    public static final Target COUNTRY = Target.the("'pais del Cliente'").locatedBy("//input[@id='country']");
    public static final Target CITY = Target.the("'ciudad del Cliente'").locatedBy("//input[@id='city']");
    public static final Target CREDIT_CARD = Target.the("'numero de la Tarjeta'").locatedBy("//input[@id='card']");
    public static final Target MONTH = Target.the("'Mes de vencimiento de la Tarjeta'").locatedBy("//input[@id='month']");
    public static final Target YEAR = Target.the("''Anio de vencimiento de la Tarjeta'").locatedBy("//input[@id='year']");
    public static final Target BUTTON_PLACE_ORDER = Target.the("'Botón para continuar con la Compra'").locatedBy("//button[text()='Place Order']");
    public static final Target BUTTON_PURCHASE = Target.the("'Botón de realizar Compra'").locatedBy("//button[text()='Purchase']");
    public static final Target SUCCESSFULL_PURCHASE = Target.the("'Mensaje de Compra exitosa'").locatedBy("//*[.='Thank you for your purchase!']");


}
