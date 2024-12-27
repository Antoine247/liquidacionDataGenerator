(ns antoine247.db.maestros
  (:require [aero.core :refer [read-config]]
            [next.jdbc :as jdbc]
            [honey.sql :as sql]
            [clojure.java.io :as io]
            [hyperfiddle.rcf :as test]))
(test/enable!)

(defn run-query
  [honeyquery]
  (with-open [conn (jdbc/get-connection ((read-config (io/resource "config.edn")) :maestros))]
    (jdbc/execute! conn (sql/format honeyquery))))

(defn nomencla 
  "devuelve todos los nomencladores de acuerdo al tipo y grupo"
  []
  (run-query {:select [:Nome_tipo :Nome_Codigo :Nome_Descr],
              :from [[:tbc_Nomencla]]}))

(defn especialidad
  "devuelve un vector de mapas con todas las especialidades"
  []
  (run-query {:select [:Esp-Codi :Esp-Descrip],
              :from [[:tbc-especial]]}))

(defn profesional
  "devuelve un vector de mapas con todos los profesionales"
  []
  (run-query {:select [:*],
              :from [[:tbc-profesional]],
              :where [:or [:!= :Prof20 0] [:!= :Prof28 0]]}))

(defn obras 
  "devuelve todas las obras disponibles"
  []
  (run-query {:select [:Obr_Codigo :Obr_RazonSoc],
              :from [[:tbc-obras]],
              :where [:= :Obr_Estado 0]}))

(comment
  (time (especialidad))
  (count (profesional))
  (obras)
  (time (do
          (nomencla)
          (profesional)
          (obras)
          (especialidad)))
  )

