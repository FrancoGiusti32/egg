Algoritmo QueTeParioFibonacci
	Definir Limite, num1, num2, num3 Como Real
	Leer limite
	num1 = 1
	num2 = 0
	Fibonachi(limite,num1,num2,num3)
	Escribir num2
FinAlgoritmo

SubProceso Fibonachi(L Por Referencia, n1 Por Referencia, n2 Por Referencia, n3 Por Referencia)
	
	si l <> 0
		l=l-1
		n3 = n2 + n1
		n1 = n2
		n2 = n3
		Fibonachi(l,n1,n2,n3)
	FinSi
	
FinSubProceso
	