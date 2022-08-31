Algoritmo MCD
	Definir num1, num2  Como Real
	Leer num1
	Leer num2
	Escribir MaximoComunDivisor(num1,num2)

FinAlgoritmo

Funcion Resultado = MaximoComunDivisor(N1,N2)
	Definir Resultado Como Real
	
	si n2 = 0
		Resultado = n1
	SiNo
		n2 = (n1 mod n2)
		Resultado= MaximoComunDivisor(n1,n2)
	FinSi
FinFuncion



///SubProceso sacarMCD(n1 Por referencia,n2 Por referencia, r Por Referencia)

/// Si n1 = 0
///		r = n2
///	SiNo
///		n2 = (n1 mod n2)
///		sacarMCD( n1, n2, r)
///	FinSi
	
/// FinSubProceso
