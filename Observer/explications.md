# 📌 L'observer

## 🎯 Problème résolu

Si un objet a besoin d'attendre que l'état d'un autre objet change pour effectuer une action, il faut qu'il puisse savoir quand est-ce que l'état en question change. On pourrait être tenté d'appeler les méthodes des objets qui observent à chaque changement d'état de l'objet observé mais cela crée un couplage fort et rend le code peu évolutif et difficilement maintenable car il faut ajouter à chaque méthode de changement d'état les appels aux méthodes des observateurs liés.

## 🧠 Principe de fonctionnement

Le système d'observer sert à avoir une classe dite Publisher qui va en gros permettre à des classes dites Subscriber de s'abonner à un changement d'état donné. Ensuite lorsqu'un changement d'état s'impose sur le Publisher donné, le Publisher va diffuser à tous les objets Subscribers abonnés, un événement de changement d'état ce qui aura pour conclusion de lancer des actions dédiées dans les Subsribers.

## 🏗 Structure (rôles des classes)

- Une interface Subscriber définissant la méthode d'update que tous les observateurs doivent implémenter
- Plusieurs classes concrètes Subscribers implémentant cette interface
- Une classe Publisher qui maintient une liste de Subscribers et qui possède les méthodes d'abonnement, de désabonnement et de notification
- Quand l'état du Publisher change, il appelle sa méthode de notification qui va ensuite appeler la méthode update des Subscribers abonnés

## 📈 Avantages

- Meilleure maintenabilité du code car on peut ajouter de nouveaux subcribers facilement en leur implémentant l'interface dédiée et en les abonnant à un objet
- Possibilité d'ajouter/retirer dynamiquement des Subscribers à l'exécution
- Un Publisher peut notifier plusieurs Subscribers différents sans les connaître
- Réactivité : les Subscribers sont automatiquement notifiés d'un changement d'état du Publisher
- Respect du SRP, le Publisher gère son état, les Subscribers gèrent leurs propres réactions
- Facilite les architectures événementielles (Event-Driven par exemple)
- Les Subscribers sont réutilisables avec différents Publishers

## ⚠️ Inconvénients

- Ordre d'exécution imprévisible des Subscribers
- Performance dégradée si beaucoup de Subscribers à notifier
- Debug difficile car le flux est distribué entre plusieurs Subscribers
- Memory leaks possibles si les Subscribers ne sont pas correctement désabonnés
- Complexité accrue du code avec cette abstraction supplémentaire
- Dépendances cachées : difficile de voir quels Subscribers réagissent
- Gestion des mises à jour concurrentes plus délicate

## 🧩 Cas d’usage réel possible

Voir ici:
[Main.java](Example/Main.java)
