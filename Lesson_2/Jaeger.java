public class Jaeger {

    private String mark;
    private String origin;
    private int speed;
    private double height;
    private double weight;

    public Jaeger() {

    }

    public Jaeger(String mark, String origin, int speed, double height, double weight) {
        this.mark = mark;
        this.origin = origin;
        this.speed = speed;
        this.height = height;
        this.weight = weight;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    void move() {
        System.out.println(mark + " Прошел 5 шагов");
    }

    boolean drift() {
        System.out.println(mark + " Вошел в дрифт");
        return true;
    }



}