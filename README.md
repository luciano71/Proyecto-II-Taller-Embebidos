# Proyecto II
## Sistema embebido para el reconocimiento y clasificacion de emociones faciales 

Este es el segundo proyecto del curso Taller de Sistemas Embebidos del ITCR, IS-2021.

### Descripcion breve

En el repositorio se encuentra el directorio poky en su version dunfell (3.1.6) utilizado para desarrollar una imagen de un sistema operativo con un target Raspberry Pi, el cual se encarga de el reconocimiento y clasificacion de emociones faciales con la biblioteca OpenCV en Python, con un programa pre-entrenado (Machine Learning) y el flujo de trabajo de Yocto Project.

### Ordenamiento del repositorio

Se enceuntran los layers utilizados y diferentes archivos, de los que vale la pena mencionar:

#### meta-codigo

Esta es la layer personalizada que fue creada para implementar el codigo en Python de la aplicacion que debe correr en el target. Aqui se encuentran:
* conf/layer.conf: En este archivo se configura meta-codigo.
* recipes-codigo/codigo.bb: En este archivo se coloca el PATH donde se encuentra la aplicacion y se configura la instalacion de la aplicacion y los archivos usados por la aplicacion.
* recipes-codigo/codigo-1.0: En este directorio se encuentra la aplicacion.

Estudiantes: 
Prof. Johan Carvajal Godinez
