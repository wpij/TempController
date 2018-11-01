package com.wlodek.tempcont.controller;

import com.wlodek.tempcont.model.Temp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class TempController {
    @GetMapping("/addTemperature")
    public String add() {return "/addTemperature";}


    @PostMapping("/addTemperature")
    public String show (@RequestParam String tempReading,ModelMap map){
            Temp temp = new Temp(tempReading);
            map.put("tempReading",temp);
     //   System.out.println(test);

        return "showTemperature";
    }


}
