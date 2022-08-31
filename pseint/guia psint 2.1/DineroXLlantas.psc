Algoritmo DineroXLlantas
	
	Definir cdll, PxLL, PT  Como Real
	
	Escribir "escriba la cantidad de llantas de desea comprar"
	Leer cdll
	
	si cdll <= 5
		PxLL=3000
	SiNo
		si	cdll <= 10
			PxLL=2500
		SiNo
			si	cdll > 10 
				PxLL=2000
			FinSi
		FinSi
	FinSi
	
	PT= PxLL * cdll
	
	Escribir "El valor de cada llanta es de: [", PxLL, "] y el valor total es de: [", PT, "]"
	
FinAlgoritmo
