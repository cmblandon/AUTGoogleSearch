Feature: Buscar Palabra
  Description: Esta función busca la palabra pruebaz en google y evalua el resultado

  @Smoke
  Scenario: Buscar Palabra
    Given el usuario se encuentra en la pagina de google https://www.google.com.co/
    When ingresa la palabra pruebaz
    Then se muestran los resultado en pantalla