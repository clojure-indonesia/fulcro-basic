(ns fulcro-basic.core
  (:require [com.fulcrologic.fulcro.application :as app]
            [com.fulcrologic.fulcro.react.version18 :refer [with-react18]]
            [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]))

(defonce app (-> (app/fulcro-app {})
                 with-react18))

(defsc Root [this props]
  (dom/div "TODO"))

(defn ^:export init
  []
  (app/mount! app Root "app")
  (.log js/console "Loaded"))

(defn ^:export refresh
  []
  (app/mount! app Root "app")
  (comp/refresh-dynamic-queries! app)
  (.log js/console "Hot reload"))
