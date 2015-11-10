@echo off
echo Eliminando archivos compilados previamente...
del conexion\*.class
echo Compilando paquete conexion...
javac conexion\*.java
echo Creando paquete conexion.jar
jar -cf conexion.jar conexion/*.class