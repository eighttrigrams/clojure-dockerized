(ns main
  (:require
   [clojure.java.io :as io]
   [cheshire.core :as json]))

(defn read-json [file]
  (->
   file
   io/resource
   slurp
   (json/parse-string true)))

(defn -main [& _args] 
  (prn (read-json "data.json")))