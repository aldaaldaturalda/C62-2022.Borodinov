package homework.task2;

public interface FlowerMarketOptions {
    int getCountSoldFlowers();

    String info();

    int getPricePerDay();

    Bouquet getBouquet(FlowerType... flowerTypes);
}
