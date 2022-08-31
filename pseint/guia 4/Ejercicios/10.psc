Algoritmo sin_titulo
	Definir n , m Como Real
	Escribir "Escriba la medida de las 2 dimeciones de su matris"
	Leer n
	Leer m
	Dimension x(n,m)
	Definir  x , resultado, i ,j Como Entero
	rellenado(x,n,m)
	suma(x,n,m,resultado)
	para i = 0 hasta n-1
		para j = 0 hasta m-1
			escribir Sin Saltar x(i,j) "/"
		FinPara
		escribir	""
	FinPara
	Escribir resultado
FinAlgoritmo

SubProceso  rellenado(x,n,m)
	Definir i, j Como Real
	para i = 0 hasta n-1
		para j = 0 hasta m-1
			x(i,j) = Aleatorio(-100,100)
		FinPara
	FinPara
FinSubProceso


SubProceso  Suma(x,n,m, r Por Referencia)
	Definir i, j Como Real
	r = 0
	para i = 0 hasta n-1
		para j = 0 hasta m-1
			r = r + x(j,i)
		FinPara
	FinPara
FinSubProceso