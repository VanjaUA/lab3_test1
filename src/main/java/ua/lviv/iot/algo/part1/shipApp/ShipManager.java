package ua.lviv.iot.algo.part1.shipApp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString

public class ShipManager {
    public static void main(String[] args) {
        List<Ship> ships = new ArrayList();
        ships.add(new CargoShip(23,"Flour"));
        ships.add(new CargoShip(97,"Guns"));
        ships.add(new CruiseShip(230,25));
        ships.add(new CruiseShip(500,50));

        for (Ship ship : ships) {
            System.out.println(ship);
        }
    }
}
