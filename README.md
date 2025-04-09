# Practica-4
## Calculadora de Distancias de Palabras
Este proyecto permite calcular la distancia de edición mínima (Levenshtein) entre dos palabras. Es una herramienta útil en procesamiento de lenguaje natural, corrección ortográfica, biología computacional, entre otros campos.

## Requisitos
Tener instalado Java Development Kit (JDK), versión 8 o superior.

Un entorno de desarrollo como Visual Studio Code, IntelliJ IDEA, Eclipse u otro editor compatible con Java.

## Estructura del Proyecto
El proyecto está organizado de la siguiente manera:

src/dominio/CalculadoraDeDistancias.java: contiene la lógica para calcular la distancia de edición entre dos palabras.

src/aplicacion/Principal.java: clase principal que ejecuta la aplicación, pidiendo al usuario dos palabras por consola.

Makefile: archivo para compilar y ejecutar fácilmente desde terminal.

README.md: este documento con toda la información del proyecto.

## Uso
Clonar el repositorio:

git clone https://github.com/flaviamendez/Practica-4.git
cd Practica4

Compilar y ejecutar con Make:

make ejecutar

Introducir palabras por consola cuando el programa lo solicite:

Introduce la primera palabra: gato
Introduce la segunda palabra: patos
La distancia de Levenshtein entre "gato" y "patos" es: 3

## Autor
Flavia Méndez 
Carlota Ruiz 

## Versión
Versión: 1.0
Fecha: 14-04-2024

## Licencia
Este proyecto fue creado por [Flavia Mendez y Carlota Ruiz]<a href="LICENSE">LICENSE</a>()

Versión 2.0, Enero de 2004
## Diagrama 
<a href="uml.png">uml.png</a>
