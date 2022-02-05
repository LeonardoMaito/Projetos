package br.com.unipar.activity4;

/**
 *
 * @author phtar
 */
public class ScientificCalculator extends Calculator{

    @Override
    public double sum(double x, double y) {
        return x+y;
    }

    @Override
    public double sub(double x, double y) {
        return x-y;
    }

    @Override
    public double mult(double x, double y) {
        return x*y;
    }

    @Override
    public double div(double x, double y) {
        return x/y; 
    }
    
    public double sqrt(double x){
        return Math.sqrt(x);
    }
    public double pow(double x, double y){
        return Math.pow(x,y);
    }
}
