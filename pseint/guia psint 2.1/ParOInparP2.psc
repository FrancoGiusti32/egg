Algoritmo ParOInparP2
	Definir Num1, num2 Como Real
	Escribir "escriba 2 numeros para saber si son pares "
	Leer Num1
	Leer num2
	si Num1 = 0
		Escribir "El primer numero no es par ni impar"
	SiNo 
		si num2 = 0
			Escribir "El segundo numero no es par ni impar"
		SiNo
			si((Num1 mod 2) = 0) y  ((num2 mod 2) = 0)
				ESCRIBIR "Son [PAR]"
			SiNo
				Escribir "Son ,o uno de ellos es, [INPAR]"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
