"# JEmpire"

Je l’ai structuré comme un vrai fichier de dépôt GitHub, avec sections, explications et instructions d’exécution.
Tu peux le copier-coller directement dans un fichier README.md.

JEmpire
Un mini‑jeu de gestion en Java, jouable dans le terminal.
Votre objectif : faire prospérer votre colonie, gérer vos ressources… et construire un château pour remporter la victoire.

 Présentation
JEmpire est un jeu de stratégie textuel où vous incarnez le gouverneur d’une petite colonie.
À chaque tour, vous devez choisir une action pour développer vos ressources, recruter des habitants, commercer ou construire des bâtiments.

Le jeu se termine de deux façons :

Victoire : vous parvenez à construire le château.

Défaite : vos habitants meurent de faim.

 Fonctionnement du jeu
À chaque tour, vous pouvez :

Action	Coût	Gain	Condition
1. Explorer la forêt	Aucun	+5 Bois, +3 Nourriture	—
2. Construire une mine	-10 Bois	Débloque la pierre	Mine non construite
3. Travailler à la mine	-5 Nourriture	+5 Pierre, +2 Or	Mine construite
4. Recruter un soldat	-30 Or	+1 Habitant	—
5. Commercer	-5 Pierre	+10 Or	—
6. Construire le château	-100 Bois, -100 Pierre, -200 Or, -40 Habitants	Victoire immédiate	Ressources suffisantes
   Chaque tour, vos habitants consomment de la nourriture.
   Si la nourriture tombe à 0, la colonie disparaît.

 Ressources gérées
Bois

Pierre

Or

Nourriture

Habitants

Tours

Mine construite ou non

 Installation & Exécution
1. Compiler le programme
   bash
   javac JEmpire.java
2. Lancer le jeu
   bash
   java JEmpire
   Le jeu se joue entièrement dans le terminal.

 Structure du code
Le programme repose sur :

Une boucle principale qui représente les tours.

Des méthodes dédiées pour chaque action (exploration, commerce, construction…).

Un système de vérification de défaite.

Une gestion simple des ressources via des variables statiques.

 Améliorations possibles
Voici quelques idées si tu veux pousser le jeu plus loin :

Ajouter des événements aléatoires (tempêtes, attaques, bonus…)

Introduire plusieurs types d’habitants (paysans, soldats, mineurs…)

Ajouter un système de sauvegarde

Créer une interface graphique (JavaFX)

Ajouter des niveaux de difficulté

Si tu veux, je peux aussi te faire :

un diagramme UML,

une version améliorée du code,

une version orientée objet,

ou même une version avec couleurs ANSI dans le terminal.

Tu veux pousser le projet dans quelle direction ?