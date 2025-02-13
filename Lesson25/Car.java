public class Car {
    private double speed;

    public Car() {
        this.speed = 0.0;
    }

    public Car(double initialSpeed) {
        if (initialSpeed >= 0.0 && initialSpeed <= 120.0) {
            this.speed = initialSpeed;
        
        }

    }
    public double getSpeed() {
        return this.speed;

    }
    public void accelerate() {
        if (this.speed < 120.0) {
            this.speed += 1.0;
        }
    }
    public void brake() {
        if (this.speed > 0.0) {
            this.speed -= 0.1;
        }
    }
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("Initial speed: " + myCar.getSpeed() + "mph");

        for (int i = 0; i<10; i++) {
            myCar.accelerate();
        }
        System.out.println("Speed after accelerating 10 times: " + myCar.getSpeed() + "mph");

        for (int i = 0; i < 5; i++) {
            myCar.brake();
        }
      

      }
    }
