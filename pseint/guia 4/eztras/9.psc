Algoritmo sin_titulo
	Definir n, m, vector Como Real
	Leer n
	Leer m
	Dimension vector(n,m)
	rellenar(vector,n,m)
	Ensenar(vector,n,m)
FinAlgoritmo

SubProceso rellenar (v,n,m)
	Definir i,j Como Entero
	para j = 0 Hasta m-1
		Para  i = 0 Hasta n-1
			v(i,j)= Aleatorio(0,100)
		FinPara
	FinPara
FinSubProceso

SubProceso Ensenar(v,n,m)
	Definir i,j Como Entero
	para j = 0 Hasta m-1
		Para  i = 0 Hasta n-1
			Escribir "/", v(i,j), "" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	