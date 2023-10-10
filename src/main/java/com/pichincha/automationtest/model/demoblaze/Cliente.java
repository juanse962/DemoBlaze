package com.pichincha.automationtest.model.demoblaze;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    String nombreApellido;
    String nombrePais;
    String nombreCiudad;
    String numoroTarjeta;
    String mes;
    String anio;


    public Cliente(String nombreApellido, String nombrePais, String nombreCiudad, String numoroTarjeta, String mes, String anio) {
        this.nombreApellido = nombreApellido;
        this.nombrePais = nombrePais;
        this.nombreCiudad = nombreCiudad;
        this.numoroTarjeta = numoroTarjeta;
        this.mes = mes;
        this.anio = anio;
    }
}
