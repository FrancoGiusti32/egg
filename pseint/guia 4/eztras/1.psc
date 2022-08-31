Algoritmo llenar_2_a_la_ves
	Definir i, v1,v2 Como Real
	Dimension v1(5),v2(5)
	para i = 0 Hasta  4
		v1(i)=Aleatorio(-100, 100)
		v2(i)=Aleatorio(-100, 100)
		Escribir v1(i) "/" Sin Saltar
	FinPara
	Escribir ""
	para i = 0 Hasta 4
		Escribir v2(i) "/" Sin Saltar	
	FinPara
	Escribir ""
FinAlgoritmo
