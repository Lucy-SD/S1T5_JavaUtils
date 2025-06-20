# Manual de Compilación y Ejecución del Programa L1.E5:

## Estructura del Proyecto:

El proyecto consta de los siguientes archivos:
- `SerializationManager.java`: Contiene los métodos principales que implementan las funcionalidades del programa.
- `User.java`: Contiene los atributos y métodos relacionados al usuario.
- `Main.java`: Contiene el método `main` para interactuar con el usuario y ejecutar las funcionalidades.

### Funcionalidades:

1. ** Serializar un usuario y guardarlo en un fichero **
   - Solicita los datos del usuario y la ruta para guardar el archivo.
2. ** Deserializar usuarios desde un fichero **
   - Solicita datos de la ruta donde se encuentra el archivo, y (si los datos son correctos), muestra el contenido por consola.
3. ** Listar archivos .ser en un directorio **
   - Solicita la ruta del directorio, y (si los existen) lista todos los archivos .ser que contiene.

## Instrucciones de Compilación:

1. ** Abrir un Terminal o Consola **
   - Diríjase al directorio donde se encuentran los archivos `SerializationManager.java`, `User.java` y `Main.java`.
2. ** Compilar los Archivos **
   - Use el siguiente comando para compilar los archivos:
     javac -d . SerializationManager.java User.java Main.java
   - Esto generará una estructura de directorios basada en el paquete `exercise5` y creará los archivos `.class` correspondientes.

## Instrucciones de Ejecución:

1. ** Ejecutar el Programa **
   - Ejecute el programa con el siguiente comando desde el directorio raíz del proyecto:
     java exercise5.Main
2. ** Interacción con el Usuario **
   - El programa mostrará un menú con las siguientes opciones:
     Elige una opción (0 - 3):
            1. Serializar un usuario y guardarlo en un fichero;
            2. Deserializar usuarios desde un fichero;
            3. Listar archivos .ser en un directorio;
            0. Salir.
3. ** Seleccionar Funcionalidad **
   - Introduzca el número asociado a la funcionalidad que desea ejecutar y presione **Enter**.

## Funcionalidades Detalladas:

### 1. ** Serializar un usuario y guardarlo en un fichero **
   -- Descripción --
     Solicita el nombre y la edad del usuario, y la ruta donde guardar el archivo .ser. Genera y guarda un archivo
     con los datos del usuario, en la ruta solicitada.
     - Seleccione la opción `1` en el menú.
     - Introduzca <nombre del usuario>.
     - Introduzca <edad del usuario>.
     - Introduzca <ruta del directorio> donde desea guardarlo.
   -- Salida esperada --
     - Mensaje de que se ha generado el archivo correctamente.

### 2. ** Deserializar usuarios desde un fichero **
   -- Descripción --
     Solicita la ruta donde se encuentra el archivo .ser que se desea visualizar, lo lee y muestra por consola sus datos.
   -- Cómo usarlo --
     - Seleccione la opción `2` del menú.
     - Introduzca <ruta del directorio> cuya información desea ver.
   -- Salida esperada --
     - Muestra por consola la información del usuario guardada dentro del archivo.

### 3. ** Listar archivos .ser en un directorio **
   -- Descripción --
     Solicita la ruta a la que se quiere acceder para ver el listado de archivos .ser, y (si existen) los muestra por
     consola.
   -- Cómo usarlo --
     - Seleccione la opción `3` del menú.
     - Introduzca <ruta del directorio> cuyo listado de archivos .ser desea ver.
   -- Salida esperada --
     - Muestra por consola el listado de todos los archivos .ser encontrados en la ruta indicada.

## Manejo de Errores relacionados con directorios y rutas:

- ** Errores **
  - Si el directorio no existe:
        "Error: Directorio inexistente."
  - Si la ruta proporcionada está vacía:
        "Error: La ruta está vacía."
  - Si se ingresan caracteres alfabéticos en lugar de numéricos:
         "Error. Por favor ingrese un valor numérico."

## Notas Adicionales:

- Asegúrese de proporcionar rutas válidas y accesibles desde el sistema operativo.
- El programa es compatible con sistemas operativos Windows, macOS y Linux, siempre que las rutas se introduzcan
en el formato correcto para cada sistema.

Gracias por su Visita = )