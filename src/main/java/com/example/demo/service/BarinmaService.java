package com.example.demo.service;

import com.example.demo.model.Barinma;

import java.util.List;

public interface BarinmaService {
    List<Barinma> fetchBarinmaList();

    Barinma getBarinmaById(Long id);

    public void deleteBarinmaById(Long id);

    public Barinma createBarinma(Barinma Barinma);

    public Barinma updateBarinma(Barinma Barinma, Long id);

}
