Algoritmo sin_titulo
	Definir N, i como real	
	Escribir "Escriba la cantidad de numeros por vector"
	Leer n
	Dimension  A(N), B(N) , C(N)
	Definir a, b , c Como Real
	para i = 0 Hasta n-1
		c(i)=0
		b(i)=0
		a(i)=0
	FinPara
	menu(n,a,b,c)
FinAlgoritmo

SubProceso menu(n, a, b, c)
	
	Definir Opciones Como Caracter
	Escribir "A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria"
	escribir "B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria."
	escribir "C. Llenar Vector C con la suma de los vectores A y B."
	escribir "D. Llenar Vector C con la resta de los vectores B y A."
	escribir "E. Mostrar. "
	escribir "F. Salir."
	Leer Opciones
	segun Minusculas(Opciones)
		"a":
			llenar(a,n)
			menu(n,a,b,c)
		"b":
			llenar(b,n)
			menu(n,a,b,c)
		"c":
			sumar(c,a,b,n)
			menu(n,a,b,c)
		"d":
			restar(c,a,b,n)
			menu(n,a,b,c)
		"e":
			muestra(c,a,b,n)
		"f":
			Escribir "Vuelva prontooo"
		De Otro Modo:
			Escribir "Opcion no valida"
			menu(n,a,b,c)
	FinSegun
FinSubProceso

SubProceso restar(vf, v1, v2, n)
	Definir i Como Real
	para i = 0 Hasta n-1
		vf(i)= v1(i)-v2(i)
	FinPara
FinSubProceso

SubProceso sumar(vf, v1, v2, n)
	Definir i Como Real
	para i = 0 Hasta n-1
		vf(i)= v1(i)+v2(i)
	FinPara
FinSubProceso

SubProceso muestra(c,a,b,n)
	Definir opciones Como Caracter
	Definir i , x Como Real
	Repetir
		Escribir "seleccione que desea mostrar [a], [b], [c], [todas], [volver]"
		Leer opciones
		x=0
		Segun Minusculas(opciones)
			"a":
				para i = 0 hasta n-1
					Escribir "[A",i,"]"
					Escribir a(i)	
				FinPara
			"b":
				para i = 0 hasta n-1
					Escribir "[B",i,"]"
					Escribir b(i)	
				FinPara 
			"c":
				para i = 0 hasta n-1
					Escribir "[C",i,"]"
					Escribir c(i)	
				FinPara
			"todas", "t":
				para i = 0 hasta n-1
					Escribir "[A",i,"]"
					Escribir a(i)	
				FinPara
				para i = 0 hasta n-1
					Escribir "[B",i,"]"
					Escribir b(i)	
				FinPara
				para i = 0 hasta n-1
					Escribir "[C",i,"]"
					Escribir c(i)	
				FinPara
			"volver", "v":
				Escribir "De vuelta al menú"
				menu(n,a,b,c)
			De Otro Modo:
				Escribir "opcion invalida, elija una iocion valida"
				x = 1
		FinSegun
	Mientras Que x = 1
	menu(n,a,b,c)
FinSubProceso

SubProceso llenar (vector, n)
	Definir i Como Real
	para i = 0 hasta n-1
		vector(i) = Aleatorio(-100,100)
	FinPara
FinSubProceso
	