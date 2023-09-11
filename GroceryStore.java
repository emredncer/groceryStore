import java.util.Scanner;
import java.util.HashMap; //HashMap sınıfını import ettim
import java.util.Map; //Map arayüzünü import ettim

public class GroceryStore {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        //fruit adında key olarak String ,value olarak Double tutacak bir hashmap objesi ürettim.

        //Map bir interface olduğundan kendisinden bir nesne üretilemez.
        //Ancak HashMap sınıfı Map arayüzünü kendisine implemente eder,
        //böylelikle Map arayüzünün metotlarını HashMap sınıfında kullanabilirim.
        //Ayrıca HashMap bir class olduğundan nesne de üretilebilir.

        //sırayla key olarak adlarını ve value olarak fiyatlarını put ile ekledim.
        fruit.put("Pear", 2.14);
        fruit.put("Apple", 3.67);
        fruit.put("Tomato", 1.11);
        fruit.put("Banana", 0.95);
        fruit.put("Eggplant", 2.14);

        //Alışveriş öncesi ödenecek tutarı 0'a eşitledim döngü döndükçe miktarı
        //ve fiyatı çarpıp üzerine ekleyeceğim.
        double bill = 0.0;
        System.out.println("Welcome to grocery store!");
        System.out.println("Here is the price list: ");

        System.out.println(fruit.entrySet());
        //Fruit hashmapindeki tüm key-value çiftlerini yazdıracak.
        //fruit.entrySet() fruit içindeki tüm key-value verilerini barındırıyor.

        //Foreach ile fruit hashmapindeki tüm key-value çiftlerini gezelim.
        //foreach syntax;
        //for (eleman türü eleman : dönülecek koleksiyon)
        for (Map.Entry<String, Double> meyve : fruit.entrySet()) {
            double price = meyve.getValue();

            Scanner input = new Scanner(System.in);
            System.out.print("how many kilograms of " + meyve.getKey() + "s do you want to buy: ");

            double amount = input.nextDouble();
            bill += (amount * price);

        }
        System.out.print("Your bill is: " + bill);
    }
}