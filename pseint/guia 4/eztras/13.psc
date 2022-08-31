Algoritmo sin_titulo
	Definir  v,n,j,i Como Entero
	Escribir "Escriba cuantas filas desea que tenga su matris"
	Leer n
	Dimension v(3,n)
	
	para j=0 Hasta n-1
		Para i=0 Hasta 1
			Leer v(i,j)
		FinPara
		Escribir "/"
	FinPara
	
	Para j=0 Hasta n-1
		v(2,j)=(v(0,j))+(v(1,j))
	FinPara
	Para j=0 Hasta n-1
		Escribir v(0,j),"+",v(1,j),"=",v(2,j)
	FinPara
	
FinAlgoritmo
