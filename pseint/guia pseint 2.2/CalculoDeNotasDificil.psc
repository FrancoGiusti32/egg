Algoritmo CalculoDeNotasDificil
	Definir Cdealumnos, not1, not2, not3, j, reprobado, sumaR, divisorR, porcentajeA, AlumnA, mayorNot, estudiantePar  Como Real
	Escribir "cuantos alumnos desea calcular su periodo?"
	
	
	
	
	
	divisorR = 0
	AlumnA = 0
	mayorNot = 0
	estudiantePar = 0
	sumaR = 0
	Para j = 1 Hasta Cdealumnos
		Escribir "escriba la nota del TP Integrador"
		Leer not1
		Escribir "escriba la nota de la Expocición "
		Leer not2
		Escribir "escriba la nota del Parcial"
		Leer not3
		
		si ((not1+not2+not3)/3)<=6.5
			sumaR = sumaR + ((not1 + not2 + not3)/3)
			divisorR = divisorR + 1
		FinSi
		si (not1)>=7.5
			AlumnA=AlumnA+1
		FinSi
		si (not2)>=mayorNot
			mayorNot=not2
		FinSi
		si (not3)>=4.0 Y (not3)<=7.5
			estudiantePar = estudiantePar+1
		FinSi
	FinPara
	reprobado = sumaR / divisorR
	porcentajeA = (AlumnA+100)/Cdealumnos
	
	Escribir "El promedio final de los reprovados es [", reprobado, "].  El Porcentaje de alumnos que tiene nota en el TP Integrador mayor al 7.5 es [",porcentajeA , "$]"
	Escribir "La Mayor nota de las Expociciones es [", mayorNot, "].   Y el total de estudiantes que obtuvieron entre 4.0 y 7.5 como nota en el Parcial es [", estudiantePar, "]"
FinAlgoritmo
