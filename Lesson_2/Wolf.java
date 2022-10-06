public class Wolf {

    private char gender;
    private String name;
    private String color;
    private double weight;
    private int age;

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setWight(double weight) {
        this.weight = weight;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void move() {
        System.out.println("Идти");
    }

    public void sit() {
        System.out.println("Сидеть");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }

}