select * from productos where precio in (5,6,7,8,9,10);
select *from productos where date (fecha_alta) between "2015-01-01" and "2016-07-24";
select *from productos where precio=5+5;
select *from productos where precio=10/2;
select nombre, avg(precio) as promedio_precios from productos where idProducto=1 group by idCategoria;