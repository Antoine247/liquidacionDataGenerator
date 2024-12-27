(ns antoine247.db.desal
  (:require
   [antoine247.db.conn :refer [db-spec]] 
   [next.jdbc :as jdbc] 
   [honey.sql :as sql]
   [java-time.api :as jt]))

(defn run-query
  [honeyquery]
(with-open [conn (.getConnection @db-spec)]
  (jdbc/execute! conn (sql/format honeyquery))))

(defn convenios
  "query para buscar en tbl_conv_prof"
  [fechadesde]
  (run-query {:select [:*],
              :from [:tbl_conv_prof]
              :where [:>= :conv_fecha_desde fechadesde]}))

(comment
   (convenios (jt/local-date 2024 11 01)))

