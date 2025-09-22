package edu.neu.csye6200;

public class Explosion {
        public void explode() {
        System.out.println("BOOM! Explosion triggered.");
    }

    @Override
    public String toString() {
        return "From concrete class: BOOM! Explosion triggered.";
    }

}
