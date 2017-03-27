package com.sd.sort.v2;
import ch.aplu.turtle.*;
import com.sd.turtle.WeightTurtle;
class TurtleComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((WeightTurtle)o1).getWeight()-((WeightTurtle)o2).getWeight();
    }
}