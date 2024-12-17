(ns antoine247.conn)

(def dbspec
  {:desal {:dbtype "postgresql"
           :port 5432
           :user "desal"
           :dbname "desal"
           :password "desal2016"
           :host "10.200.0.190"}
   :maestros {:dbtype "relativity"
              :dbname "Maestrossc9"
              :classname "relativity.jdbc.Driver"
              :user "ADMIN"
              :password ""
              :host "10.200.0.30"
              :port 1583}})