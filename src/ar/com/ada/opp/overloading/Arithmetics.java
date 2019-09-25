package ar.com.ada.opp.overloading;

public class Arithmetics {

    public int sum(int uno, int dos) {

        return (uno + dos);
    }

    public Integer sum(Integer a, int b) {
        return (a + b);
    }

    public int sum(int numA, Integer numB) {
        return (numA + numB);

    }

    public Integer sum(Integer n1, Integer n2) {
        return (n1 + n2);
    }

    public double sum(double a1, double a2) {
        return (a1 + a2);

    }

    public Double sum(Double b1, double b2) {
        return (b1 + b2);
    }

    public double sum(double nA, Double nB) {
        return (nA + nB);

    }

    public Double sum(Double c1, Double c2) {
        return (c1 + c2);
    }
}
