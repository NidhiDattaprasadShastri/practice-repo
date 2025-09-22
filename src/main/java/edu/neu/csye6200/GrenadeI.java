package edu.neu.csye6200;

public class GrenadeI implements Explodable {
    @Override
    public void explode() {
        System.out.println("GrenadeI:BOOM! Explosion triggered.");
    }
    
 
    @Override
    public String toString() {
        return "GrenadeI: BOOM! Explosion triggered.";
    }
}
