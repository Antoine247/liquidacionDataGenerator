(ns antoine247.db.desal
  (:require
   [antoine247.db.conn :refer [db-spec]]
   [hugsql.core :as hugsql]
   [tablecloth.api :as tc]
   [tech.v3.datatype.functional :as dfn]
   [next.jdbc :as jdbc] 
   [honey.sql :as sql]))

(defn run-query-desal
  []
(with-open [conn @db-spec]
  (jdbc/execute! conn (sql/format {:select [:*], :from [:fichaaneste_val]}))))
(def DS (tc/dataset (run-query-desal)))
DS


