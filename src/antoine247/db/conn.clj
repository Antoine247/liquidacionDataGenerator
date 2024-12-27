(ns antoine247.db.conn
  (:require [hikari-cp.core :refer :all]
            [next.jdbc :as jdbc]
            [honey.sql :as sql]
            [next.jdbc.connection :as connection]
            [clojure.java.io :as io]
            [aero.core :refer [read-config]]))

(def db-spec (delay (connection/->pool com.zaxxer.hikari.HikariDataSource
                                       ((read-config (io/resource "config.edn")) :desal))))
