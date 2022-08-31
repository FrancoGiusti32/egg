Algoritmo sin_titulo
	Definir n Como Real
	Escribir "Escriba la longitud de las 2 dimenciones de nuestra matris"
	Leer n
	Dimension x(n,n)
	Definir x Como Entero
	rellenar(x,n)
	Imprecion(x,n)
FinAlgoritmo

SubProceso rellenar(x,n)
	Definir i,j Como Entero
	para i = 0 hasta n -1
		para j = 0 hasta n -1
			si j = i Entonces
				x(j,i)= 0
			SiNo
				x(j,i)= Aleatorio(1,9)
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso Imprecion(x,n)
	Definir i,j Como Entero
	para i = 0 hasta n -1
		para j = 0 hasta n -1
			Escribir x(i,j), "/" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	