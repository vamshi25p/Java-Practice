public class Main {
    public static void main(String[] args) {
        // Engine car = new Car();
        // // car.acc();
        // // car.start();
        // // car.stop();

        // Media CarMedia = new Car();
        // CarMedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
