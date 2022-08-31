Algoritmo NotasDeAlumno
	definir not1, not2, not3, not4, promedio como real
	Escribir "escriba las 4 notas del alumno"
	Leer not1
	Leer not2
	Leer not3
	Leer not4
	
	si not1 < not2 y not1 < not3 y not1 < not4 
		promedio = (not2+not3+not4)/3
		Escribir "la nota eliminada fue la nota 1 y el promedio fue [", promedio, "]"
	SiNo
		si not1 > not2 y not2 < not3 y not2 < not4 
			promedio = (not1+not3+not4)/3
			Escribir "la nota eliminada fue la nota 2 y el promedio fue [", promedio, "]"
		SiNo
			si not3 < not2 y not1 > not3 y not3 < not4 
				promedio = (not2+not1+not4)/3
				Escribir "la nota eliminada fue la nota 3 y el promedio fue [", promedio, "]"
			SiNo
				si not4 < not2 y not4 < not3 y not1 > not4 
					promedio = (not2+not3+not1)/3
					Escribir "la nota eliminada fue la nota 4 y el promedio fue [", promedio, "]"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
