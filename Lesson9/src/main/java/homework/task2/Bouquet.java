package homework.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
// * 1) собрать 5 букетов (используем массив) с определением их стоимости, т.е создаем класс Bouquet,
// * который содержит массив объектов Flower, который инициализируется через конструктор, а также метод по вычислению стоимости.

public class Bouquet {
   private Flower[] flower;

   public int getPricePerBouquet() {
      int pricePerBouquet = 0;
      for (Flower flowers : flower) {
         if (flowers != null) {
            pricePerBouquet = pricePerBouquet + flowers.getFlowerType().getPrice();
         }
      }
      return pricePerBouquet;
   }

   public void deleteFlower(FlowerType... flowerType) {
      for (FlowerType delete : flowerType) {
         for (int i = 0; i < flower.length; i++) {
            if (flower[i] != null && flower[i].getFlowerType().getName().equalsIgnoreCase(delete.getName())) {
               flower[i] = null;
               break;
            }
         }
      }
   }
}
