# Manual de Compilación y Ejecución del Programa L1.E1y2:



## Estructura del Proyecto:

**Estructura de paquetes**

    level1/
    └── exercise1and2/
        ├── DirectoryLister.java
        └── Main.java

**Archivos principales**

    - `DirectoryLister.java`: Contiene la lógica para listar directorios y generar árboles.
    - `Main.java`: Punto de entrada del programa con un menú interactivo.



## Funcionalidades:

**Listado Alfabético**

    - Muestra archivos y subdirectorios ordenados alfabéticamente.

**Árbol de Directorios**

    - Muestra estructura jerárquica de directorios con metadatos.



## Instrucciones para Consola:

### Compilación y Ejecución:

**Abrir un Terminal o Consola**

    - Abre una terminal en la carpeta raíz del proyecto (donde está `src`)
        cd /ruta/completa/a/S1T5_JavaUtils

**Compila**

- Use el siguiente comando:
  javac -d outJava src/level1/exercise1and2/*.java

**Ejecuta**

- Ejecute el siguiente comando:
  java -cp outJava level1.exercise1and2.Main



## Uso del Programa:

### Al ejecutar, aparecerá el menú:

=== MENÚ ===

Elige una opción (0 - 2):
1. Listar alfabéticamente un directorio;
2. Ver el árbol de un directorio (por niveles y contenido);
0. Salir.


**Listado Alfabético**

    - Selecciona la opción `1` del menú.
    - Ingresa la ruta del directorio.
    - Salida: listado del contenido del directorio ordenado alfabéticamente.

**Árbol de Directorios**

    - Selecciona la opción `2` del menú.
    - Ingresa la ruta del directorio.
    - Salida: árbol del directorio, ordenado por niveles y contenido, con las referencias:
            "D" = directorio - "F" = archivo - "LM" = última modificación.



## Manejo de Errores relacionados con directorios y rutas:

**Errores**

- Si la ruta proporcionada está vacía:
  "Error: La ruta está vacía."
- Si el directorio no existe:
  "Error: Directorio inexistente."
- Si no se ingresa un valor numérico en le menú:
  "Error: debe ingresar un valor numérico (0-2)"



## Notas Adicionales:

**Formatos de ruta**

- Windows: Usa `\\` o `/` en rutas (`C:\\carpeta` o `C:/carpeta`)
- Linux/macOS: Usa `/` (`/home/usuario`)

**Características**

- Marca directorios con `[D]` y archivos con `[F]`.
- Muestra fecha de última modificación con la referencia LM (formato: dd-MM-yyyy / HH:mm).
- Ordenamiento alfabético automático.

**Requisitos**

    - Java 8 o superior.
    - Permisos de lectura en los directorios.



Gracias por su Visita = )