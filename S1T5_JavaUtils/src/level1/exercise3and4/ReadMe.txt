# Manual de Compilación y Ejecución del Programa L1.E3y4:

## Estructura del Proyecto:

El proyecto consta de los siguientes archivos:
- `DirectoryManager.java`: Contiene los métodos principales que implementan las funcionalidades del programa.
- `Main.java`: Contiene el método `main` para interactuar con el usuario y ejecutar las funcionalidades.

### Funcionalidades:

1. ** Guardar un listado alfabético del contendido del directorio en un archivo .txt **
   - Genera un listado alfabético de los archivos y carpetas dentro de un directorio y lo guarda en un archivo .txt.
2. ** Guardar el árbol del directorio (en niveles y contenido) en un archivo .txt **
   - Genera un árbol jerárquico de un directorio y sus subdirectorios, y lo guarda en un archivo .txt.


## Instrucciones de Compilación:

1. ** Abrir un Terminal o Consola **
   - Diríjase al directorio donde se encuentran los archivos `DirectoryManager.java` y `Main.java`.
2. ** Compilar los Archivos **
   - Use el siguiente comando para compilar los archivos:
     javac -d . DirectoryManager.java Main.java
   - Esto generará una estructura de directorios basada en el paquete `exercise3and4` y creará los archivos `.class` correspondientes.

## Instrucciones de Ejecución:

1. ** Ejecutar el Programa **
   - Ejecute el programa con el siguiente comando desde el directorio raíz del proyecto:
     java exercise3and4.Main
2. ** Interacción con el Usuario **
   - El programa mostrará un menú con las siguientes opciones:
        Elige una opción (0 - 3):
            1. Guardar un listado alfabético del contendido del directorio en un archivo .txt;
            2. Guardar el árbol del directorio (en niveles y contenido) en un archivo .txt;
            3. Ver el contenido de un archivo .txt;
            0. Salir.
3. ** Seleccionar Funcionalidad **
   - Introduzca el número asociado a la funcionalidad que desea ejecutar y presione **Enter**.

## Funcionalidades Detalladas:

### 1. ** Guardar un listado alfabético del contendido del directorio en un archivo .txt **
   -- Descripción --
     Genera un listado alfabético de los archivos y subdirectorios dentro de un directorio y lo guarda en un archivo .txt.
     - Seleccione la opción `1` en el menú.
     - Introduzca <ruta del directorio> que desea listar.
     - Introduzca <ruta y nombre del archivo de salida> donde desea guardar el listado.
   -- Salida esperada --
     - Creación y guardado del archivo en la ruta indicada. Mensaje de que se ha generado el archivo correctamente.

### 2. ** Guardar el árbol del directorio (en niveles y contenido) en un archivo .txt **
   -- Descripción --
     Genera un árbol jerárquico del directorio y sus subdirectorios, y lo guarda en un archivo .txt.
   -- Cómo usarlo --
     - Seleccione la opción `2` del menú.
     - Introduzca <ruta del directorio> cuya estructura desea generar.
     - Introduzca <ruta y nombre del archivo de salida> donde desea guardar el árbol.
   -- Salida esperada --
     - Creación y guardado del árbol jerárquico del directorio en la ruta indicada. Mensaje de que se ha generado el archivo correctamente.

## Manejo de Errores relacionados con directorios y rutas:

- ** Errores **
  - Si el directorio no existe:
        "Error: Directorio inexistente."
  - Si la ruta proporcionada está vacía:
        "Error: La ruta está vacía."


## Notas Adicionales:

- Asegúrese de proporcionar rutas válidas y accesibles desde el sistema operativo.
- El programa es compatible con sistemas operativos Windows, macOS y Linux, siempre que las rutas se introduzcan
en el formato correcto para cada sistema.

Gracias por su Visita = )