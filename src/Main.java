public class Main {
    public static void main(String[] args) {

        Ingredient ing = new Ingredient();
        ing.getAmount();
        ing.getName();
        ing.getUnit();

        ApplePieRecipe applePieRecipe = new ApplePieRecipe();

        System.out.println("Ingrediënten:");

        applePieRecipe.printIngredients();

        applePieRecipe.printBereidingswijze();

    }
    }



