package TEST.RacingCars;

import java.util.Random;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public int DISTANCE = 50;
    public int STEP = 3;

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            String status = "|";
            int speed = (new Random()).nextInt(10);
            runDistance += speed;
            for (int i = 0; i < DISTANCE; i += STEP) {
                if (runDistance < i) {
                    status += "-";
                } else if (runDistance >= i && runDistance < i + STEP) {
                    status += "0";
                } else status += "+";
            }
            status += "|";
            System.out.println(this.name + " " + status + " " + Math.min(runDistance, DISTANCE) + "km");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(this.name + " finish in " + (endTime - startTime) / 1000 + " s");
    }

    public static void main(String[] args) {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);
        System.out.println("Distance 50km");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
