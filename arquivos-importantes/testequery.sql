		String hql = "SELECT c FROM CabanaOCasa c LEFT JOIN c.Alquiler a ON c.codCabanaOCasa = :a.cabanaOCasa "
				+ "WHERE c.ciudadCabanaOCasa = :ciudadCabanaOCasa AND ((a.fechaInicio = :fechaInicio NOT BETWEEN a.fechaInicio = :fechaInicio AND a.fechaFin = :fechaFin)"
				+ " AND (a.fechaFin = :fechaFin NOT BETWEEN a.fechaInicio = :fechaInicio AND a.fechaFin = :fechaFin))";
                
                
use dbviajefeliz;

SELECT * FROM tb_cabanaocasa AS c left join tb_alquiler AS a ON c.codCabanaOCasa = a.cabanaOCasa WHERE c.ciudadCabanaOCasa = 'Bogotá' AND a.fechaInicio NOT BETWEEN 2018-01-01 AND 2018-01-07;

SELECT * FROM tb_cabanaocasa c INNER join tb_alquiler a ON c.codCabanaOCasa = a.cabanaOCasa WHERE c.ciudadCabanaOCasa = 'Bogotá' AND ((a.fechaInicio NOT BETWEEN '2018-01-01' AND '2018-01-07') AND (a.fechaFin NOT BETWEEN '2018-01-01' AND '2018-01-07') );

select * from tb_alquiler where ((fechaInicio NOT BETWEEN '2018-01-01' AND '2018-01-07') or (fechaFin NOT BETWEEN '2018-01-01' AND '2018-01-07') );