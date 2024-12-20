-- :name all-fichaanesteval :? :*
-- :doc obtiene todos los nomencladores de ficha anestesica
select * from fichaaneste_val
order by id

-- :name todos-convenios :? :*
-- :doc prueba con liquidaciones
select * from tbl_conv_prof tcp where tcp.conv_obra_social = 1820 and conv_profesional = 2274 and conv_especialidad = 19;
