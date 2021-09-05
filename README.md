# Demo-java-json-data-file-Mysql
## Introduction

JSON (Java Script Object Notation) est un format d'échange de données accessible mais la migration de la plus pars des bases des données conçus en No SQL (Sous format JSON) reste une question difficile. 
Grâce un peu à la programmation java, python,… les développeurs sont à mesure de faire des migrations personnalisés...

## Pré-requis

Les applications nécessaires pour contribuer au dévéloppement de ce projet :

- Netbeans (https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html)
- Xampp (https://www.apachefriends.org/fr/download.html)

## Installation

Les étapes pour installer le programme sont :

1. **Télécharger le dossier**
2. **Importer le projet**
3. **Changer les paramètres de connexion** 
4. **Executer le projet**

ET si vous souhaitez constituer un exécutable par la suite il faut faire le ``clean and build ``

Dites ce qu'il faut faire
## Comment ça marche ?

### Voici mon fichier JSON

D'abord il faut avoir un fichier JSON comme celui ci

```
{
   "population": [
       {
           "ID": "1",
           "nom": "Kalema",
           "postnom": "Daniel",
           "prenom": "Jonathan",
           "age": "25",
           "genre": "Masculin",
           "ville": "Goma"
       },
       {
           "ID": "2",
           "nom": "Dorcas",
           "postnom": "Bisimwa",
           "prenom": "Yvette",
           "age": "27",
           "genre": "Féminin",
           "ville": "Kinshasa"
       },
       {
           "ID": "3",
           "nom": "Kakule",
           "postnom": "Kennedy",
           "prenom": "Jean",
           "age": "38",
           "genre": "Masculin",
           "ville": "Butembo"
       },
       {
           "ID": "4",
           "nom": "Jean",
           "postnom": "Pierre",
           "prenom": "Kaluira",
           "age": "70",
           "genre": "Masculin",
           "ville": "Bruxelle"
       },
       {
           "ID": "5",
           "nom": "James",
           "postnom": "Grilo",
           "prenom": "Virat",
           "age": "23",
           "genre": "Masculin",
           "ville": "Bunia"
       },
       {
           "ID": "6",
           "nom": "Rohit",
           "postnom": "Nzuto",
           "prenom": "Jeanne",
           "age": "45",
           "genre": "Féminin",
           "ville": "Kalemie"
       },
       {
           "ID": "7",
           "nom": "Sikuly",
           "postnom": "Nzanzu",
           "prenom": "Daniel",
           "age": "36",
           "genre": "Masculin",
           "ville": "Bukavu"
       },
       {
           "ID": "8",
           "nom": "Gloria",
           "postnom": "Kitoko",
           "prenom": "Ravindra",
           "age": "85",
           "genre": "Masculin",
           "ville": "Uvira"
       },
       {
           "ID": "9",
           "nom": "Filage",
           "postnom": "Nzau",
           "prenom": "Gracieux",
           "age": "32",
           "genre": "Masculin",
           "ville": "Kisangani"
       },
       {
           "ID": "10",
           "nom": "Mahamba",
           "postnom": "Kambale",
           "prenom": "Anderson",
           "age": "16",
           "genre": "Masculin",
           "ville": "Butembo"
       }
   ]
}
```
### Voici mes requêtes SQL

Ensuite il faut creer la structure SQL qui correspond à notre fichier JSON

```
CREATE OR REPLACE DATABASE bd_json_msyql;
USE bd_json_msyql;
CREATE OR REPLACE TABLE tb_population
(
	id INT,
	nom VARCHAR(50),
	postnom VARCHAR(50),
	prenom VARCHAR(50),
	age INT,
	genre VARCHAR(10),
	ville VARCHAR(20)
);

CREATE OR REPLACE VIEW v_popupation AS SELECT id as Code, CONCAT(nom," ",postnom," ",prenom) AS Individu, 
genre AS Sexe, age AS Age, ville as Ville FROM tb_population ORDER BY id;

```

### La solution interface graphique

A l'ouverture de l'application, ça se presente comme ceci

![JSON](https://user-images.githubusercontent.com/51014164/131299311-bfc7af4f-4098-41be-9035-cbdd9e450fa3.JPG)

Il faut ensuite parcourir et trouver le fichier JSON

![JSON1](https://user-images.githubusercontent.com/51014164/131299755-8058e301-32e8-4541-8fda-bdba4548b32c.JPG)

Puis Cliquer sur Charger

![JSON2](https://user-images.githubusercontent.com/51014164/131299881-d29922d3-c0a7-4c04-a43d-29200f0de01f.JPG)

## Contribution

J’accorde aux utilisateurs les droits d'utiliser, d'étudier, de modifier et de distribuer le logiciel et son code source à quiconque et à n'importe quelle fin.

## Versions
Ceci correspond à un état donné de l'évolution du logiciel et j'utilise le versionnage. Ci dessous les versions produites

**Dernière version stable :** 1.0

## Auteurs
le(s) auteur(s) du projet est(sont) :
* **Kalema daniel jonathan** _alias_ [@kalemadaniel](https://github.com/kalemadaniel)

## License

Ce projet est sous licence **``open source``** 

