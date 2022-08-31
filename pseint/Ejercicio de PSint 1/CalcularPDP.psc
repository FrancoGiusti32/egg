Algoritmo CalcularPDP
	
	Definir PrecioI,  PrecioF, DiferenciaDP, PorcentajeDP Como Real
	
	Escribir "Escriba l precio del producto al inicio y al final del año"
	
	Leer PrecioI
	Leer PrecioF
	
	DiferenciaDP = PrecioF - PrecioI
	
	PorcentajeDP = ((redon(((DiferenciaDP*100)/PrecioI)*100))/100)
	
	Escribir "El precio aumento en un ", PorcentajeDP, "% en un periodo de 1 año"
	
FinAlgoritmo
