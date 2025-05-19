# Todo App

## 🎯 Contexte

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
  * Compléter des tâches
  
---

## Comment lancer l'application 

### Lacncer simplement le programme et c'est partie !


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

#### Exemple de rendu console :

```
[3] 🔴 [Prioritaire - HAUTE] Réviser l’oral - relire les fiches (À FAIRE)
[4] ✅ Acheter du café (FAIT)
```






