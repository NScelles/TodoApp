# Todo App

## 🎯 Contexte

Ce projet est une application console de **gestion de tâches**, réalisée dans le cadre d’un TP de **programmation orientée objet (POO)** en Java.  

Le TP:
L’entreprise **TaskFlow**, spécialisée dans les outils de productivité, développe une application console permettant aux utilisateurs internes de **gérer leurs tâches au quotidien**.

---

## Description :

- Application de Todo List  

- Développé en Java dans la version Correto 17

- L'application est composé de :
  * une IHM 
  * une interface TodoService et de son implementation 
  * une classe Todo
- L'application permet de :
  * Créer des tâches 
  * Voir les tâches créer
  * Supprimmer des tâches
  * Modifier des tâches
  * Compléter des tâches

---

## Comment lancer l'application 

### 📦 Compilation

```bash
javac -d bin src/**/*.java
````
### 🚀 Exécution

```bash
java -cp bin Main
```


### ✅ 📌 Classe Tâche (Todo)

Chaque tâche (ou "todo") est représentée par un objet `Todo` et doit obligatoirement contenir les champs suivants :

* `id` (entier) : identifiant unique généré automatiquement.
* `name` (chaîne de caractères) : le **titre** de la tâche.
* `description` (chaîne de caractères) : une **description détaillée** de la tâche.
* `done` (booléen) : un indicateur qui vaut `false` par défaut, puis `true` si la tâche est marquée comme faite.
* `compt` (entier) : compteur qui a pour but de indexer les IDs et les rendres uniques
* `allTodo` (Map Entier-Todo) : Map de tâche indexer par un entier pour stocker les Tâches

🛠️ Ces champs sont être **encapsulés** dans la classe `Todo`, avec des **getters et setters** publics.

---

## 📁 Structure du projet

```
src/
│
├── model/
│   ├── Todo.java
│   └── PriorityTodo.java   # (bonus)
│
├── service/
│   ├── TodoService.java
│   └── TodoServiceImpl.java
│
├── ihm/
│   └── Ihm.java
│
└── Main.java
```

---

#### Exemple de rendu console :

```
==== TODO LIST ====
1. Créer une tâche
2. Voir toutes les tâches
3. Modifier une tâche
4. Supprimer une tâche
5. Marquer tâche comme faite / non faite
6. Créer une tâche prioritaire
7. Quitter
Votre choix : 6
Nom : PortFolio
Description : Développer le Body
Priorité (Haute, Moyenne, Faible): Haute
Tâche ajoutée !
```


```
Liste des tâches :
[2] PortFolio - Développer le Header (à faire)
[3] Angular - Apprendre Angular (fait)
[4] PortFolio - Développer le Footer (à faire)
[5] [Prioritaire - HAUTE] PortFolio - Développer le Body (à faire)
```
