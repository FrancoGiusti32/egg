Algoritmo Calculadora
	menu
FinAlgoritmo
SubProceso menu 
	Definir Eleccion Como Real
	Escribir "[ Calculadora de Materiales ]"
	Escribir " "
	Escribir "1 - Calcular muro de ladrillo"
	Escribir "2 - Calcular viga de hormigón"
	Escribir "3 - Calcular columnas de hormigón"
	Escribir "4 - Calcular contrapisos"
	Escribir "5 - Calcular techo"
	Escribir "6 - Calcular pisos"
	Escribir "7 - Calcular pintura"
	Escribir "8 - Calcular iluminación"
	Escribir "9 - Salir"
	Escribir " "
	Escribir "[seleccione su opcion]"
	Leer Eleccion 
	Segun Eleccion 
		1:
			Calcular_muro_de_ladrillo
		2:
			Calcular_viga_de_hormigon
		3:
			Calcular_Columna 
		4:
			Calcular_Contrapisos
		5:
			calcular_techo
		6:
			Calcular_pisos
		7:
			Calcular_pintura
		8:
			Calcular_Iluminacion
		9:
			Escribir "Gracias, hasta luego"
	FinSegun
FinSubProceso
SubProceso Calcular_muro_de_ladrillo 
	Definir Espesor, largo, alto, superficie como real
	Repetir
		Escribir "Su muro tiene [20] o [30] cm de espesor?"
		Leer Espesor
	Mientras Que Espesor <> 30 y Espesor <> 20 
	Escribir "Escriba el Alto del muro"
	Leer alto
	alto = abs(alto)
	Escribir "Escriba el Largo del muro"
	Leer largo
	largo = abs(largo)
	Calcular_Superficie(largo,alto,superficie)
	Escribir "la superficie es ", superficie, " m2"
	Segun Espesor
		20:
			Escribir "Los materiales que necesitas para este muro son ", (superficie*10.9), " kg de cemento, ", (superficie*0.09), " m3 de arena y " (superficie*90) " ladrillos" 
		30:
			Escribir "Los materiales que necesitas para este muro son ", (superficie*15.2), " kg de cemento, ", (superficie*0.115), " m3 de arena y " (superficie*120) " ladrillos" 
	FinSegun
	Volver_Al_menu
FinSubProceso
SubProceso Calcular_viga_de_hormigon
	Definir largo Como Real
	Escribir "Ingrese el largo de la viga"
	Leer  largo
	largo = abs(largo)
	Escribir "Los materiales que necesitas para esta viga son ", (largo*9) " kg de cemento, " (largo*0.02) " m3 de arena ", (largo*0.02) " m2 de piedra " (largo*4) " m de hierro del 8 y" (largo*3) "m  de hierro del 4"
	Volver_Al_menu	
FinSubProceso 
SubProceso Calcular_Columna 
	Definir  largo Como Real
	Escribir "Escriba el largo de su columna"
	Leer  largo
	Escribir "Los materiales que necesitas para esta columna son ", (largo*7.5) " kg de cemento, " (largo*0.016) " m3 de arena ", (largo*0.016) " m2 de piedra " (largo*6) " m de hierro del 10 y " (largo*3) "m  de hierro del 4"
	Volver_Al_menu	
FinSubProceso
SubProceso Calcular_Contrapisos
	Definir Espesor, Ancho, Largo, volumen Como Real
	Escribir "Escriba el Espesor del contra piso"
	Leer Espesor
	Escribir "Escriba el Ancho del contra piso"
	Leer Ancho
	Escribir "Escriba el Largo del contra piso"
	Leer Largo
	Calcular_Volumen(largo, ancho, Espesor, Volumen)
	Escribir "Los materiales que necesitas para este contrapiso son ", (volumen*105) " kg de cemento, ", (volumen*0.45), " m3 de arena  y ", (volumen*0.9), " m3 de piedra " 
	Volver_Al_menu	
FinSubProceso
SubProceso calcular_techo
	Definir Espesor, Ancho, Largo, superficie Como Real
	Escribir "Escriba el Espesor del techo"
	Leer Espesor
	Escribir "Escriba el Ancho del techo"
	Leer Ancho
	Escribir "Escriba el Largo del techo"
	Leer Largo
	Calcular_Superficie(largo,ancho,superficie)
	Escribir "Los materiales que necesitas para este techo son ", (superficie*33), " kg de cemento, ", (superficie*0.072), " m3 de arena y " (superficie*0.072) " m3 de piedra, " (superficie*7) " m  de hierro del 8 y " (superficie*4) " m de hierro del 6" 
	Volver_Al_menu	
FinSubProceso
SubProceso Calcular_pisos
	Definir ancho, largo, superficie Como Real
	Escribir "Ingrese el ancho del piso:"
	Leer ancho
	Escribir "Ingrese el largo del piso:"
	Leer largo
	calcular_superficie(largo, ancho, superficie)
	superficie=superficie*1.1
	Escribir "El total de la superficie del piso es de: ", superficie, " m2."
	Volver_Al_menu	
FinSubProceso
SubProceso Calcular_pintura
	Definir superficie Como Real
	Escribir "Ingrese la superficie del muro:"
	Leer superficie
	Escribir "Necesitamos ", (superficie/6) " litros de pintura."
	Volver_Al_menu	
FinSubProceso
SubProceso Calcular_Iluminacion
	Definir Superficie Como Real
	Escribir "Escibre la superficie de la habitación"
	Leer superficie
	Escribir "La minima cantidad de superficie de iluminacion natural es " (superficie*0.20) " m2"
	Volver_Al_menu
FinSubProceso
SubProceso  Volver_Al_menu
	Definir eleccion Como caracter
	Escribir "Desea volver al menu?"
	Leer  eleccion
	si Minusculas(eleccion) = "si" o  Minusculas(eleccion) = "sí" o Minusculas(eleccion) = "s"
		menu
	SiNo
		Escribir "Gracias, hasta luego"
	FinSi
FinSubProceso
SubProceso Calcular_Superficie(L Por valor,A Por Valor,S Por referencia)
	S=L*A
FinSubProceso
SubProceso Calcular_Volumen(L Por valor,A Por Valor, E Por Valor, V Por referencia)
	V=L*A*E
FinSubProceso