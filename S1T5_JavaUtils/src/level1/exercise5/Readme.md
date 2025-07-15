# Manual de Compilación y Ejecución del Programa L1.E5:



## Estructura del Proyecto:

**Estructura de paquetes**

level1/
└── exercise5/
├── SerializationManager.java
├── User.java
└── Main.java

**Archivos principales**

- `SerializationManager.java`: Maneja la serialización y deserialización de usuarios.
- `User.java`: Representa un usuario (implementa Serializable).
- `Main.java`: Punto de entrada del programa con un menú interactivo.



## Funcionalidades:

**Serializado de usuario**

- Solicita los datos del usuario y la ruta para guardar el archivo.

**Deserializado de usuarios**

- Solicita datos de la ruta donde se encuentra el archivo, y (si los datos son correctos), muestra el contenido por consola.

**Listado de archivos `.ser `**

- Solicita la ruta del directorio, y (si los existen) lista todos los archivos .ser que contiene.



## Instrucciones para Consola:

### Compilación y Ejecución:

**Abrir un Terminal o Consola**

- Abre una terminal en la carpeta raíz del proyecto (donde está `src`)
cd /ruta/completa/a/S1T5_JavaUtils

**Compila**

- Use el siguiente comando:
  javac -d outJava src/level1/exercise5/*.java

**Ejecuta**

- Ejecute el siguiente comando:
  java -cp outJava level1.exercise5.Main



## Uso del Programa:

### Al ejecutar, aparecerá este menú:

=== MENÚ ===

Elija una opción (0 - 3)
1. Serializar un usuario y guardarlo en un fichero;
2. Deserializar usuarios desde un fichero;
3. Listar archivos .ser en un directorio;
0. Salir.

**Serializado de usuario**

- Seleccione la opción `1` en el menú.
- Introduzca: <nombre del usuario>.
<edad del usuario>.
<ruta del archivo> `.ser` donde desea guardarlo (si no incluye extensión, se añade automáticamente).
- Salida: mensaje de que se ha generado el archivo correctamente en <ruta>.

**Deserializado de usuarios**

- Seleccione la opción `2` del menú.
- Introduzca <ruta del archivo> `.ser` cuya información desea ver.
- Salida: información del usuario guardada dentro del archivo.

**Listado de archivos `.ser` **

- Seleccione la opción `3` del menú.
- Introduzca <ruta del directorio> cuyo listado de archivos `.ser` desea ver.
- Salida: listado de todos los archivos `.ser` encontrados en la ruta indicada.



## Manejo de Errores relacionados con directorios y rutas:

**Errores**

- Si la ruta proporcionada está vacía:
  "Error: La ruta no puede estar vacía."
- Si no se encuentra el archivo:
  "Error: No se encontró el archivo."
- Si se ingresas caracteres alfabéticos cuando se solicita la edad:
  "Error. Por favor ingrese un valor numérico."
- Si se ingresan caracteres alfabéticos en lugar de numéricos en el menú:
  "Error. Por favor ingrese un valor numérico (0-3)."



## Notas Adicionales:

**Formatos de ruta**

- Windows: Usa `\\` o `/` en rutas (`C:\\carpeta` o `C:/carpeta`)
- Linux/macOS: Usa `/` (`/home/usuario`)

**Auto-completado de extensión**

- Si no se escribe la extensión `.ser`, se agregará automáticamente.

**Características técnicas**

- Serialización binaria con ObjectOutputStream.
- Filtrado inteligente de archivos `.ser`.
- Validación automática de rutas.

**Requisitos**

- Java 8 o superior.
- Permisos de lectura/escritura en los directorios.



Gracias por su Visita = )