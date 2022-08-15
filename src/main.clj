(ns main
  (:require 
   [clojure.walk :as walk]
   [clojure.java.io :as io]
   [cheshire.core :as json]))

(defn read-json [file]
  (->
   file
   io/resource
   slurp
   json/parse-string
   walk/keywordize-keys))

(defn -main [& _args] 
  (prn (read-json "data.json")))