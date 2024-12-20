(ns antoine247.db.desal
  (:require
   [antoine247.conn :as conn]
   [hugsql.core :as hugsql]
   [tablecloth.api :as tc]
   [tech.v3.datatype.functional :as dfn]))
(declare todos-convenios)
(hugsql/def-db-fns "antoine247/db/sql/desal.sql")
(def DS (tc/dataset (todos-convenios (conn/dbspec :desal))))
DS
