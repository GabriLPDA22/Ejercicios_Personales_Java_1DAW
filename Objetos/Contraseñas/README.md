# Ejercicio de Gestión de Contraseñas

Este ejercicio tiene como objetivo la implementación de una clase `Password` que cumple con ciertos criterios de seguridad y un programa principal que genera múltiples contraseñas y determina su fortaleza.

## Descripción

El ejercicio consiste en crear la clase `Password` con las siguientes especificaciones:

### Clase `Password`

#### Atributos

- `longitud`: Un entero que representa la longitud de la contraseña. Por defecto, será 8.
- `contraseña`: Una cadena de texto que almacena la contraseña.

#### Constructores

- Constructor por defecto: Inicializa la contraseña con una longitud predeterminada de 8 caracteres.
- Constructor con longitud: Acepta un entero que define la longitud de la contraseña y genera una contraseña aleatoria de esa longitud.

#### Métodos

- `esFuerte()`: Devuelve un booleano que indica si la contraseña es fuerte o no. Para ser considerada fuerte, la contraseña debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.
- `generarPassword()`: Genera una nueva contraseña aleatoria basada en la longitud actual del objeto.
- Métodos `get` para `contraseña` y `longitud`.
- Método `set` para `longitud`.

### Clase Principal (main)

- Solicita al usuario que introduzca la cantidad de contraseñas a generar y la longitud deseada.
- Crea un array de objetos `Password`.
- Genera un array paralelo que indica si cada contraseña generada es fuerte o no.
- Muestra las contraseñas y su fortaleza.

## Instrucciones

1. Implementa la clase `Password` con los atributos, constructores y métodos descritos.
2. Crea una clase principal con un método `main` para ejecutar el programa.
3. El programa debe pedir al usuario la cantidad de contraseñas a generar y su longitud.
4. El programa debe generar un array de contraseñas y otro array paralelo que indique la fortaleza de cada contraseña.
5. Al final, el programa mostrará cada contraseña junto con un indicador de si es fuerte o no.

## Formato de Salida

El programa debe mostrar las contraseñas y su fortaleza en el siguiente formato:

```
contraseña1 esFuerte
contraseña2 esFuerte
...
```

Donde `esFuerte` es un valor booleano que indica si la contraseña es fuerte (`true`) o no (`false`).