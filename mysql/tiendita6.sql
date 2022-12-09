select * from productos;
select * from categoria;
select p.nombre, p.precio, p.existencia, c.nombre from productos as p inner join categoria as c where p.idCategoria= c.id;
select p.nombre, p.precio, p.existencia, t.nombre from productos as p left join temp as t on p.idCategoria=t.id;
select p.nombre, p.precio, p.existencia, t.nombre from productos as p right join temp as t on p.idCategoria=t.id;
select *from proveedores;
select * from categoria union select* from proveedores;
select * from categoria union select nombre, precio from productos;