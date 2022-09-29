# Descripción

Página https://www.demoblaze.com/

## Detalles generales de la implementación

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (userinterface).
La estructura completa del proyecto es la siguiente:

````
+ exceptions
    Clases que controlan las posibles excepciones técnicas y de negocios que se presentan durante la ejecución de pruebas
+ model
    Clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interactions
    Clases que representan las interacciones directas con la interfaz de usuario
+ userinterface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objetos usados para consultar acerca del estado de la aplicación
+ util
    Clases de utilidad
+ runners
    Clases que permiten correr los tests
+ step definitions
    Clases que mapean las líneas Gherkin a código java
+ features
    La representación de las historias en archivos cucumber
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 7.1.

Nota: Si bien se recomienda ejecutar con Java 8 podria correr con Java 11.

## Para correr el proyecto

Para ejecutar este proyecto en diferentes navegadores se debe seguir el siguiente orden de ejecución:

    gradle clean 
    gradle test -Dcontext=navegador -Dwebdriver.driver=driverAUtilizar
    gradle aggregate

Independiente de si es en un solo navegador o varios, se generará el reporte en la carpeta **/target/site/serenity/**
abrir el archivo **index.html**

Ejemplo:

    gradle clean 
    gradle test -Dcontext=chrome -Dwebdriver.driver=chrome
    gradle test -Dcontext=firefox -Dwebdriver.driver=firefox
    gradle aggregate


##Actores

Para hacer uso del concepto de Soap Opera persona se describen los siguiente actores.

### Juan Perez
#### Caracteristicas
* Nombre Completo: Juan Perez
* Registrado: Si
* Nacionalidad: Colombia
* Ciudad de Residencia: Medellin
* Tarjeta de Credito
  * Numero: 123456789
  * Mes: 05
  * Año: 25

### Pedro Perez
#### Caracteristicas
* Nombre Completo: Pedro Perez
* Registrado: Si
* Nacionalidad: Colombia
* Ciudad de Residencia: Medellin
* Tarjeta de Credito
  * Numero: 223456789
  * Mes: 01
  * Año: 22

# Advertencia y/o Aclaraciones

Los datos de los actores se encuentran en una clase factory, esto se realiza de esta manera si se quisiera más adelante
usar algun otro patron como DAO o Repository para acceder a los datos desde una Base de Datos o algun otro medio de persistencia
