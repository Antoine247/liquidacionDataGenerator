(ns antoine247.liquidacionDataGenerator
  (:require [scicloj.clay.v2.api :as clay])
  (:gen-class))

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (clay/make! {:source-path "src/antoine247/clay.clj"}))
