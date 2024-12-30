package com.example.demo.service;

import com.example.demo.model.Barinma;
import com.example.demo.repository.BarinmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarinmaServiceImpl implements BarinmaService{

    @Autowired
    private BarinmaRepository barinmaRepository;

    @Override
    public List<Barinma> fetchBarinmaList() {
        return barinmaRepository.findAll();
    }

    @Override
    public Barinma getBarinmaById(Long id) {
        Optional<Barinma> barinmaOptional = barinmaRepository.findById(id);
        return barinmaOptional.orElse(null);
    }

    @Override
    public void deleteBarinmaById(Long id) {
        barinmaRepository.deleteById(id);
    }

    @Override
    public Barinma createBarinma(Barinma barinma) {
        return barinmaRepository.save(barinma);
    }

    @Override
    public Barinma updateBarinma(Barinma barinmaUpdate, Long id) {
        Barinma barinma = getBarinmaById(id);

        if(barinma != null){
            barinma.setIl(barinmaUpdate.getIl());
            barinma.setIlce(barinmaUpdate.getIlce());
            barinma.setBarinmaAdet(barinmaUpdate.getBarinmaAdet());
            return barinmaRepository.save(barinmaUpdate);
        } else {
            return null;
        }
    }
}
