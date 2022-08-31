Algoritmo TeLlevoATodosLadosSA
	Definir litros, Tiempo, Precio Como Real
	Escribir "escribra la cantidad de litros consumidos seguido a la cantidad de horas transcurridas"
	Leer litros
	Leer Tiempo

	si Tiempo <= 2
		Escribir "Serian 400$ y la nafta invita la casa"
		
	SiNo
		Precio = (litros*40) + ((Tiempo/60)*5.20)
		Escribir "Serian ", Precio "$, Gracias por su alquiler :D"
	FinSi
	
	
FinAlgoritmo
