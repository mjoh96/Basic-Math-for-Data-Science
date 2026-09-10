package javastudy.pkgCar;

public class CarEx {
        public static void main(String[] args) {
            Car myCar = new Car(4,5); //휠갯수-4, 도어갯수-5
            Car yourCar = new Car(3,2); //휠갯수-3, 도어갯수-2

            System.out.println("Num of wheels: "+ myCar.numOfWheels);
            System.out.println("Num of doors: "+ myCar.numOfDoors);

            System.out.println("Num of wheels (Yours): "+ yourCar.numOfWheels);
            System.out.println("Num of doors: (Yours): "+ yourCar.numOfDoors);

        }
    }
    

