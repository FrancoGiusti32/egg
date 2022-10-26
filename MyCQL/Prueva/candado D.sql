/*Candado D*/
/*Posicion*/
select round(e.Tapones_por_partido) from estadistica e, jugador j
	where e.jugador= j.codigo and e.temporada = "00/01" and j.nombre = "Corey Maggette";

/*Clave*/

select floor(sum(e.Puntos_por_partido)), j.procedencia from estadistica e, jugador j
	where e.jugador= j.codigo and j.procedencia = "argentina"