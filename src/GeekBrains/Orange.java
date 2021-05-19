package GeekBrains;

public class Orange extends Fruit {
    @Override
    public float getWeight() {
        return Weight;
    }

    @Override
    public void setWeight(float weight) {
        Weight = weight;
    }

    public float Weight = 1.5f;

}
