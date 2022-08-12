(ns go
  (:require 
   [clojure.walk :as walk]
   [clojure.java.io :as io]
   [cheshire.core :as json]))

(defn ! [] 
  (->
   "data.json" 
   io/resource
   slurp
   json/parse-string
   walk/keywordize-keys))