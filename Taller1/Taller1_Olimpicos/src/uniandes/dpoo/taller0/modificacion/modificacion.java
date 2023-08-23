package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;


public class modificacion {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		CalculadoraEstadisticas calculadora = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println(calculadora.paisConMasMedallistas());
		Map<String, Integer> paises = calculadora.paisConMasMedallistas();
		if (paises.size() > 1)
		{
			System.out.println("Hay " + paises.size() + " países empatados en el primer lugar.");
		}
		for (String nombre : paises.keySet())
		{
			System.out.println("El país que más medallas ha tenido es " + nombre + " y ha tenido " + paises.get(nombre) + " medallistas");
		}
	}
	}
