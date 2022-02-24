package Hashcode;
import java.util.*;

import Hashcode.Carpath;
public class Trafficlight {
    public int duration;
    public int numofintersection;
    public int numofstreets;
    public int numofcars;
    public int bonus;
    public List<Street>streets;
    public List<Carpath>carpath;
    Trafficlight(){
        streets=new ArrayList<>();
        carpath=new ArrayList<>();
    }
}
