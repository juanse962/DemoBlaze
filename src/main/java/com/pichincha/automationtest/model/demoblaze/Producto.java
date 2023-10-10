package com.pichincha.automationtest.model.demoblaze;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {
    String nombreProducto1;
    String nombreProducto2;
    String mensaje;

    public Producto(String nombreProducto1, String nombreProducto2) {
        this.nombreProducto1 = nombreProducto1;
        this.nombreProducto2 = nombreProducto2;
    }

    public Producto(String mensaje) {
        this.mensaje = mensaje;
    }
}
