## pglp_9.9 `LOGICIEL DE DESSIN`
Ce projet a pour but de permettre a l'&eacute;tudiant de savoir impl&eacute;menter les principes de conception ainsi que les fonctionnalit&eacute;s du langage java. Il s'agit là de mettre en place un logiciel de dessin.

Le logiciel devra permettre de :

* Chaque forme sera identifi&eacute;e par un nom ("c1", "unCercle", ...).  


* L'application permettra de manipuler des cercles, des rectangles, des carr&eacute;s et des triangles.  


* Chaque forme devra pouvoir &eacute;tre affich&eacute;e et d&eacute;plac&eacute;e.  


* Les formes devront pouvoir &ecirc;tre regroup&eacute;es et pourront subir des traitements globaux comme par exemple d&eacute;placer ensemble un cercle et un triangle.  


* Un dessin (ensemble de formes) pourra &ecirc;tre sauvegard&eacute;/charg&eacute; dans un SGBD embarqu&eacute; .  




<hr>

#### 1. Proposons et impl&eacute;mentons une hi&eacute;rarchie de classe repr&eacute;sentant les formes graphiques  
Pour cette partie, Nous avons cr&eacute;e une interface Forme qui sera impl&eacute;mentée à son tour par toutes les formes  mettre en place: le carr&eacute;, le cercle, le rectangle et le triangle. Les formes ont été implémentée suivant ces structures ci-dessous:  

* Le cercle : initialisé par un nom, les cordonnées de son centre de type point(x,y) et un rayon;  
    
    
    ```a
    public Cercle(String nomC, double x, double y, double rayon) {
		this.nomC=nomC;
		this.centre = new Point2D("Centre",x,y);
		this.rayon = rayon;
	}
	```
  

* Le carré : initialisé par un nom, une origine de type point(x,y) afin de pouvoir facilité son déplacement et un coté; 

    ```a
    public Carre(String nomCarre,double x, double y, double cote) {
		this.nomCarre = nomCarre;
		this.origine =new Point2D("origine",x,y);
		this.cote = cote;
	}
	```
  

* Le rectangle : initialisé par un nom, une origine de type point également, une longeur et une largeur;
    
    
    ```a
    public Rectangle(String nomR, double x, double y ,double longueur, double largeur) {
		this.nomR = nomR;
		this.origineR = new Point2D("origine Rectangle",x,y);
		Longueur = longueur;
		Largeur = largeur;
	} 
	``` 
 

* Le triangle : initialisé par trois (3) points. 
	
	
    ```a
    public Triangle(String NomT, double a, double b, double c, double d, double e, double f) {
		this.P1 = new Point2D("origineP1",a,b);
		this.P2 = new Point2D("origineP2",c,d);
		this.P3 = new Point2D("origineP3",e,f);
	}
	 ```
  


<hr>

#### 2. Repr&eacute;sentons la notion de groupe de formes en appliquant le pattern `Composite`
La classe FormeGroup qui impl&eacute;mentera l'interface Forme permettra de pouvoir effectuer un ensemble de manipulation (deplacer , afficher toutes les formes du groupes suivant un param&egrave;tre donn&eacute;) sur un groupe de forme (Carre, cercle, rectangle, triangle) donn&eacute;.   


<hr>

#### 3. Render les formes et les groupes persistants en utilisant le pattern `DAO` et `JDBC`
Cette partie a pour but de mettre en place la base de donn&eacute;es du logiciel. Sur cette base de donn&eacute;es pourra etre effectuer les op&eacute;rations comme l'ajout d'une nouvelle forme (carre, rectangle, cercle,triangle), la mise &agrave; jour (d&eacute;placer), la recherche.....

* Pour se faire nous avons du utiliser un SGBD embarqu&eacute;, DERBY (qui est assez facile d'ulisation pour la mise  en place d'application de ce genre);  


* Une classe a &eacute;t&eacute; cr&eacute;e pour l'&eacute;tablissement de la connexion vers la base de donn&eacute;es. Elle contient la m&eacute;thode connexion qui d&eacute;crit les param&egrave;tres &agrave; utiliser pour se connecter ainsi que les m&eacute;thodes de cr&eacute;ation et de suppression des classes sp&eacute;cifiques;   


* Pour chaque forme, une classe DAO a été cr&eacute;e. Cette classe contient les m&eacute;thodes de connexion &agrave; la base de donn&eacute;es, de creation d'une nouvelle figure sp&eacute;cifique, de suppreesion, de mise &agrave; jour et de recherche suivant des param&egrave;tres  &agrave; renseigner.  


<hr>

#### 4. R&eacute;aliser la classe `DrawingTUI` qui se chargera des interactions avec l'utilisateur

Pour interragir avec le logiciel, cette classe a &eacute;t&eacute; mise en place. Elle a pour but d'analyser les informations saisies par l'utlisateur, de d&eacute;tecter la forme demand&eacute;e par l'utilisateur et de verifier les erreurs de saisies &agrave; travers sa m&eacute;thode nextCommand et la classe Interpreteur. Elle permet egalement d'afficher une forme d&eacute;mand&eacute;e grace &agrave; sa m&eacute;thode Print.
Elle communique avec la classe `DrawingApp` qui contient la m&eacute;thode main, m&eacute;thode qui permet d'ex&eacute;cuter le logiciel.

<hr>

#### 5. Impl&eacute;mentation des commandes suivant le mod&eacute;le de coneception `Commande`
Pour mettre en place cette structure, nous avons cr&eacute;e une interface command qui &agrave; son tour impl&eacute;mente toutes les commandes mises en places. Chaque action repr&eacute;sente une classe, dans laquelle est d&eacute;crit comment elle est cenc&eacute;e se derouler et quelles param&egrave;tres elle est cenc&eacute; l'impl&eacute;ment&eacute;.
Ainsi pour chaque commande saisie un ensembles de verification sont fait d'abord sur la d&eacute;tection de la forme &agrave; cr&eacute;e &agrave; travers la classe CreateCommande puis en fonction de chaque orme des v&eacute;rifications sont effectu&eacute;es.,

<hr>





