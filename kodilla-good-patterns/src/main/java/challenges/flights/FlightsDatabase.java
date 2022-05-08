package challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsDatabase {
    static String WAW = "Warszawa";
    static String POZ = "Poznan";
    static String KRA = "Krakow";
    static String GDN = "Gdansk";
    static String WRO = "Wroclaw";
    static String LOD = "Lodz";
    static String KTW = "Katowice";
    static String WMI = "Modlin";

     static Set<Flight> flightSet = new HashSet<>();
     static {
        flightSet.add(new Flight(WAW, POZ));
        flightSet.add(new Flight(WAW, KRA)); //>=>
        flightSet.add(new Flight(WAW, GDN));
        flightSet.add(new Flight(WAW, WRO));
        flightSet.add(new Flight(WMI, LOD));
        flightSet.add(new Flight(LOD, WAW)); //=>
        flightSet.add(new Flight(KTW, GDN));
        flightSet.add(new Flight(LOD, WRO)); //=>
        flightSet.add(new Flight(WRO, KRA)); //>=>
        flightSet.add(new Flight(WRO, GDN));
        flightSet.add(new Flight(WRO, WMI));
        flightSet.add(new Flight(POZ, WAW));
        flightSet.add(new Flight(POZ, KTW));
        flightSet.add(new Flight(KTW, WMI));
    }

    static Set<Flight> accessToSet() {
        return new HashSet<>(flightSet);
    }
}
