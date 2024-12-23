(ns antoine247.db.conn
  (:require [hikari-cp.core :refer :all]
            [next.jdbc :as jdbc]
            [honey.sql :as sql] 
            [next.jdbc.connection :as connection]
            [clojure.java.io :as io] 
            [aero.core :refer [read-config]])
            (:import (com.zaxxer.hikari HikariDataSource)))



(def db-spec (delay (connection/->pool com.zaxxer.hikari.HikariDataSource
                                       ((read-config (io/resource "config.edn")) :desal))))

                
(comment
  (jdbc/on-connection [conn {:datasource @datasource}]
                      (let [rows (jdbc/execute! conn (sql/format {:select [:*], :from [:fichaaneste_val]}))]
                        (println rows)))

  (with-open [conn {:datasource @datasource}]
    (let [rows (jdbc/execute! conn (sql/format {:select [:*], :from [:fichaaneste_val]}))]
      (println rows)))
  
  (with-open [^HikariDataSource ds @db-spec]
    (jdbc/execute! ds (sql/format {:select [:*], :from [:fichaaneste_val]})))
(jdbc/execute! @db-spec (sql/format {:select [:*], :from [:fichaaneste_val]}))
  (jdbc/on-connection [conn (dbspec :maestros)]
                      (let [rows (jdbc/execute! conn (sql/format {:select [:*], :from [:tbc_nomencla]}))]
                        (println rows)))
(ns-unalias *ns* 'datasource)
  )