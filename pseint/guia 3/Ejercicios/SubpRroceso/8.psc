Algoritmo DivisionPorRestasSusecivas
	Definir num1, num2 Como Real
	Escribir "Esciba un numero"
	Leer num1
	Escribir "Esciba un numero por el cual dividir el anterior"
	Leer num2
	
	Divicion_Por_Resta(num1,num2)
	
	Escribir "El resto es: ", num1
	Escribir "El cociente es: ", num2
FinAlgoritmo

SubProceso Divicion_Por_Resta (DividendoOresto Por Referencia,DivisorOcociente Por Referencia)
	Definir Cociente Como Real
	Cociente = 0
	Mientras DividendoOresto >= DivisorOcociente
		DividendoOresto = DividendoOresto - DivisorOcociente
		Cociente = Cociente +1
	FinMientras
	
	DivisorOcociente = Cociente
FinSubProceso
	