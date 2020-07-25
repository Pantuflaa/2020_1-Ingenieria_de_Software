# Tomc's

Proyecto realizado primer semestre 2020 para la Universidad Técnica Federico Santa María. Corresponde a una API realizada en springboot.


# Proyecto Ingeniería de Software

### Prerequisitos

Para poder utilizar la aplicación necesitan tener instalado lo siguiente:

* [Maven](https://maven.apache.org/)  
* [Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
* [Postgres](https://www.postgresql.org/download/)

### Preparativos
Antes de montar el proyecto se debe crear una base de datos en postgres con el nombre personal. Una vez creada la base de datos se debe ejecutar el script dentro de la carpeta Api el cual se llama create.sql. Pare ejecutarlo se debe copiar su contenido, y pegarlo en la opción 'Create Script' de PgAdmin4. Finalmente, en la carpeta resources dentro de la carpeta API, se debe modificar el valor de la contraseña de la base de datos en el archivo 'applicaction.properties'.

### Montar
Para poder montar el proyecto primero deben realizar lo siguiente:
* Abrir la consola de comandos y dirigirse a la carpeta API, luego ejecutar:
```
mvn install
mvn spring-boot:run
```
Nota: De esta forma se montará la api en el puerto 8000 por defecto, en caso de tenerlo ocupado puede modificar su valor en 'application.properties', donde modificó la contraseña de la base de datos.

## Autores

* **Sebastián Campos** 
* **Gabriel Carmona**
* **Jorge Ludueña**



