package controller;

public class Paralelogramo extends Quadrilatero {

    @Override
    public float calcArea() {
        return getBase() * getAltura();
    }

}
