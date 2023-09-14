# language: es

  Característica: Registro en un pagina
    Como un usuario nuevo
    Quiero ingresar a la pagina https://www.way2automation.com/way2auto_jquery/index.php
    Para crear una cuenta

    @EscenarioSinEjemplos
    Escenario: Agregar datos al formulario
      Dado que un nuevo usuario accede hasta la pagina web
      Cuando el agrega Juan Sebastian Turriago Delgado, 3168175394, juan@turriago.com, jstd, Colombia, bogota, 123456 al formulario
      Entonces el usuario queda registrado


    @EscenarioConEjemplos
    Esquema del escenario: Agregar datos al formulario
      Dado que un nuevo usuario accede hasta la pagina web
      Cuando el agrega datos al formulario
        | <nombre> | <telefono> | <email> | <username> | <pais> | <ciudad> | <password> |
      Entonces el usuario queda registrado

      Ejemplos:

      #SET DE DATOS
      | nombre                           | telefono   | email             | username | pais      | ciudad  | password |
      | Juan Sebastian Turriago Delgado  | 3178175493 | juan@turriago.com | jstd     | Colombia  | bogota  | 123456   |
      | Luis Fernando Galan Lozano       | 1234567894 | luis@galan.com    | lfgl     | Venezuela | caracas | 123457   |
      | Diana Esperanza Gomez Torres     | 9876543216 | diana@gomez.com   | degt     | Colombia  | cali    | 123458   |

