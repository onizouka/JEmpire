# JEmpire

## Description
JEmpire est un jeu de gestion en ligne de commande où vous incarnez le dirigeant d'une colonie. Votre objectif est de faire prospérer votre colonie, gérer vos ressources (bois, pierre, or, nourriture, habitants), construire des bâtiments et, ultimement, bâtir un château pour remporter la victoire !

Vous devrez explorer, construire, commercer, recruter et survivre face à la famine. Le jeu se termine par une victoire si vous construisez le château, ou par une défaite si tous vos habitants meurent de faim.

## Installation & Compilation

1. **Cloner ou télécharger le projet**
2. Ouvrir un terminal dans le dossier `JEmpire`
3. Compiler le jeu avec la commande :
	```sh
	javac -d build src/JEmpire.java
	```

## Lancement du jeu

Dans le terminal, exécutez :
```sh
java -cp build JEmpire
```

## Règles du jeu
- **Explorer la forêt** : Gagnez du bois et de la nourriture.
- **Créer une mine** : Débloquez la possibilité d'extraire de la pierre et de l'or.
- **Travailler à la mine** : Consomme de la nourriture, rapporte pierre et or (si la mine est construite).
- **Recruter un soldat** : Dépensez de l'or pour augmenter votre population.
- **Commercer** : Échangez de la pierre contre de l'or.
- **Construire le château** : Nécessite beaucoup de ressources et d'habitants. Permet de gagner immédiatement.

Chaque tour, vos habitants consomment de la nourriture. Si vous n'en avez plus, ils meurent et la partie est perdue.

## Structure du projet
- `src/JEmpire.java` : Code source principal du jeu
- `build/` : Dossier de sortie pour les fichiers compilés

## Auteur
Projet réalisé par [Votre Nom]
