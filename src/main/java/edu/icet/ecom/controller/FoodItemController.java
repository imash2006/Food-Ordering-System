package edu.icet.ecom.controller;

import edu.icet.ecom.Service.FoodService;
import edu.icet.ecom.model.dto.Food;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodItemController {
    FoodService service = new FoodService();
    @GetMapping("/details")
    List<Food> getFood(){return service.getFood();}

    @PostMapping("/insert")
    public void insert(@RequestBody Food food){
        System.out.println(food);
    }
}
