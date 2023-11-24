public class ApplePieRecipe {
    Ingredient roomboter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient suiker = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient bakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient appels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalsuiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");


    public void verwarmen() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void kloppen() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mengen() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void schillen() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void vetten() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void gebruiken() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void strooien() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void rollen() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void stroken() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void zetten() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.\n");
    }


    // Ingredienten :


    public void printIngredientsRb() {
        System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
    }

    public void printIngredientsSk() {
        System.out.println(suiker.getAmount() + " " + suiker.getUnit() + " " + suiker.getName());
    }

    public void printIngredientsBm() {
        System.out.println(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
    }

    public void printIngredientsEi() {
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
    }

    public void printIngredientsVs() {
        System.out.println(vanillesuiker.getAmount() + " " + vanillesuiker.getUnit() + " " + vanillesuiker.getName());
    }

    public void printIngredientsZout() {
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
    }

    public void printIngredientsAp() {
        System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
    }

    public void printIngredientsKs() {
        System.out.println(kristalsuiker.getAmount() + " " + kristalsuiker.getUnit() + " " + kristalsuiker.getName());
    }

    public void printIngredientsKn() {
        System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
    }

    public void printIngredientsPm() {
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
    }

    public void allesin1() {
        System.out.println("");
        System.out.println("Ingredienten: ");
        System.out.println("");

        printIngredientsRb();
        printIngredientsSk();
        printIngredientsBm();
        printIngredientsEi();
        printIngredientsVs();
        printIngredientsZout();
        printIngredientsAp();
        printIngredientsKs();
        printIngredientsKn();
        printIngredientsPm();
        System.out.println("");

        System.out.println("Toepassingen : ");
        System.out.println("");
        verwarmen();
        kloppen();
        mengen();
        schillen();
        vetten();
        gebruiken();
        strooien();
        rollen();
        stroken();
        zetten();
    }


}
