package edu.icet.ecom.Service;

import edu.icet.ecom.model.dto.Food;

import java.util.Arrays;
import java.util.List;

public class FoodService {
    public List<Food> getFood(){
        Food f1 = new Food("Fish bun", "tuna, potatoes, onions, and a blend of classic Sri Lankan spices.", "20", 80.0);
        Food f2 = new Food("Sinisambal bun", "ti is a bun inside fill with aniun sambal", "30", 90.0);
        Food f3 = new Food("Fish role", "tuna, potatoes, onions, and a blend of classic Sri Lankan spices.", "70", 80.00);
        Food f4 = new Food("Kottu", "made by parata roti", "10", 400.00);
        Food f5 = new Food("Fride rice", "fresh rice and wegitable mix", "11", 350.00);
        Food f6 = new Food("CHICKEN & MUSHROOM PIE", "hicken cubes and mushroom cooked in white sauce and baked in a crusty puff pastry pie", "100", 210.00);

        return Arrays.asList(f1,f2,f3,f4,f5,f6);
    }
}
