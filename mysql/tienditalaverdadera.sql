select * from categoria;
select * from productos;
select nombre, precio, existencia, idCategoria from productos where idCategoria<=3;
SeLeCt* from productos;
select min(existencia)as existenca_minima, max(existencia) as existencia_maxima from productos;
select*from productos limit 6,3;
select*from productos order by  existencia asc;



