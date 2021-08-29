# Demo-java-json-data-file-Mysql
## Introduction

JSON (Java Script Object Notation) est un format d'échange de données accessible mais la migration de la plus pars des bases des données conçus en No SQL (Sous format JSON) reste une question difficile mais grâce un peu à la programmation java, python, … De nombreuses applications prennent actuellement en charge les données au format JSON. 

## Pré-requis

Ce qui est important pour contribuer au dévéloppement de ce projet :

- Netbeans (https://www.oracle.com/technetwork/java/javase/downloads/jdk-netbeans-jsp-3413139-esa.html)
- Xampp (https://www.apachefriends.org/fr/download.html)

## Installation

Les étapes pour installer le programme sont :

1. **Télécharger le dossier**
- Importer le projet
- Changer les paramètres de connexion 
- Executer le projet

ET si vous souhaitez constituer un executable par la suite il faut faire le ``clean and build ``

Dites ce qu'il faut faire...
## Comment ça marche ?

### Voici mon fichier JSON

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

### Voici mes requetes SQL

Pour la creation de la structure des données

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

## Contribution

Si vous souhaitez contribuer, vous pouvez le faire facilement car le projet est documenter pour savoir comment le faire.

## Versions
Listez les versions ici 
_exemple :_
**Dernière version stable :** 1.0

## Auteurs
le(s) auteur(s) du projet est(sont) :
* **Kalema daniel jonathan** _alias_ [@kalemadaniel](https://github.com/kalemadaniel)

## License

Ce projet est sous licence **``open source``** 

