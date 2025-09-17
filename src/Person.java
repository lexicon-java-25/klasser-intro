public class Person {

    private int id;

    private String firstName;
    private String lastName;

    private int age;


    public Person(){

    }


    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = -1;

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greet(){
        System.out.println("Hej! jag heter "
                + this.firstName);
       // System.out.println(this.stateAge());
    }

    public void greetOtherPerson(Person other){
        System.out.println("Hej! " + other.getFirstName());
        System.out.println("jag heter "+ this.firstName);
    }

    private String stateAge(){
        return "Jag är " + this.age + " år gammal.";
    }

    public void askAge(int guess){

        if (guess == this.age){
            System.out.println("så gammal är ju jag!");
        } else if(guess > this.age){
            System.out.println("så gammal är jag inte..");
            System.out.println(this.stateAge());
        }else {
            System.out.println("så ung är jag inte..");
            System.out.println(this.stateAge());
        }
    }
}
