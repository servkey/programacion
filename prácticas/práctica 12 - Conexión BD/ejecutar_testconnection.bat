@echo off
SET CLASSPATH=.\mysql\mysql-connector-java-5.0.8-bin.jar;.\conexion.jar;.

echo Ejecutando TestConnection...
java TestConnection

set /p DUMMY=Hit ENTER para continuar...