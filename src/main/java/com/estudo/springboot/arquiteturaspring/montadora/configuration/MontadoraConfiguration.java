package com.estudo.springboot.arquiteturaspring.montadora.configuration;

import com.estudo.springboot.arquiteturaspring.montadora.Motor;
import com.estudo.springboot.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    //Bean é um métdo que retorna um objeto construido que será usado em várias partes do sistema
    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
}
