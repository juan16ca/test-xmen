# Solución xmen api

Este es un proyecto que tiene la solución a la prueba de xmen.

## Requisitos

- Java 17.
- XAMPP o mysql.
- Eclipse Spring tools suite
- HeidiSQL (*Cliente de bd*)
- Postman

## Configuración de base de datos

- Descargar [xampp](https://dev.mysql.com/downloads/installer/) e instalar dando click a las opciones por defecto.
- A continuación abrir el panel de control e iniciar la BD MySQL.
![alt text](https://github.com/juan16ca/test-xmen/blob/main/images/PanelControlXampp.png?raw=true)
- Descargar [HeidiSQL](https://www.heidisql.com/download.php) e instalar dando click a las opciones por defecto.
- A continuación abrir el programa y conectarse con las credenciales por defecto.
*usuario: root, password se envia en blanco.*
- Abrir una nueva hoja de consultas y ejecutar los siguientes comandos:
```bash
CREATE USER 'xmen_user'@'localhost' IDENTIFIED BY '12345678';

GRANT EXECUTE, PROCESS, SELECT, SHOW DATABASES, SHOW VIEW, ALTER, ALTER ROUTINE, CREATE, CREATE ROUTINE, CREATE TABLESPACE, CREATE TEMPORARY TABLES, CREATE VIEW, DELETE, DROP, EVENT, INDEX, INSERT, REFERENCES, TRIGGER, UPDATE, CREATE USER, FILE, LOCK TABLES, RELOAD, REPLICATION CLIENT, REPLICATION SLAVE, SHUTDOWN, SUPER  ON *.* TO 'xmen_user'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;

CREATE DATABASE 'xmen_db';

USE 'xmen_db';

CREATE TABLE `report` (
	`id` BIGINT(20) NOT NULL,
	`ratio` INT(11) NOT NULL,
	`total_humans` INT(11) NOT NULL,
	`total_mutants` INT(11) NOT NULL,
	PRIMARY KEY (`id`) USING BTREE
);

CREATE TABLE `sequence_adn` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`humantype` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	`adn` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
	PRIMARY KEY (`id`) USING BTREE
);

CREATE VIEW `view_report` AS SELECT 1 AS ID,TOTAL_MUTANTS,TOTAL_HUMANS, TOTAL_MUTANTS/TOTAL_HUMANS AS RATIO
FROM
(SELECT S.humantype AS TYPE, COUNT(*) AS TOTAL_MUTANTS
FROM sequence_adn S
WHERE S.humantype = 'MUTANT') AS RESULTADO,
(SELECT S.humantype AS TYPE, COUNT(*) AS TOTAL_HUMANS
FROM sequence_adn S
WHERE S.humantype = 'HUMAN') AS RESULTADO2  ;

```


## Instalación

- Usar la consola de git para clonar el proyecto:

```bash
git clone https://github.com/juan16ca/test-xmen.git
```

- Importar el proyecto en eclipse Spring Tools suite y luego desde el dashboard subir el proyecto.
- Ejecutar las pruebas desde postman, importando el proyecto que se encuentra en la carpeta /test.
- Dentro de las fuentes del proyecto en la ruta */src/test/java* se encuentran las pruebas automaticas.
