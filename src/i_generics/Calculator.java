package i_generics;

class Calculator implements Math<Double,Integer, Double> {
    @Override
    public Double add(Integer a, Double b) {
        return a + b;
    }
}
