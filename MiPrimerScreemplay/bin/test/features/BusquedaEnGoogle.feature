Feature: Busqueda en google con datos desde el feature
  Stuven quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: buscar en google
    Given  Stiven esta en el sitio de google
    When Stiven busca la frase "<palabra>" compuesta "<palabrados>" 
    Then Stiven verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra          | palabrados            | resultadoEsperado    |
      | Hp               |multifuncional         | Hp multifuncional    |
      | Alejandro        |sanz                   | Alejandro sanz       |
      | Pedro            |Picapiedra             | supersonico          |


