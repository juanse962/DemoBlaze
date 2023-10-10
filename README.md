1. Prerequisitos:
- Maquina local con el sistema operativo Windows o MAC
- IDE IntelliJ IDEA Community Edition 2022.3.3
- Gradle version 7.6.1 (debe estar en la variable de entorno)
- JDK versión 11 o superior (debe estar en la variable de entorno)

2. Comandos de instalación
    * Descagar el proyecto en el directorio que desee
    * Abrir el proyecto con el IDE indicado  anteriormente
    * Esperar que se descargue todas las dependencias

3. Instrucciones para ejecutar los test
* Para realizar el proceso de ejecución de los escenarios dentro del proyecto se debe realizar el siguiente proceso:
  ir al siguiente directorio: nttdata-prueba-serenitybdd/src/test/java/com/pichincha/automationtest/runners
  ahí se encuentra  el archivo: WebRunnerTest en esa clase hacer un click derecho y dar un clip en Run'WebRunnerTest' 

4. Visualizar los reportes en la consola de IDE y el navegador de preferencia 
   Al terminar de ejcutar las pruebas en la consola del IDE se visualiza que la ejecución del
   scenario fue exitosa, adcional en el sieguiente dirctorio: nttdata-prueba-serenitybdd/build/reports
   se encuntra un archivo index.html, procedemos a abrir el archivo y movemos el mouse por la parte derecha
   y aparece los navegadores donde se puede visualizar el reporte,hacer clip en el navegador de preferencia
   y se abre el navegador


5. Información adicional
   Link de descarga de Gradle : https://downloads.gradle.org/distributions/gradle-7.6.1-all.zip

6. La automatización fue desarrollada con:

   * BDD - Estrategia de desarrollo
   * Screenplay
   * Gradle - Manejador de dependencias
   * Cucumber - Framework para automatizar pruebas BDD
   * Serenity BDD - Biblioteca de código abierto para la generación de reportes
   * Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

7. Documentacion

   * [Manual SerenityBDD](https://pichincha.atlassian.net/wiki/spaces/CS/pages/2440757667/Manual+Arquetipo+SerenityBDD+ScreenPlay)
