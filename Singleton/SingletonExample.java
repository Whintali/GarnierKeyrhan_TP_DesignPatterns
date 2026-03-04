import java.util.ArrayList;

class BoardDirectors {
        private static BoardDirectors instance;
        private int nbPeople;
        private final ArrayList<Person> listPerson;
        private BoardDirectors() {
            nbPeople=0;
            listPerson = new ArrayList<Person>();
        }
        public void AddPersonne(Person person){
            listPerson.add(person);
            nbPeople++;
        }
        public int GetNbPeople() {
            return nbPeople;
        }
        public static BoardDirectors GetInstance() {
            if(instance == null) {
                instance = new BoardDirectors();
            }
            return instance;
        }
    }
class Person {
    private String name;
    private String firstname;
    public Person(String name, String firstname){
        this.name = name;
        this.firstname = firstname;
    }
    public String GetName(){
        return name;
    }
    public String GetFirstname(){
        return firstname;
    }
}
class Decision {
    private Person personne;
    private String description;

    public Decision(Person personne, String description) {
        this.personne = personne;
        this.description = description;
    }
    @Override
    public String toString() {
        super.toString();
        BoardDirectors directors = BoardDirectors.GetInstance();
        return "La personne " + personne.GetName() + " " + personne.GetFirstname() + " a pris la décision de " + this.description + " validé par les " + directors.GetNbPeople() + " directeurs";
    }
}
class Building {
    private String name;
    private boolean isHeadOffice;

    public Building(String name, boolean  isHeadOffice)
    {
        this.name = name;
        this.isHeadOffice = isHeadOffice;
    }
    @Override
    public String toString() {
        BoardDirectors directors = BoardDirectors.GetInstance();
        super.toString();
        if(this.isHeadOffice){
            return "Le batiment compte au moins " + directors.GetNbPeople() + " personnes";
        }
        return "Le batiment a un nombre indéterminé de personnes";
    }
}

public class SingletonExample {
    public static void main(String[] args){
        Building building = new Building("Le siège social", true);
        Decision decision = new Decision(new Person("Dylan", "Bob"), "Achat de Frigo pour la salle de pause");
        System.out.println(building.toString());
        System.out.println(decision.toString());
        BoardDirectors directors = BoardDirectors.GetInstance();
        directors.AddPersonne(new Person("Shearer", "Bob"));
        System.out.println(building.toString());
        System.out.println(decision.toString());
    }
}