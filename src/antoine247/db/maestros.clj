(ns antoine247.db.maestros
  (:require [hugsql.core :as hugsql]
            [antoine247.db.conn :as conne]))

(declare nomencladores-anestesia)
(hugsql/def-db-fns "antoine247/db/sql/maestros.sql")



(comment
   (nomencladores-anestesia (conne/dbspec :maestros))
  
  )