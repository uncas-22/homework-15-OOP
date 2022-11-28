public class Human {
    int yearOfBirth; // год рождения
    String name;
    String town; // город проживания
    Human(String name, String town, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }
    void sum() {
        System.out.println("Привет!");
        System.out.println("Меня зовут " + name + ". Я из города " + town + ".");
        System.out.println("Я родился в " + yearOfBirth + " году." + " Будем знакомы!");
    }

}
