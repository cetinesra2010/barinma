package com.example.demo.controller;

import com.example.demo.model.Barinma;
import com.example.demo.service.BarinmaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barinma")
//@Cacheable
@Validated
public class BarinmaController {
    @Autowired
    private BarinmaService barinmaService;

    @GetMapping("/barinma")
    //@Cacheable(value = "employees")
    public List<Barinma> fetchBarinmaList()
    {
        System.out.println(" at fetchEmployeeList controller");
        return barinmaService.fetchBarinmaList();
    }

    @PostMapping("/create")
    //@Cacheable(value = "employees", key = "#employee.id")
    //@Cacheable(value = "employees")
    public Barinma createEmployee(@Valid @RequestBody Barinma barinma)
    {
        System.out.println(" at createEmployee controller");
        return barinmaService.createBarinma(barinma);

    }

    @GetMapping("fetch/{id}")
    //@Cacheable(value = "employees", key= "#id")
    //@Cacheable(value = "employee", key = "#id" , unless = "#employee.age > 30")
    public Barinma getBarinmaById(@PathVariable("id") Long id) {
        return barinmaService.getBarinmaById(id);

    }

    @PutMapping("update/{id}")
    public Barinma updateBarinma(@PathVariable("id") Long id, @RequestBody Barinma barinma) {
        return barinmaService.updateBarinma(barinma, id);

    }

    @DeleteMapping("delete/{id}")
    public void deleteBarinma(@PathVariable("id") Long id)
    {
        barinmaService.deleteBarinmaById(id);
    }
}