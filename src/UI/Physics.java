package UI;

public class Physics {

    private double gravity = 9.8;

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public float multiply(float kmass, float velocity){
        float k = 0.5F;
        return (float) (k * kmass * velocity);
    }
    public float multiply1(float pmass, float height){
        float k = 9.8F;
        return (float) (k * pmass * height);
    }

    public float multiply2(float smass, float svelocity){return smass * svelocity;}

}
