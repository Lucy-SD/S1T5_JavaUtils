# Manual de Compilación y Ejecución del Programa L1.E3y4:



## Estructura del Proyecto:

**Estructura de paquetes**

level1/
└── exercise3and4/
├── DirectoryManager.java
└── Main.java

**Archivos principales**

- `DirectoryManager.java`: Contiene la lógica para la generación de listados y árboles de directorios.
- `Main.java`: Punto de entrada del programa con un menú interactivo.



## Funcionalidades:

**Listado alfabético**

- Crea y guarda un archivo `.txt` con el listado del contenido del directorio ordenado.

**Árbol del directorio**

- Crea y guarda un archivo `.txt` con la estructura jerárquica (niveles y contenido) del directorio.

**Contenido de archivo**

- Muestra el contenido de un archivo de texto seleccionado.



## Instrucciones para Consola:

### Compilación y Ejecución:

**Abrir un Terminal o Consola**

- Abre una terminal en la carpeta raíz del proyecto (donde está `src`)
cd /ruta/completa/a/S1T5_JavaUtils

**Compila**

- Use el siguiente comando:
  javac -d outJava src/level1/exercise3and4/*.java

**Ejecuta**

- Ejecute el siguiente comando:
  java -cp outJava level1.exercise3and4.Main



## Uso del Programa:

### Al ejecutar, aparecerá el menú:

=== MENÚ ===

Elige una opción (0 - 3):
1. Guardar un listado alfabético del contenido del directorio en un archivo .txt;
2. Guardar el árbol del directorio (en niveles y contenido) en un archivo .txt;
3. Ver el contenido de un archivo .txt;
0. Salir.


**Listado alfabético**

- Selecciona la opción `1` del menú.
- Ingresa la ruta del directorio.
- Ingresa la ruta de guardado.
- Salida: mensaje de que se ha generado el archivo correctamente.

**Árbol del directorio**

- Selecciona la opción `2` del menú.
- Ingresa la ruta del directorio.
- Ingresa la ruta de guardado.
- Salida: mensaje de que se ha generado el archivo correctamente.

**Ver archivo**

- Selecciona la opción `3` del menú.
- Ingresa la ruta completa del archivo.
- Salida: contenido completo del archivo `.txt`.



## Manejo de Errores relacionados con directorios y rutas:

**Errores**

- Si la ruta proporcionada está vacía:
  "Error: La ruta está vacía."
- Si el directorio no existe:
  "Error: Directorio inexistente."
- Si no se ha proporcionado la ruta a un directorio:
  "La ruta no es la de un directorio."
- Si el archivo no existe:
  "El archivo no existe."
- Si no se ingresa un valor numérico en le menú:
  "Error: debe ingresar un valor numérico (0-2)"



## Notas Adicionales:

**Formatos de ruta**

- Windows: Usa `\\` o `/` en rutas (`C:\\carpeta` o `C:/carpeta`)
- Linux/macOS: Usa `/` (`/home/usuario`)

**Características**

- Archivos `.txt` con codificación UTF-8.
- Marca directorios con `[D]` y archivos con `[F]`.
- Muestra fecha de última modificación con la referencia LM (formato: dd-MM-yyyy / HH:mm).
- Ordenamiento alfabético automático.

**Requisitos**

- Java 8 o superior.
- Permisos de lectura en los directorios.



Gracias por su Visita = )