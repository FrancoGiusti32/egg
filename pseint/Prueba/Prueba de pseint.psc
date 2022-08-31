Algoritmo sin_titulo
	Definir s,m Como Caracter
	Definir n Como Real
	Definir v Como Logico
	v=Verdadero
	s="BCBBABBACBBBBCBB"
	ConfirmadorDeBases(s,v)
	n=raiz(Longitud(s))
	si n<>3 y n<>4 y n<>37 
		v=falso
	FinSi
	Escribir n
	si n <> trunc(n)
		v=falso
	SiNo
		Dimension m(n,n)
		LlenarMatris(m,n,s)
		
	FinSi
	coroborarDiagonalSecundaria(m,n,v)
	corroborarDiagonalPrincipal(m,n,v)
	si v=Verdadero
		ImprimirMatris(m,n)
		Escribir ""
		Escribir "ESTA SECUENSIA CORRESPONDE A UN GEN ZOMBIE, TEN CUIDADO"
	SiNo
		error
	FinSi
	ImprimirMatris(m,n)
FinAlgoritmo
SubProceso coroborarDiagonalSecundaria(m,n,v por referencia)
	Definir i,j Como Real
	Definir x, dummy Como Caracter
	x=m(0,n-1)
	para i=0 hasta n-1
		para j=0 hasta n-1
			si i+j=n-1
				dummy=m(i,j)
				si m(i,j)=x
					
				SiNo
					v=falso
				FinSi
			FinSi
		FinPara
	FinPara
FinSubProceso
SubProceso corroborarDiagonalPrincipal(m,n,v por referencia)
	Definir i,j Como Real
	Definir x, dummy Como Caracter
	x=m(0,0)
	para i=0 hasta n-1
		para j=0 hasta n-1
			si i=j
				dummy=m(i,j)
				si m(i,j)=x
					
				SiNo
				v=falso
				FinSi
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso ConfirmadorDeBases(s,v por referencia) 
	Definir i Como Real
	para i = 0 Hasta Longitud(s)-1
		Segun Subcadena(s,i,i)
			"a"o"A":
			"b"o"B":
			"c"o"C":
			"d"o"D":
			De Otro Modo:
				v=falso
		FinSegun
	FinPara
FinSubProceso

SubProceso LlenarMatris(m,n,s)
	Definir i,j,x Como Real
	x=0
	para i = 0  Hasta n-1
		Para j=0 hasta n-1
			m(i,j)=Subcadena(s,x,x)
			x=x+1
		FinPara
	FinPara
FinSubProceso

SubProceso ImprimirMatris(m,n)
	Definir i,j Como Real
	para i=0 Hasta n-1
		para j=0 hasta n-1
			Escribir Mayusculas(m(i,j)), "  " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso Error
	Escribir "[Secuensia incompleta]"
	Escribir "Esta secuencioa de bases no cumple con las caracteristicas ser un GenZ asi que se descarta"
FinSubProceso
	