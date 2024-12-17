(ns antoine247.db.desal
  (:require
   [antoine247.conn :as conn]
   [hugsql.core :as hugsql]))

(hugsql/def-db-fns "antoine247/db/sql/desal.sql")

(comment
  #_(with-open [conn (nextjdbc/get-connection (conn/dbspec :desal))]
    (nextjdbc/execute!))
  (all-fichaanesteval (conn/dbspec :desal))
  :ref)