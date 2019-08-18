# AUTGoogleSearchJava
This repository contains a basic automation of searching word process on google in java languaje

# Ejecución del proyecto
* En la clase Drivers, se de modificar la ruta desde la cual el proyecto tomará el driver de google chrome para abrir la instancia del navegador, ejemplo: _`private static String driverpath = "/Users/testingPC/Documents/proyectos/librerias/chromedriver";`_
* Ejecutar el comando `mvn clean verify`, esto permite descargar todas las depencias indicadas en el archivo pom.xml y ejecutar automaticamente los escenarios de prueba.
* Si no se realiza la ejecución del proyeto inmendiatamente, una vez escrito el comando anterior, por favor ejeutar el feature de la sigueinte manera: `mvn test -Dcucumber.options="src/test/resources/features/BuscarPalabra.feature"`
