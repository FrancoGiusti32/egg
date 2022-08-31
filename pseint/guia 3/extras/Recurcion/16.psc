Algoritmo OracionAlReves
	Definir Oracion, salida Como Caracter
	Definir Contador Como Real
	Leer Oracion
	salida= ""
	Contador = Longitud(Oracion)
	
 Darvuelta(Oracion,Contador,salida)
 
 Escribir salida
 
FinAlgoritmo


SubProceso DarVuelta(Frase Por Referencia, C Por Referencia, salida Por Referencia)
	
	si c<>0
		c=c-1
		salida = Concatenar(salida,Subcadena(Frase,c,c))
		DarVuelta(Frase, C, salida)
	FinSi
	
	
FinSubProceso
	