## pglp_9.9 `LOGICIEL DE DESSIN`
Ce projet a pour but de permettre à l'étudiant de savoir implémenter les principes de conception ainsi que les fonctionnalités du langage java.

Le logiciel devra permettre de :

* Chaque forme sera identifiée par un nom ("c1", "unCercle", ...).

* L'application permettra de manipuler des cercles, des rectangles, des carrés et des triangles.

* Chaque forme devra pouvoir être affichée et déplacée.

* Les formes devront pouvoir être regroupées et pourront subir des traitements globaux comme par exemple déplacer ensemble un cercle et un triangle.

* Un dessin (ensemble de formes) pourra être sauvegardé/chargé dans un SGBD embarqué 

<hr>

#### 1. Proposons et implémentons une hiérarchie de classe représentant les formes graphiques
Pour cette partie, Nous avons crée une interface Forme qui sera implémentée par toutes les formes à mettre en place: le carré, le cercle, le rectangle et le triangle

<hr>

#### 2. Représentons la notion de groupe de formes en appliquant le pattern `Composite`
La classe FormeGroup qui implémentera l'interface Forme permettra de pouvoir effectuer un ensemble de manipulation (deplacer , afficher toutes les formes du groupes suivant un paramètre donné) sur un groupe de forme (Carre, cercle, rectangle, triangle) donné. 

<hr>

#### 3. Render les formes et les groupes persistants en utilisant le pattern `DAO` et `JDBC`
Cette partie a pour but de mettre en place la base de données du logiciel. Sur cette base de données pourra etre effectuer les opérations comme l'ajout d'une nouvelle forme (carre, rectangle, cercle,triangle), la mise à jour (déplacer), la recherche.....

* Pour se faire nous avons du utiliser un SGBD embarqué, DERBY (qui est assez facile d'ulisation pour la mise  en place d'application de ce genre).

* Une classe a été crée pour l'établissement de la connexion vers la base de données. Elle contient la méthode connexion qui décrit les paramètres à utiliser pour se connecter ainsi que les méthodes de création et de suppression des classes spécifiques. 

* Pour chaque forme, une classe DAO a crée. Cette classe contient les méthodes de connexion à la base de données, de creation d'une nouvelle figure spécifique, de suppreesion, de mise à jour et de recherche suivant des paramètres spécifiques à renseigner.

<hr>

#### 4. Réaliser la classe `DrawingTUI` qui se chargera des interactions avec l’utilisateur

Pour interragir avec le logiciel, cette classe a été mise en place. Elle a pour but d'analyser les informations saisies par l'utlisateur, de détecter la forme demandée par l'utilisateur et de verifier les erreurs de saisies à travers sa méthode nextCommand et la classe Interpreteur. Elle permet egalement d'afficher une forme démandée grace à sa méthode Print.
Elle communique avec la classe `DrawingApp` qui contient la méthode main, méthode qui permet d'exécuter le logiciel.

<hr>

#### 5. Implémentation des commandes suivant le modèle de coneception `Commande`
Pour mettre en place cette structure, nous avons crée une interface command qui à son tour implémente toutes les commandes mises en places. Chaque action représente une classe, dans laquelle est décrit comment elle est cencée se derouler et quelles paramètres elle est cencé l'implémenté.
Ainsi pour chaque commande saisie un ensembles de verification sont fait d'abord sur la détection de la forme à créé à travers la classe CreateCommande puis en fonction de chaque orme des vérifications sont effectuées.,

<hr>

### COMMENT FONCTIONNE LE LOGICIEL ?????



