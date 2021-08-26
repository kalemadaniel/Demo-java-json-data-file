CREATE OR REPLACE DATABASE bd_json_msyql;
USE bd_json_msyql;
CREATE TABLE tb_population
(
	id INT,
	nom VARCHAR(50),
	postnom VARCHAR(50),
	prenom VARCHAR(50),
	age INT,
	genre VARCHAR(10),
	ville VARCHAR(20)
);

CREATE OR REPLACE VIEW 
AS
SELECT id as Code, CONCAT(nom.' '.postnom.' '.prenom) AS Individu, genre AS Sexe, age AS Age, ville as Ville FROM tb_population
ORDER BY id;