public class CalculadoraSalaRetangular implements CalculoGeometrico {
    /*Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
    calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve
    receber altura e largura como parâmetros.*/

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área do retangulo é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perimetro do retangulo é: " + perimetro);
    }
}
