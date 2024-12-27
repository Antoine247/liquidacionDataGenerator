(ns antoine247.clay
  (:require [scicloj.clay.v2.api :as clay]
            [antoine247.db.desal :as desal]))


(clay/make! {:source-path "src/antoine247/db/desal.clj"})
