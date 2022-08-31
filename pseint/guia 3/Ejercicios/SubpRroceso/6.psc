Algoritmo IntercambioDeValores
	Definir A, B Como entero
	Escribir "escriba los valores a intercambiar"
	Leer A
	Leer B
	
	Interrcambio_de_valores(A, B)
	
	Escribir A
	Escribir B
FinAlgoritmo

SubProceso Interrcambio_de_valores (val1 Por Referencia, val2 Por Referencia )
	Definir x Como Entero
	x = val1
	val1 = val2
	val2 = x
FinSubProceso
