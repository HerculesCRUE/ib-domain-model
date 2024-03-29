# Compilación

A continuación se indican los pasos que hay que seguir para llevar a cabo la generación del artefacto.

## Prerrequisitos

Se precisa disponer los siguientes elementos configurados:

* OpenJDK 11
* Maven 3.6.x

## Compilación

Para realizar la compilación se debe ejecutar el siguiente comando:

```bash
mvn clean package
```

En caso de querer generar al mismo tiempo JavaDoc y Sources, se debe ejecutar el comando siguiente: 

```bash
mvn clean package javadoc:jar source:jar
```

También es posible instalar o desplegar los artefactos sustituyendo `package` por `install` o `deploy` respectivamente.

Los artefactos se generan dentro del directorio `target`:

* Artefacto: domain-model-{version}.jar
* JavaDoc: domain-model-{version}-javadoc.jar
* Sources: domain-model-{version}-sources.jar
