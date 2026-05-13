package com.example.esercitazione.prezzoservice.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class ProdottoService {
    private final PrezzoService prezzoService;

    private List<String> prodotti;
    private Map<String, Double> prezzi;

    public ProdottoService(PrezzoService prezzoService){
        this.prezzoService = prezzoService;
    }

    @PostConstruct
    public void init(){
        prodotti = new ArrayList<>();
        prezzi = new HashMap<>();

        prodotti.add("Laptop");
        prodotti.add("Mouse");
        prodotti.add("Monitor");

        prezzi.put("Laptop", 1200.0);
        prezzi.put("Mouse", 25.0);
        prezzi.put("Monitor", 300.0);
    }

    public void stampaCatalogo(int percentualeSconto){
        System.out.println("--- Catalogo ---  (Sconto applicato : " + percentualeSconto +"%)" );

        for (String prodotto : prodotti) {
            double prezzoOriginale = prezzi.get(prodotto);
            double prezzoScontato = prezzoService.calcolaPrezzoScontato(prezzoOriginale, percentualeSconto);
            
            System.out.println(prodotto + "- Prezzo base: " + prezzoOriginale + "| Prezzo Scontato: " + prezzoScontato);
        }
    }
}
