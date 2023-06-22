package UI;

public class Energy extends Physics {
    float kineticEnergy(float kmass, float velocity){
        return multiply(kmass, velocity);
    }

    double potentialEnergy(float pmass, float height){
        return multiply(pmass, height);
    }

    float momentum(float smass, float svelocity){
        return multiply2(smass, svelocity);
    }

    public double force(double lmass, double acceleration){
        return lmass * acceleration;
    }

}
