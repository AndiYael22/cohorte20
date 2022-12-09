select * from productos;
select * from categoria;
select p.nombre, p.precio, p.existencia, c.nombre from productos as p inner join categoria as c where p.idCategoria= c.id;
