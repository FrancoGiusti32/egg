Algoritmo sin_titulo
	Definir n, n1, matris, i, j, Magica Como Entero

	Magica = 0
	
	Repetir
		Escribir "Escriba el tamaño de su matris magica"
		Leer n
	Mientras Que n > 10 o n < 0
	
	Dimension matris(n,n)
	
	Repetir
		Magica = 0
		para j = 0 hasta n-1
			para i = 0 hasta n-1
				Leer n1
				matris(i,j)=n1
			FinPara
		FinPara
		
		chequeo_de_magia(matris,n,Magica)
		si magica <> 0
			Escribir "la matris no es magica intente de nuevo"
		FinSi
	Mientras Que Magica <> 0
Escribir "LA MATRIS ES MAGICA"
	para j = 0 hasta n-1
		para i = 0 hasta n-1
			Escribir " ", matris(i,j) "/" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo


SubProceso chequeo_de_magia(x,n,z Por Referencia)
	Definir s1 , s2 Como Real
	filas(x,n,z,s1)
	columnas(x,n,z,s2)
	si s1 <> s2
		z=z+1
	FinSi
	primera_diagonal(x,n,z,s1)
	segunda_diagonal(x,n,z,s1)
//	Escribir z
FinSubProceso
SubProceso segunda_diagonal(x,n,z Por Referencia, s)
	Definir j,i, suma Como Entero
	suma = 0
	para j = 0 hasta n-1
		para i = 0 Hasta  n-1
			si j + i = n-1
				suma = suma + x(i,j)
			FinSi
		FinPara
	FinPara
	si suma <> s
		z = z+1
	FinSi
FinSubProceso
SubProceso primera_diagonal(x,n,z Por Referencia, s )
	Definir j,i, suma Como Entero
	suma = 0
	para j = 0 hasta n-1
		para i = 0 Hasta  n-1
			si i = j
				suma = suma + x(i,j)
			FinSi
		FinPara
	FinPara
	si suma <> s
		z = z+1
	FinSi
FinSubProceso
SubProceso columnas(x,n,z Por Referencia, s Por Referencia)
	Dimension sumador(n)
	Definir sumador, i, j, suma Como Entero
	s=0
	Para j = 0 Hasta  n-1
		para i = 0 Hasta n-1
			sumador(j) = x(j,i) + s
			s = sumador(j)
		FinPara
		s=0
	FinPara
	para i = 0 Hasta n-2
		si sumador(i) = sumador(i+1)
			s=sumador(1)
		SiNo
//			Escribir "matris no magica"
			z=z+1
		FinSi
	FinPara
FinSubProceso
SubProceso filas(x,n,z Por Referencia, s Por Referencia)
	Dimension sumador(n)
	Definir sumador, i, j, suma Como Entero
	s=0
	Para j = 0 Hasta  n-1
		para i = 0 Hasta n-1
			sumador(j) = x(i,j) + s
			s = sumador(j)
		FinPara
		s=0
	FinPara
	para i = 0 Hasta n-2
		si sumador(i) = sumador(i+1)
			s=sumador(1)
		SiNo
//			Escribir "matris no magica"
			z=z+1
		FinSi
	FinPara
FinSubProceso