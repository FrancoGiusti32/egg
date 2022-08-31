Algoritmo sin_titulo
	Definir v,i,j, dummy, resultado Como Entero
	Dimension v(3,3)
	para j = 0 hasta 2
		para i = 0 hasta 2
			v(j,i)= Aleatorio(1,5)
			dummy = v(j,i)
		FinPara
	FinPara
	resultado = 1
	para j=0 Hasta 2
		para i=0 Hasta  2
			Escribir "/", v(j,i) Sin Saltar
		FinPara
		Escribir ""
	FinPara
	para j=0 Hasta 2
		para i=0 Hasta  2
			resultado = resultado*v(j,i)
		FinPara
	FinPara
	Escribir resultado
FinAlgoritmo
