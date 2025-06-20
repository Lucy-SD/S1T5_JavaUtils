# Manual de Compilación y Ejecución del Programa L1.E1y2:

## Estructura del Proyecto:

El proyecto consta de los siguientes archivos:
- `DirectoryLister.java`: Contiene los métodos principales que implementan las funcionalidades del programa.
- `Main.java`: Contiene el método `main` para interactuar con el usuario y ejecutar las funcionalidades.

### Funcionalidades:

1. ** Mostrar Listado Alfabético en un Archivo **
   - Genera un listado alfabético de los archivos y carpetas dentro de un directorio y lo muestra por consola.
2. ** Mostrar Árbol de Directorios en un Archivo **
   - Genera un árbol jerárquico de un directorio y sus subdirectorios, y lo muestra por consola.

## Instrucciones de Compilación:

1. ** Abrir un Terminal o Consola **
   - Diríjase al directorio donde se encuentran los archivos `DirectoryLister.java` y `Main.java`.
2. ** Compilar los Archivos **
   - Use el siguiente comando para compilar los archivos:
     javac -d . DirectoryLister.java Main.java
   - Esto generará una estructura de directorios basada en el paquete `exercise1and2` y creará los archivos `.class` correspondientes.

## Instrucciones de Ejecución:

1. ** Ejecutar el Programa **
   - Ejecute el programa con el siguiente comando desde el directorio raíz del proyecto:
     java exercise1and2.Main
2. ** Interacción con el Usuario **
   - El programa mostrará un menú con las siguientes opciones:
        Elige una opción (0 - 2):
           1. Listar Alfabéticamente un Directorio.
           2. Ver Árbol de directorio por niveles y contenido.
           0. Salir.
3. ** Seleccionar Funcionalidad **
   - Introduzca el número asociado a la funcionalidad que desea ejecutar y presione **Enter**.

## Funcionalidades Detalladas:

### 1. ** Listar Alfabéticamente un Directorio **
   -- Descripción --
     Genera un listado alfabético de los archivos y subdirectorios dentro de un directorio y lo muestra por consola.
     - Seleccione la opción `1` en el menú.
     - Introduzca <ruta del directorio> que desea listar.
   -- Salida esperada --
     - Listado con los nombres de los archivos y subdirectorios ordenados alfabéticamente.

### 2. ** Ver Árbol de directorio por niveles y contenido **
   -- Descripción --
     Genera un árbol jerárquico del directorio y sus subdirectorios, y lo muestra por consola.
   -- Cómo usarlo --
     - Seleccione la opción `2` del menú.
     - Introduzca <ruta del directorio> cuya estructura desea ver.
   -- Salida esperada --
     - Estructura jerárquica del directorio.

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