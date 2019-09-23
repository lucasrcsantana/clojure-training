(ns clojure-training.aula5)

(def estoque
  { "Mochila" 10,
  "Camiseta" 5})

(println estoque)

(println "Temos" (count estoque) "elementos")
(println "As chaves são:" (keys estoque))
(println "Os valores são:" (vals estoque))

; :mochila Defines mochila as a KEYWORD

(def estoque
  {:mochila 10
  :camiseta 5})

(println estoque)

(println (assoc estoque :cadeira 3))

; assoc ASSOCIATES an element to a collection
(println (update estoque :mochila inc))
(println (update estoque :camiseta #(- %1 4))) ;That one uses Lambda Function
