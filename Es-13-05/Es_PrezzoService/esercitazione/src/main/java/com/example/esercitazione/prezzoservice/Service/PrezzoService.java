package com.example.esercitazione.prezzoservice.Service;

import org.springframework.stereotype.Service;

@Service
public class PrezzoService {
    public double calcolaPrezzoScontato(double prezzoOriginale, int percentualeSconto){
        double sconto = prezzoOriginale * percentualeSconto / 100.0;
        return prezzoOriginale - sconto;
    }
}
