public class programI {
    public static double calcPizzaArea(double pizzaDiameter) {
        double pizzaRadius, pizzaArea;

        pizzaRadius = pizzaDiameter / 2;

        pizzaArea = Math.PI * pizzaRadius * pizzaRadius;

        return pizzaArea;
    }

    public static  double calcPizzaVolume(double pizzaDiameter, double pizzaHeigth) {
        double pizzaVolume;

        pizzaVolume = calcPizzaArea(pizzaDiameter) * pizzaHeigth;

        return pizzaVolume;
    }


    public static void main(String[] args){

        double areaPizza1, areaPizza2, volumePizza1, volumePizza2;

        areaPizza1 = calcPizzaArea(12.0);
        areaPizza2 = calcPizzaArea(18.0);
        volumePizza1 = calcPizzaVolume(12.0, 0.3);
        volumePizza2 = calcPizzaVolume(18.0, 0.8);



    
        System.out.println("Area of a pizza-1 " + areaPizza1);
        System.out.println("Area of a pizza-2 " + areaPizza2);
        System.out.println("Volume of a pizza-1 " + volumePizza1);
        System.out.println("Volume of a pizza-2 " + volumePizza2);

        
        
    }
}
