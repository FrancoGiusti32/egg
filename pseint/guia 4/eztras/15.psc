Algoritmo sin_titulo
	Definir m,num Como caracter	
	Definir i,j,e,h,k,l, suma, mv, pr Como Real
	Dimension m(7,8)
//	j columna i fila
	Para j = 0 Hasta 7
		para i = 0 Hasta 6
			m(i,j)="           /"
		FinPara
	FinPara
	para i = 0 Hasta 7
		m(6,i)="                    /"
	FinPara
	///	10
	m(0,0)="           /"
	m(1,0)=" Lunes     /"
	m(2,0)=" Martes    /"
	m(3,0)=" Miercoles /"
	m(4,0)=" Jueves    /"
	m(5,0)=" Viernes   /"
	m(6,0)=" Total del Producto /" 
	/// 19
	para i = 1 Hasta 5
		Escribir "Escriba el nombre del producto ", i
		Leer m(0,i)
		para j = Longitud(m(0,i)) Hasta 10
			m(0,i) = Concatenar(m(0,i)," ")
		FinPara
		m(0,i)=Concatenar(m(0,i),"/")
	FinPara
	m(0,6)="Total * dia/"
	m(0,7)="Pr mas vend/"
	Para j = 1 Hasta 5
		para i = 1 Hasta 5
			e=0
			para h = 0 Hasta longitud(m(0,i))
				si Subcadena(m(0,i),h,h) <> " " y Subcadena(m(0,i),h,h) <> ""
					e=e+1
				FinSi
			FinPara
			Escribir "Cuantos/as ", Subcadena(m(0,i),0,e-2), " vendio el ", m(j,0)
			Leer m(j,i)
			para h = Longitud(m(j,i)) Hasta 5
				m(j,i) = Concatenar(m(j,i)," ")
			FinPara
			para h = Longitud(m(j,i)) Hasta 10 
				m(j,i) = Concatenar(" ",m(j,i))
			FinPara
			m(j,i)=Concatenar(m(j,i),"/")
		FinPara
	FinPara
	para j = 1 Hasta 5
		suma=0
		num="0"
		Para i = 1 Hasta 5
			Para h=0 Hasta Longitud(m(j,i))
				e=0
				para k = 0 Hasta longitud(m(0,i))
					si Subcadena(m(j,i),k,k) <> " " y Subcadena(m(j,i),k,k) <> ""y Subcadena(m(j,i),k,k) <> "/"
						e=e+1
					FinSi
				FinPara
				si Subcadena(m(j,i),h,h) <> " " y Subcadena(m(j,i),h,h) <> "" y Subcadena(m(j,i),h,h) <> "/"
					num = Subcadena(m(j,i),h-e+1,h)
				FinSi
			FinPara
			suma=suma+ConvertirANumero(num)
		FinPara
		m(j,6) = ConvertirATexto(suma)
		para h = Longitud(m(j,6)) Hasta 5
			m(j,6) = Concatenar(m(j,6)," ")
		FinPara
		para h = Longitud(m(j,6)) Hasta 10 
			m(j,6) = Concatenar(" ",m(j,6))
		FinPara
		m(j,6)=Concatenar(m(j,6),"/")
	FinPara
	para i = 1 Hasta 6
		suma=0
		num="0"
		Para j = 1 Hasta 5
			Para h=0 Hasta Longitud(m(j,i))
				e=0
				para k = 0 Hasta longitud(m(0,i))
					si Subcadena(m(j,i),k,k) <> " " y Subcadena(m(j,i),k,k) <> ""y Subcadena(m(j,i),k,k) <> "/"
						e=e+1
					FinSi
				FinPara
				si Subcadena(m(j,i),h,h) <> " " y Subcadena(m(j,i),h,h) <> "" y Subcadena(m(j,i),h,h) <> "/"
					num = Subcadena(m(j,i),h-e+1,h)
				FinSi
			FinPara
			suma=suma+ConvertirANumero(num)
		FinPara
		m(6,i) = ConvertirATexto(suma)
		para h = Longitud(m(6,i)) Hasta 10
			m(6,i) = Concatenar(m(6,i)," ")
		FinPara
		para h = Longitud(m(6,i)) Hasta 19 
			m(6,i) = Concatenar(" ",m(6,i))
		FinPara
		m(6,i)=Concatenar(m(6,i),"/")
	FinPara
	Para i = 1 Hasta 5
		mv=0
		para j=1 hasta 5
			Para h=0 Hasta Longitud(m(j,i))
				e=0
				para k = 0 Hasta longitud(m(0,i))
					si Subcadena(m(j,i),k,k) <> " " y Subcadena(m(j,i),k,k) <> ""y Subcadena(m(j,i),k,k) <> "/"
						e=e+1
					FinSi
				FinPara
				si Subcadena(m(j,i),h,h) <> " " y Subcadena(m(j,i),h,h) <> "" y Subcadena(m(j,i),h,h) <> "/"
					num = Subcadena(m(j,i),h-e+1,h)
				FinSi
			FinPara
			si mv < ConvertirANumero(num)
				mv = ConvertirANumero(num)
				pr=j
			FinSi
		FinPara
		m(i,7) = Subcadena(m(0,pr),0,8)
		para j = Longitud(m(i,7)) Hasta 10
			m(i,7) = Concatenar(m(i,7)," ")
		FinPara
		m(i,7)=Concatenar((m(i,7)),"/")
	FinPara
	Para j = 0 Hasta 7
		para i = 0 Hasta 6
			Escribir m(i,j) Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo