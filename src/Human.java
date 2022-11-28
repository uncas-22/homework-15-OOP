public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String jobTitle;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null){
            name = "информация не указана";
        } else if (town == null) {
            town = "информация не указана";
        } else if (jobTitle == null){
            jobTitle = "Информация не указана";
        }
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return this.name;
    }

    public int getYearOfBirth() {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        return this.yearOfBirth;
    }

    public String getTown() {
        return this.town;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился " + getYearOfBirth() + " в году. Я работаю на должности: " + getJobTitle() + ". Будем знакомы!";
    }
}
