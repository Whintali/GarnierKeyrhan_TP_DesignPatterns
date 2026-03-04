# 📌 Le Builder

## 🎯 Problème résolu

Le problème est lié au fait que lorsque l'on a une classe ayant beaucoup de propriétés, cela peut rendre le code extrêmement complexe car on est obligé soit de créer des constructeurs avec énormément de paramètres, soit on doit en créer plusieurs pour gérer tous les cas possibles.

## 🧠 Principe de fonctionnement

Le principe de fonctionnement du Builder est donc lié à la déléguation de l'initialisation du constructeur de notre classe à une classe Builder qui va s'occuper d'exposer les différentes propriétés que l'on veut instancier pour notre objet. Des classes dites Directeurs peuvent aussi être ajoutés pour créer un objet avec des données préremplies.

## 🏗 Structure (rôles des classes)

- Une classe concrète contenant beaucoup de propriétés
- Une classe concrète Builder qui sert à lancer instancier un objet avec des données précises souhaitées
- Des classes concrètes dites Directeur qui servent à instancier l'objet d'une certaine façon tout en utilisant le Builder (Optionnel)

## 📈 Avantages

- Un seul constructeur
- Code Évolutif
- Fléxibilité
- SRP respecté : le code de construction et de logique métier sont séparés
- Code client plus lisible
- Moins complexe à comprendre

## ⚠️ Inconvénients

- Code volumineux en termes de fichiers dû à la création de la classe Builder + des classes Directors
- Overkill pour les classes n'ayant que peu de propriétés

## 🧩 Cas d’usage réel possible

Voir ici :
[Main.java](Example/Main.java)