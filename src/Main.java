import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<Person> persons = new ArrayList<>();
    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);
        initList();

//        Person p = new Person();
//
//        Person p2 = new Person();
//
//        persons.add(p);
//        persons.add(p2);


//        Person person = new Person("Bill", "Palmesedt");
//        System.out.println(person.firstName);
//        System.out.println(person.lastName);
//        System.out.println(person.age);


        while(true){
           // addPerson(sc, persons);


//            Person p = getRandomPerson();
//            Person p2 = getRandomPerson();
//
//            p.greet();
//            //System.out.println("Gissa hur gammal jag är");
//            //p.askAge(sc.nextInt());
//
//            p2.greetOtherPerson(p);
//            //sc.nextLine();
            System.out.println("skriv ett tal: ");
            System.out.println(InputHandler.getIntInput(0,5));


//            InputHandler.getStringInput();

          //printList(persons);

        }



//        System.out.println("p = " + p);
//
//        System.out.println("p.lastname = " + p.lastName);
//        System.out.println("p.firstName = " + p.firstName);
//        System.out.println("p.age= " + p.age);
//
//        System.out.println("p2 = " + p2);
//
//        System.out.println("p2.lastname = " + p2.lastName);
//        System.out.println("p2.firstName = " + p2.firstName);
//        System.out.println("p2.age= " + p2.age);

    }

    private static void initList(){

        persons.add(new Person("Bill", "Palmestedt", 44));
        persons.add(new Person("Bosse", "Bus", 35));
        persons.add(new Person("Benny", "Ben", 41));
        persons.add(new Person("Berit", "Päronmos", 23));
        persons.add(new Person("Arne", "Gustavsson", 77));

    }

    private  static Person getRandomPerson(){
        Random rng = new Random();
        return persons.get(rng.nextInt(persons.size()));

    }



    private static void addPerson(Scanner sc, ArrayList<Person> persons) {

        System.out.println("Skriv förnamn:");
        String firstName = sc.nextLine();
        System.out.println("Skriv efternamn:");
        String lastName = sc.nextLine();
        System.out.println("Skriv ålder:");
        int age = sc.nextInt();
        sc.nextLine();

        persons.add(new Person(firstName,lastName,age));
    }

    private static void printList(ArrayList<Person> persons) {
        for (Person per : persons){


            System.out.println("age = " + per.getAge() + " name = "
                    + per.getFirstName() + " " + per.getLastName());
        }
    }
}

