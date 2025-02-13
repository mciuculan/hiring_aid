public class Constraint<K> {
    private K inferiorLimit;
    private K superiorLimit;

    public void setInferiorLimit(K inferiorLimit) {
        this.inferiorLimit = inferiorLimit;
    }

    public void setSuperiorLimit(K superiorLimit) {
        this.superiorLimit = superiorLimit;
    }

    public K getInferiorLimit() {
        return inferiorLimit;
    }

    public K getSuperiorLimit() {
        return superiorLimit;
    }
}
