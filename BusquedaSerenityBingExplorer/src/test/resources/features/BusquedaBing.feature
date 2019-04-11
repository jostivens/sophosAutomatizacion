
@tag
Feature: Buscar en Bing con datos desde el feature
  Stiven quiere hacer una busqueda en bing con datos

  @tag2
  Scenario Outline: Buscar en bing
    Given Stiven esta en la pagina de bing
    When Busca la frase compuesta entre "<Valor1>" y "<Valor2>" 
    Then Stiven verifica que la palabra compuesta "< ResultadoEsperado >" se encuentre en la lista de resultados encontrados

    Examples: 
      | Valor1         | Valor2          | ResultadoEsperado      |
      | Hp             | multifuncional  | Hp multifuncional      |
      | multifuncional | hpdesck         | falla                  |
      | activacion     | Claro           | activacion Claro       |
