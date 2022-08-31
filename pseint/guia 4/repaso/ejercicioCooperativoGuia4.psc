Algoritmo ejercicioCooperativoGuia4
	Definir tablero como Cadena
	Dimension tablero[9, 12]
	inicializarMatriz(tablero, 9, 12)
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	acomodarPalabras(tablero)
	imprimirMatriz(tablero, 9, 12)
FinAlgoritmo
SubProceso inicializarMatriz(m,h,k)
	Definir i,j Como Entero
	Para i=0 Hasta h-1
		para j=0 Hasta k-1
			m(i,j)="*"
		FinPara
	FinPara
FinSubProceso
SubProceso agregarPalabra(m,p,h)
	Definir i Como Entero
	Para i=0 Hasta 11
		m(h,i) = Subcadena(p,i,i)
	FinPara
FinSubProceso
SubProceso acomodarPalabras(m)
	Definir p,h,i,j,k,s Como real	
	k=12
	Para h=0 Hasta 8
		BuscarR(m,h,p)
		s=5-p
		si s <> 0
			Para i = 0 Hasta s-1
				Para j = k-1  Hasta 0 con paso -1
					si j <> 0
						m(h,j) = m(h,j-1)
					FinSi
				FinPara
				m(h,j+1)="*"
			FinPara
		FinSi
	FinPara
	Para i=0 Hasta 8
		para j=0 Hasta k-1
			si m(i,j)=" " o m(i,j)=""
				m(i,j)="*"
			FinSi
		FinPara
	FinPara
FinSubProceso
SubProceso BuscarR(m,h,p Por Referencia)
	Definir i Como Entero
	Para i=0 Hasta 11
		si m(h,i) = "r"
			p=i
			i=11
		FinSi
	FinPara
FinSubProceso
SubProceso imprimirMatriz(m,h,k)
	Definir i,j Como Entero
	Para i=0 Hasta h-1
		para j=0 Hasta k-1
			escribir m(i,j), " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
