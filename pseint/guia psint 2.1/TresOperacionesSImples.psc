Algoritmo TresOperacionesSImples
	
	Definir operacion Como Caracter
	Definir  num1, num2, resultado Como Real
	
	Escribir "escriba la operacion que desea realisar [suma, resta, multiplicación o divición]seguida de los 2 numeros a lso que se le aplicará"
	Leer operacion
	Leer num1
	Leer num2
	
	operacion = Subcadena(operacion,0,0)
	
	Segun operacion
		
	"S" o "s":
		resultado = num1 + num2
		Escribir num1, " + ", num2, " = ", resultado
		
	"R" o "r":
		
		resultado = num1 - num2
		Escribir num1, " - ", num2, " = ", resultado
		
	"m" o "M":
		
		resultado = num1 * num2
		Escribir num1, " x ", num2, " = ", resultado
		
	"D" o "d":
		
		resultado = num1 / num2
		Escribir num1, " / ", num2, " = ", resultado
		
		de otro modo
		
		Escribir "Operacion no Comprendida BEEP BOOP AUTO DESTRUCCION INICIADA EN 3... 2... 1... BOOOM ********"
	FinSegun
FinAlgoritmo
