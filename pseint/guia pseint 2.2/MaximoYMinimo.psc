Algoritmo MaximoYMinimo
	Definir Maximo, Minimo, Num, contador como real
	
	Escribir "Escriba el numero maximo a tener en cuenta para el conteo"
	Leer maximo
	Escribir "Escriba el minimo"
	Leer Minimo
	contador=0 
	Hacer
		Escribir "Escriba un numero entre el maximo y el minimo"
		leer num
		si num <= maximo y num >= Minimo
			contador= contador + 1
		FinSi
	Mientras Que num <= maximo y num >= Minimo
	Escribir "Se anotaron [", contador, "] numero/s entre el maximo y el minimo"
	
FinAlgoritmo