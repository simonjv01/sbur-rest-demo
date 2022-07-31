package com.example.sburrestdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class RestApiDemoController {
    private List<Coffee> coffees = new ArrayList<>();


public RestApiDemoController() {
    coffees.addAll(List.of(
            new Coffee("Cafe Cereza"),
            new Coffee("Cafe Ganador"),
            new Coffee("Cafe Lareno"),
            new Coffee("Cafe Tres Pontas")
    ));
    }

    //@RequestMapping(value = "/coffees", method = RequestMethod.GET)
    @GetMapping("/coffees")
    Iterable<Coffee> getCoffees() {
    return coffees;
}

}
