/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.primeraClase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author camper
 */

@RestController
@RequestMapping(path="/json",produces="application/json")
public class HelloController {
    ArrayList<Campers> campers = new ArrayList<>();

    @GetMapping("/facil")
    public String facil(){
        return ":D JSON!";
    }

    @GetMapping("/arreglo")
    public ArrayList<Campers> arreglo(){


        Campers c1 = new Campers();
        c1.setId("1");
        c1.setNombre("Si");
        c1.setApellido("No :(");

        campers.add(c1);

        return campers;

    }

    @GetMapping("/{id}/{name}/{last}")
    public ResponseEntity<Campers> obtenerData(@PathVariable String id, @PathVariable String name, @PathVariable String last)
    {
        Campers c1 = new Campers();
        c1.setId(id);
        c1.setNombre(name);
        c1.setApellido(last);

        campers.add(c1);
        HttpHeaders headers = new HttpHeaders();

        ResponseEntity<Campers> entity = new ResponseEntity<>(c1, headers, HttpStatus.CREATED);

        return entity;
    }
}

/*@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String holis(){
        return "Hola estrellitas, el cielo les dice HOLAAA!!!";
    }
    
    @RequestMapping("/json")
    public Map<String,String>prueba(){
        Map<String,String> map = new HashMap<>();
        map.put("name","Holis");
        return map;
    }
}
*/