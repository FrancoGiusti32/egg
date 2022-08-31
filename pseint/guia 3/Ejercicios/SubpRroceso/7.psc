Algoritmo TemperatutaMedia
	Definir Dias, i, tempMax, tempMen Como Real
	Escribir "Cuantos dias desea preguntar su temperatura?"
	Leer Dias
	
	para i = 1 Hasta Dias
		Escribir "escriba la temp Maxima y Minima "
		Leer tempMax
		Leer tempMen
		
		ClacularTemperatura(tempMax, tempMen)
		
		Escribir "la temperatura media del Dia ", i "es ", tempMax
		
	FinPara
FinAlgoritmo

SubProceso ClacularTemperatura(M por referencia, n por valor)
	m = (n + m)/2
FinSubProceso
	