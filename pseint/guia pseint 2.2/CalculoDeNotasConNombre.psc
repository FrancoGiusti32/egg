Algoritmo CalculoDeNotasConNombre
	Definir Nombre Como Caracter
	Definir not1, not2, not3, resultado Como Real
Nombre = "dummy"
Mientras Nombre <> ""
	Escribir "escriba el nombre del alumno"
	Leer Nombre
		si Nombre <> ""
			Escribir "Su nota en la Práctica"
			Leer not1
			Escribir "Su nota en los Problemas"
			Leer not2
			Escribir "Su nota en la Teória"
			Leer not3
			resultado = (0.1*not1)+(0.4*not3)+(0.5*not2)
			si (not1 >= 1 ) y (not1 <= 10) y (not2 >= 1) y (not2 <= 10) y (not3 >= 1) y (not3 <= 10)
				Escribir "El resulado de las notas de ", Nombre, " es [", resultado, "]"
			SiNo
				Escribir "ERROR"
			FinSi
		FinSi
	FinMientras
FinAlgoritmo
