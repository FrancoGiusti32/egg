Algoritmo sin_titulo
	Definir j,i Como Entero
	Definir  v Como Caracter
	Dimension v(5,15)
	j=0
	i=0
	Para i=0 Hasta 14
		v(j,i)="1"
	FinPara
	Para j=1 Hasta 3
		para i=0 Hasta 14
			si i=0 o i=14
				v(j,i)= "1"
			SiNo
				v(j,i)="0"
			FinSi
		FinPara
	FinPara
	j=4
	Para i=0 Hasta 14
		v(j,i)="1"
	FinPara
	para j=0 Hasta 4
		para i=0 hasta 14
			Escribir v(j,i) Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
