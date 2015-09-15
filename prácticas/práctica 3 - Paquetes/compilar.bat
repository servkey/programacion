@echo off
REM Script para compilar
REM EE de Programación
REM Septiembre 2015
REM Autor Luis G. Montane-Jimenez

echo Eliminando archivos previamente compilados
set dir_paquete=biblioteca
set nombre_paquete_jar=biblioteca.jar
set PATH=%PATH%;C:\Program Files (x86)\Java\jdk1.7.0_09\bin;

del %dir_paquete%\*.class
del %dir_paquete%\clientes\*.class
del %dir_paquete%\rh\*.class
del %nombre_paquete_jar%

echo Compilando clases del dominio Biblioteca...

javac biblioteca\Persona.java
javac biblioteca\clientes\Socio.java
javac biblioteca\rh\Trabajador.java
javac biblioteca\Main.java

echo Compilación finalizada!
jar cvf biblioteca.jar biblioteca\*.class biblioteca\clientes\*.class biblioteca\rh\*.class 

SET CLASSPATH=%~dp0%nombre_paquete_jar%;.;
echo CLASSPATH=%CLASSPATH%

set /p DUMMY=Hit ENTER para continuar...