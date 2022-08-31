Algoritmo NumeroMayor
	Definir num, i, numMayor, cantidad Como real
	Escribir "escriba la cantidad de numero que va a ingresar"
	Leer cantidad
	
	numMayor= 0
	
	Para i=1 Hasta  cantidad Con Paso  1
		
		Escribir "escriba el numero"
		Leer num
		
		si	numMayor < num
			numMayor = num
		FinSi
		
	FinPara
	
	Escribir numMayor
FinAlgoritmo
