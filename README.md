# Proyecto II
## Sistema embebido para el reconocimiento y clasificacion de emociones faciales 

Este es el segundo proyecto del curso Taller de Sistemas Embebidos del ITCR, IS-2021.

### Descripcion breve

En el repositorio se encuentra el directorio poky en su version dunfell (3.1.6) utilizado para desarrollar una imagen de un sistema operativo con un target Raspberry Pi, el cual se encarga del reconocimiento y la clasificacion de emociones faciales con la biblioteca OpenCV en Python, con un programa pre-entrenado (Machine Learning) y el flujo de trabajo de Yocto Project.

### Ordenamiento del repositorio

Se encuentran los layers utilizados y diferentes archivos, de los que vale la pena mencionar:

#### meta-codigo

Esta es la layer personalizada que fue creada para implementar el codigo en Python de la aplicacion que debe correr en el target. Aqui se encuentran:
* _conf/layer.conf_: En este archivo se configura meta-codigo.
* _recipes-codigo/codigo.bb_: En este archivo se coloca el PATH donde se encuentra la aplicacion y se configura la instalacion de la aplicacion y los archivos usados por la aplicacion.
* _recipes-codigo/codigo-1.0_: En este directorio se encuentra la aplicacion y los archivos que usa.

#### build/conf

En este directorio se configuran las layers a utilizar, especificamente se editan los archivos:
* _local.conf_: En este archivo se configura el target a utilizar.
* _bblayers.conf_: En este archivo se colocan las layers que se usan.

#### meta-openembedded

En este repo, se encuentran dos layers importantes para el desarrollo del proyecto:
* _meta-python_: En [meta-python](https://layers.openembedded.org/layerindex/branch/master/layer/meta-python/) se toman en cuenta bibliotecas de Python importantes como datetime, keras y pandas.
* _meta-raspberrypi_: Con [meta-raspberrypi](http://layers.openembedded.org/layerindex/branch/master/layer/meta-raspberrypi/) se logra implementar la imagen para la Raspberry Pi.
* _meta-multimedia_: En [meta-multimedia](https://layers.openembedded.org/layerindex/branch/master/layer/meta-multimedia/) se utiliza para la multimedia en el target.

En general, esos son los archivos que se editaron para crear la imagen con Yocto Project, adem'as de llevar a cabo troubleshooting, documentacion, etc.

#### Demostracion del funcionamiento del sistema.

<a href="https://www.youtube.com/watch?v=BSME5ZzMs6c
" target="_blank"><img src="https://i.ytimg.com/vi/BSME5ZzMs6c/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCNeFvyw_2cVjG4oIAyBv-IKU9B9A" 
alt="Sistema Embebido para el reconocimiento y clasificacion de emociones faciales" width="240" height="180" border="10" /></a>

Estudiantes: Oscar Andres Arias C., Carlos Luis Andre B., Luciano Cendra V. y Emanuel Hernandez C.

Prof. Johan Carvajal Godinez

IS-2021
