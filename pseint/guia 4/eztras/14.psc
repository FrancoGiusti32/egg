Algoritmo sin_titulo
	Definir v,m,j,i,r Como Entero
	Dimension m(3,3), v(3),r(3)
	Para j = 0 Hasta 2
		Para i=0 Hasta 2
			m(j,i)=Aleatorio(1,2)
		FinPara
		v(j)=Aleatorio(1,3)
	FinPara
	Para j=0 Hasta 0
		Para i=0 Hasta 2
			r(i)=m(j,i)*v(j)+((m(j+1,i)*v(j+1))+((m(j+2,i)*v(j+2))))
		FinPara
	FinPara
	//	r(j) = m(i,j)*v(j)+m(i,j+1)*v(j+1)+m(i,j+2)+*(j+2)
	Para i = 0 Hasta 2
		Para j=0 Hasta 2
			Escribir m(j,i),"/" Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir "*"
	Para i=0 Hasta 2
		Escribir v(i)
	FinPara
	Para j=0 Hasta 2
		Escribir r(j)
	FinPara
FinAlgoritmo
