(ns ccw-plugin-namespace-content-assist
  (:require [ccw.api.content-assist :as api]))

(defn list-namespaces
  [editor text-viewer offset]
  ["clojure.core" "clojure.set" "clojure.repl" "clojure.java.io"])

(api/register-completion-proposal-provider!
  {:label    "Available namespaces"
   :provider #'list-namespaces})

