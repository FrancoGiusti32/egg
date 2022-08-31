Algoritmo ClaveEUREKA
	Definir clave Como Caracter
	Definir intentos, i Como Real
	Definir correcta Como Logico
	i=1
	Hacer
		Escribir "esciba la clave correcta tiene 3 intentos"
		Leer clave
		clave = Minusculas(clave)
		si clave = "eureka"
			correcta = Verdadero
			i = 4
		SiNo
			i = i +1
			correcta = Falso
		FinSi	
	Mientras Que i <= 3
	si correcta
		Escribir "la clave ingresada es :", correcta
	SiNo
		Escribir "intentos agotados"
	FinSi

FinAlgoritmo
