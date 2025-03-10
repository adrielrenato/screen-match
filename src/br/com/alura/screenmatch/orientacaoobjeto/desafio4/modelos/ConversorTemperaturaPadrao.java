package br.com.alura.screenmatch.orientacaoobjeto.desafio4.modelos;

import br.com.alura.screenmatch.orientacaoobjeto.desafio4.interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
