@REQ_NTTDATA @CompraProducto
Feature: Compra de productos dispositivos en la página web de Demoblaze

  @id:1 @CompraExitosa
Scenario Outline: T-E2E - Compra Exitosa de Dispositivos Móviles  sin sin realizar login
  Given que el cliente ingresa a la pagina de demoblaze y selecciona el dispositivo1: "<producto1>" y el dispositivo2: "<producto2>"
  When decide continuar con compra ingresa sus datos personales nombre:"<nombre>", pais:"<pais>", ciudad:"<ciudad>", tarjeta:"<tarjeta>", mes:"<mes>" y anio:"<anio>"
  Then la compra se realiza de manera exitosa con el siguiente mensaje: "<mensaje>"
  Examples:
  | @externaldata@demo/DataCompraDemoBlaze.csv |