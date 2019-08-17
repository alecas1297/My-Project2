package AbstractionOOP;

public class CallingCars {
    public static void main(String[] args){
        Car noLike = new Car2();
        noLike.bmw();

        Car like = new TestCar();
        like.bmw();
    }
}
