Algoritmo EficienciaObreros
	
	Definir Defectuosos, sinDefectos, nota Como entero
	
	escribir "escriba cuantos tonillos defectuoso produjo y cuantos sin defectos"
	Leer Defectuosos
	Leer sinDefectos
	
	si Defectuosos > 200 y sinDefectos < 10000
		nota = 5
	SiNo
		si Defectuosos < 200 y sinDefectos <10000
			nota = 6
		sino
			si Defectuosos > 200 y sinDefectos > 10000
				nota = 7
			SiNo
				si Defectuosos < 200 y sinDefectos > 10000
					nota = 8
				FinSi
			FinSi
		FinSi
	FinSi
	
	Escribir "el grado de eficiencia es: [", nota, "]"
FinAlgoritmo
