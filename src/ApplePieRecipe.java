public class ApplePieRecipe {

    Ingredient[] ingredients = {
        new Ingredient(200, "gram", "ongezouten roomboter"),
        new Ingredient(200, "gram", "witte basterd suiker"),
        new Ingredient(400, "gram", "zelfrijzend bakmeel"),
        new Ingredient(1, "stuk(s)", "ei"),
        new Ingredient(8, "gram", "vanillesuiker"),
        new Ingredient(1, "snuf", "zout"),
        new Ingredient(1.5, "kilo", "zoetzure appels"),
        new Ingredient(75, "gram", "kristal suiker"),
        new Ingredient(3, "theelepels", "kaneel"),
        new Ingredient(15, "gram", "paneermeel"), };

    public void printIngredients (){
        for (Ingredient ingredient : ingredients){
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }
    }

//    Hier krijg ik het niet voor elkaar om alle stappen aan te roepen zonder ze op te sommen. Als je de gouden tip hebt is die heel welkom!
    public void printBereidingswijze(){
        System.out.println("Bereidingswijze: ");
        printstap1();
        printstap2();
        printstap3();
        printstap4();
        printstap5();
        printstap6();
        printstap7();
        printstap8();
        printstap9();
    }

    public void printstap1 (){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void printstap2 (){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void printstap3 (){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void printstap4 (){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.\n" +
                "Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void printstap5 (){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void printstap6 (){
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void printstap7 (){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void printstap8 (){
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void printstap9 (){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }


}
