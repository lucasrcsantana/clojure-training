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

(def pedido {
  :mochila {
    :quantidade 2,
    :preco 80
  }
:camiseta {
  :quantidade 3,
  :preco 40
}})

(println pedido)

(def pedido (assoc pedido :chaveiro {
  :quantidade 1,
  :preco 10
}))

(println pedido)

(println "ELEMENTO MOCHILA" (pedido :mochila))
(println "ELEMENTO CAMISETA" (get pedido :camiseta))



(println "KEYWORD" (:mochila pedido))
; Most common use. Uses the KEYWORD as a function

(println "IMPRIMINDO A QUANTIDADE DA MOCHILHA DO PEDIDO" (:quantidade (:mochila pedido)))

(println (update-in pedido [:mochila :quantidade] inc))
; Update-in enters in the keywords and modifies their values

; THREADING
(println "THREADING" (-> pedido
  :mochila
  :quantidade))
; That's a way that mimics how we call multiple functions together in OO

