package com.example.nikhil.blowout.sample;

import com.example.nikhil.blowout.model.DataItem;

/**
 * Created by Nikhil on 29-03-2017.
 */


        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class SampleDataProvider {
    public static List<DataItem> dataItemList;
    public static Map<String, DataItem> dataItemMap;

    static {
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();

        addItem(new DataItem(null, "Quinoa Salmon Salad", "Salads",
                "Our quinoa salad is served with quinoa, tomatoes, cucumber, scallions, and smoked salmon. will help in cleaning lungs.",
                1, "quinoa_salad.jpg"));

        addItem(new DataItem(null, "Chef's Salad", "Salads",
                "The chefâ€™s salad has cucumber, tomatoes, red onions, mushrooms, hard-boiled eggs,will be good for health and vitamins provided by these help in detoxifying Lungs.",
                2, "chef_salad.jpg"));

        addItem(new DataItem(null, "House Salad", "Salads",
                "Our house salad is made with romaine lettuce and spinach, topped with tomatoes, cucumbers, red onions and carrots, and will help to increase body resistance",
                3, "house_salad.jpg"));

        addItem(new DataItem(null, "Garden Buffet", "Salads",
                "Choose from our fresh local, organically grown ingredients to make a custom salad.These kind of salads a good for reducing toxins in body",
                4, "garden_buffet.jpg"));

        addItem(new DataItem(null, "Capsicum", "Starters",
                "These contain orange-red compound called beta-cryptoxanthin which helps in breathing and low risk of lung cancer",
                1, "caps.png"));

        addItem(new DataItem(null, "Grapes", "Starters",
                "A diet high in grapes has shown to risk of Lung Cancer and emphysema",
                2, "grapes1.png"));

        addItem(new DataItem(null, "French Onion Soup", "Starters",
                "Caramelized onions slow cooked in a savory broth, topped with sourdough and a provolone cheese blend. Served with sourdough bread.",
                3, "french_onion_soup.jpg"));

        addItem(new DataItem(null, "Artichokes with Garlic Aeoli", "Starters",
                "Our artichokes are brushed with an olive oil and rosemary blend and then broiled to perfection. Served with garlic aioli.Garlic act as anti cancer agent",
                4, "artichokes.jpg"));

        addItem(new DataItem(null, "Parmesan Deviled Eggs", "Starters",
                "SOME SAY EGGS ARE DEVILISHLY GOOD. I HAVE TO AGREE.\n" +
                        "Eggs increase body resistance and provides protein.\"",
                5, "deviled_eggs.jpg"));

        addItem(new DataItem(null, "Nuts", "Entrees",
                "Healthy fats, such as nuts ,help pronmote cardiovascular health and may even help in minimize mucous production",
                1, "nuts.png"));

        addItem(new DataItem(null, "Broccoli", "Entrees",
                "Broccoli are good anti cancer agents , we would recommend to take broccoli soup every week once to detoxify lungs",
                2, "broccoli.png"));

        addItem(new DataItem(null, "Water melon", "Entrees",
                "Water melon is slightly sweet and mild cold in nature,which is helpful to your heart,lung and kidney with refreshing diuretic effect during summer",
                3, "ware.png"));

        addItem(new DataItem(null, "Pomegranate", "Entrees",
                "Inhibits the growth of lung,skin colon and prostate Tumours while also destroying Breast cancer cells",
                4, "pome.png"));

        addItem(new DataItem(null, "Carrots", "Entrees",
                "Carrots offer Vitamin A and Vitamin C has direct link to lung health.",
                5, "carrots.png"));

        addItem(new DataItem(null, "CrÃ¨me BrÃ»lÃ©e", "Desserts",
                "Elegantly crafted vanilla custard with a crunchy layer on top. Served with seasonal fruit, could be used as a replacement for smoking",
                1, "creme_brulee.jpg"));

        addItem(new DataItem(null, "Strawberry", "Desserts",
                "These Strawberries are very good for health , and with seasonal fruit toppings.this can be used as replacement for smoking and will help in good functionality of lungs",
                2, "srawb.png"));

        addItem(new DataItem(null, "Coconut ", "Desserts",
                "Anti-parasitic Anti.-cancer Good for all body systems. Builds the blood.",
                3, "coconut.png"));

        addItem(new DataItem(null, "Apples", "Desserts",
                "Studies have found that good lung function is associated with high inakes of vitamin C ,E and beta carotene,citrus fruits,apples and fruit juice",
                4, "apls.png"));

        addItem(new DataItem(null, "Mixed Berry Tart", "Desserts",
                "Raspberries, blueberries, and strawberries on top of a crispy tart.which is good for health",
                5, "berry_tart.jpg"));

        addItem(new DataItem(null, "Tropical Blue Smoothie", "Drinks",
                "This blueberries are good for health and lung functionality.",
                1, "smoothie.jpg"));

        addItem(new DataItem(null, "Pomegranate Iced Tea", "Drinks",
                "Our unique blend of pomegranate juice, black Rubio, and mint tea creates this light fusion of flavors.this helps in detoxifying lungs  ",
                2, "iced_tea.jpg"));

        addItem(new DataItem(null, "Ginger", "Drinks",
                "Will flush toxins from your system faster",
                3, "gin1.png"));
    }

    private static void addItem(DataItem item) {
        dataItemList.add(item);
        dataItemMap.put(item.getItemId(), item);
    }

}
