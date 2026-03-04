# 📌 Le Decorator

## 🎯 Problème résolu

Lorsqu'un objet a besoin d'ajouter de nouvelles fonctionnalités, on pourrait être tenté de créer une nouvelle sous-classe qui permettrait de faire cette nouvelle action. Ce qui aurait comme désavantage d'alourdir le code car on serait obligé de faire de nombreux cas d'héritage pour chaque cas. De plus, on ne peut pas changer le comportement après l'exécution du projet et une classe est limitée à une seule classe concrète parente.

## 🧠 Principe de fonctionnement

Le système de decorator marche de la manière suivante :

On va wrapper (envelopper) l'objet (ici initial) souhaité d'une classe abstraite (ou Base Decorator) qui implémente la même interface que la classe de l'objet initial, tout en gardant en propriété une référence de l'objet initial. Ensuite, des classes dites emballeuses (ou Concrete Decorator) vont hériter de la classe abstraite citée plus tôt et vont ajouter des fonctionnalités additionnelles à l'objet dont elles se réfèrent, en ajoutant de nouveaux comportements à une méthode dédiée par exemple, soit avant ou soit après le comportement actuel. Et la particularité de tout ça c'est que lorsque le traitement est lancé, le dernier wrapper va exécuter son comportement additionnel, puis ensuite passer la main à celui d'avant, et ainsi de suite jusqu'à arriver à celui de l'objet initial. Et bien sûr, l'objet initial peut tout à fait être enveloppé par un ou plusieurs wrappers.

## 🏗 Structure (rôles des classes)

- Une interface contenant des méthodes
- Une classe concrète implémentant l'interface
- Une classe abstraite implémentant l'interface et ayant en propriéte un objet de type de l'interface de base
- Des classes concrètes héritant de la classe abstraite et effectuant de nouvelles fonctionnalités dans les méthodes de l'interface

## 📈 Avantages

- Permet d'ajouter dynamiquement des fonctionnalités à un objet
- Évite l'explosion de classe (en gros ça diminue le nombre de classes finales au lieu d'en avoir par exemple 8 qui doivent parcourir toutes les combinaisons possibles on en aura 4 car on peut dynanimiquement alloué les Concrete Decorators)
- SRP respecté pour les Concrete Decorator qui n'implémente qu'une fonctionnalité
- Meilleur que l'héritage si plusieurs fonctionnements doivent être faits en même temps
- Les ConcreteDecorator peuvent être utilisés n'importe quand et dans n'importe quel ordre (Flexibilité)

## ⚠️ Inconvénients

- Vigilance car si mauvais ajout de fonctionnalité cela peut lancer des traitements non voulues
- Compléxité de compréhension du code
- Debug plus difficile car les Fonctionnalités ajoutées sont chainées
- un ordre d'exécution précis des decorators peut être requis pour éviter des comportements soumis aux bugs  

## 🧩 Cas d’usage réel possible

Voir ici: 
[Example](Example/Main.java)