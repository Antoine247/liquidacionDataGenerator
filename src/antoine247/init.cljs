(ns antoine247.init
  (:require [reagent.dom :as r]))

(defn app
  []
  [:div.container])

(defn ^:export main
  []
  (r/render
   [app]
   (.getElementById js/document "app")))
