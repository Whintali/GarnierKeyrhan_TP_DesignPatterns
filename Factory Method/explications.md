# 📌 Le Factory Method

## 🎯 Problème résolu

Lorsque l'on veut trier les types d'objet ayant la même implémentation d'interface en utilisant un tri via un string, un int ou autres afin de créer un objet dédié. Cela peut créer très vite un code important n'étant en tout point non-évolutif (toujours besoin d'ajouter une nouvelle condition à chaque nouveau type ayant la même interface)

## 🧠 Principe de fonctionnement

On remplace donc les conditions if/else ou switch par une classe appelée Factory qui possède une méthode Createqui elle s'occupe de choisir et créer le bon objet du bon type à l'aide d'un paramètre (string, int, etc.) d'une fonction dédiée, sans utiliser de système de conditions explicites.

## 🏗 Structure (rôles des classes)

- Une interface commune pour les classes des objets à mettre dans le factory
- Des classes (ayant le même contrat pur) qui héritent de l'interface commune
- Une classe Factory ayant une méthode Create qui a en paramètre un string pour choisir quel objet va être crée et qui retourne un objet de l'interface commune

## 📈 Avantages

- Meilleure Maintenabilité
- Meilleure séparation du code
- Respect du O de Solid l'ajout des types est dynamique et ne détruit pas le code

## ⚠️ Inconvénients

- Compléxité importante si ajouter en cours de route sur un projet car il faut modifier toutes les classes pour qu'elles aient un nom suivant une convention spécifique pour que la fonction puisse bien les reconnaître.

## 🧩 Cas d’usage réel possible

Voir ici :
[FactoryMethodExemple.java](FactoryMethodExemple.java)