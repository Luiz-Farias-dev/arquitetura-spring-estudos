package com.estudo.springboot.arquiteturaspring.montadora.api;

import com.estudo.springboot.arquiteturaspring.montadora.CarroStatus;
import com.estudo.springboot.arquiteturaspring.montadora.Chave;
import com.estudo.springboot.arquiteturaspring.montadora.HondaHRV;
import com.estudo.springboot.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);

        carro.darIgnicao(chave);
    }
}
