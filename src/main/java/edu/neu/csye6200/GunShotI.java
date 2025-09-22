package edu.neu.csye6200;

public class GunShotI implements Explodable {
    @Override
    public void explode() {
        System.out.println("GunShotI:BOOM! Explosion triggered.");
    }
    
    @Override
    public String toString() {
        return "GunShotI: BOOM! Explosion triggered.";
    }
}

