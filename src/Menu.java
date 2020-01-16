public class Menu {
    public static void main(String[] args) {

        Drink drink1 = new Drink();
        drink1.name = "Sour";
        drink1.price = 10;
        drink1.alc = true;
        drink1.ingredient1.name = "Whisky";
        drink1.ingredient1.quantity = 40;
        drink1.ingredient2.name = "Lemon juice";
        drink1.ingredient2.quantity = 20;
        drink1.ingredient3.name = "Sugar syrup";
        drink1.ingredient3.quantity = 10;
        float sumOfIngredients = drink1.ingredient1.quantity + drink1.ingredient2.quantity +
                drink1.ingredient3.quantity;

        System.out.println("Drink name: " + drink1.name +
                "\nDrink price: " + drink1.price + "zł" +
                "\nDoes the drink have alcohol: " + drink1.alc +
                "\nIngredient 1: " + drink1.ingredient1.name +
                "\nIngredient 2: " + drink1.ingredient2.name +
                "\nIngredient 3: " + drink1.ingredient3.name +
                "\nSum of ingridients: " + sumOfIngredients + "ml");
    }
}
