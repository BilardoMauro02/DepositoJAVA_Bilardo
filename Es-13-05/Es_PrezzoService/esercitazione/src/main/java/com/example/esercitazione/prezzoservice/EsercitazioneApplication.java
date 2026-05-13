package com.example.esercitazione.prezzoservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.esercitazione.prezzoservice.Service.ProdottoService;

@SpringBootApplication
public class EsercitazioneApplication implements CommandLineRunner{

	private final ProdottoService prodottoService;

	public EsercitazioneApplication(ProdottoService prodottoService){
		this.prodottoService = prodottoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(EsercitazioneApplication.class, args);
	}

	@Override
	public void run(String... args){
		prodottoService.stampaCatalogo(20);
	}

}
