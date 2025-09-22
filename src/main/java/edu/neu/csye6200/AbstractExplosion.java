package edu.neu.csye6200;

public abstract class AbstractExplosion {
    public abstract void explode();

    
    @Override
    public String toString() {
        return "Abstract Explosion: BOOM! Explosion triggered.";
    }
}
