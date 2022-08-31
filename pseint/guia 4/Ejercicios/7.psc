Algoritmo sin_titulo
	Definir n Como Real
	Escribir "Indique el tamaño de los vectores"
	Leer n
	Dimension n1(n), n2(n)
	Definir n1,n2 Como Entero
	Rellenado(n1,n)
	Rellenado(n2,n)
	Escribir Igualdad_de_vectores(n1,n2,n)
FinAlgoritmo

SubProceso Rellenado(x,n)
	Definir i Como Real
	para i=0 hasta n-1
		x(i)=Aleatorio(0,1)
	FinPara
FinSubProceso

Funcion Comprobacion = Igualdad_de_vectores(x,z,n)
	Definir Comprobacion Como Logico
	Definir i Como Real
	Comprobacion= Verdadero
	para i = 0 hasta n-1
		si x(i)<>z(i)
			Comprobacion = falso
		FinSi
	FinPara
FinFuncion
	