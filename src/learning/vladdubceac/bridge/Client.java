package learning.vladdubceac.bridge;

import learning.vladdubceac.bridge.abstraction.Bike;
import learning.vladdubceac.bridge.abstraction.Car;
import learning.vladdubceac.bridge.abstraction.Vehicle;
import learning.vladdubceac.bridge.implementation.Assembler;
import learning.vladdubceac.bridge.implementation.Producer;

public class Client {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new Producer(), new Assembler());
        vehicle1.manufacture();

        Vehicle vehicle2 = new Bike(new Producer(), new Assembler());
        vehicle2.manufacture();
    }
}
