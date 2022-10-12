public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setSpeed(7);
        jaegerOne.setHeight(79.25);
        jaegerOne.setWeight(1.98);
        System.out.println("Характеристики Работа №1: " + "\nНазвание " + jaegerOne.getMark() + 
                "\nПроизводство " + jaegerOne.getOrigin() + "\nСкорость " + jaegerOne.getSpeed() 
                + "\nВысота " + jaegerOne.getHeight() + "\nШирина " + jaegerOne.getWeight());
        jaegerOne.move();
        jaegerOne.drift();

        Jaeger jaegerTwo = new Jaeger("Mark-5", "USA", 10, 76.2, 1.85);
        System.out.println("\nХарактеристики Работа №2: " + "\nНазвание " + jaegerTwo.getMark() + 
                "\nПроизводство " + jaegerTwo.getOrigin() + "\nСкорость " + jaegerTwo.getSpeed() 
                + "\nВысота " + jaegerTwo.getHeight() + "\nШирина " + jaegerTwo.getWeight());
        jaegerOne.move();
        jaegerOne.drift();
    }
}