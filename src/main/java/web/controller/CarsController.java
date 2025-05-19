package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private static Logger logger = Logger.getLogger(Class.class.getName());

    private static CarService carService = new CarService();

    @GetMapping()
    public String viewCarsByCount(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null) {
            model.addAttribute("cars" ,carService.getCars());
        } else if (count > 0) {
            model.addAttribute("cars", carService.getCarsByCount(count));
        }else {
            logger.info("Некорректное количество передано");
        }
        return "cars";
    }
}
