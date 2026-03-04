# 📌 Le singleton

## 🎯 Problème résolu

Le problème que résout le singleton est d'empêcher à une instance d'être instanciée à chaque fois qu'elle est utilisée dans un état initial qui relancerait tout un tas de traitements prenant un certain temps et ainsi d'éviter la redondance de d'actions importantes qui ne devraient être fait une seule et unique fois (exemple : Connexion base de données)  

## 🧠 Principe de fonctionnement

Pour faire simple et précis, le principe du singleton est que l'on a une classe qui lors de l'instanciation d'un objet lié à celle-ci, créera une instance unique. En gros lorsque d'autres traitements instancieront un objet de la première classe citée (via une fonction dédiée dans la classe de l'objet), l'objet aura le même état que le dernier utilisé car au lieu d'en recréer un, l'objet est unique et universel (sauvegardé en cache) et est donc réutilisé autant de fois qu'il y en a besoin. C'est un peu le même fonctionnement qu'une variable globale sauf que son instance est protégée et non modifiable (constructeur sous confidentialité privé)

## 🏗 Structure (rôles des classes)

La classe singleton par exemple contient obligatoirement un construteur privé qui sert à l'instancier et une méthode statique servant à récupérer son instance (ici on utilisera GetInstance()) qui est une propriété privée de la classe sous un état statique (de type de la classe en question), et lors de la première utilisation de la méthode GetInstance() initialisera donc l'instance unique qui sera stockée en cache et permettra aux autres classes ou fonctions externes à cette classe d'utiliser cette même instance via la fonction GetInstance().

## 📈 Avantages

- Éviter la redondance d'appels (ex : connexion base de données)
- Une seule initialisation
- Réutilisation dans tout le contexte du projet donc on evité par exemple d'avoir un mettre en paramètre constamment l'objet en question
- Optimisation du temps d'utilisation en cas de classes ayant des constructeurs lourds

## ⚠️ Inconvénients

- Gestion supplémentaire de l'état du singleton (état de vie) surtout en Asynchrone (Multi-thread)
- Règle deux problèmes alors que les design patterns ne doivent n'en régler qu'un seul (principe SRP du SOLID)
- Gestion de la visibilité fortuite, c'est à dire que certains composants pourraient rendre disponible trop de choses
- Couplage fort dans le sens où toutes les classes dépendant d'un singleton et sont donc énormément impactées par le changement de celui-ci
- Peu testable, on doit souvent utilisé le vrai singleton car trop compliqué de le mocker

## 🧩 Cas d’usage réel possible

Voir ici :
[SingletonExample.java](SingletonExample.java)