(ns clojure-training.aula6)

(def pedido {
  :mochila {
    :quantidade 2,
    :preco 80
  }
  :camiseta {
    :quantidade 3,
    :preco 40
  }})

(defn imprime-chave-valor [[chave valor]]
  (println chave "E" valor))

(println (map imprime-chave-valor pedido))

(defn preco-dos-produtos [[chave valor]]
  (* (:quantidade valor) (:preco valor)))


(println (map preco-dos-produtos pedido))

(println (reduce + (map preco-dos-produtos pedido)))

; THREADING LAST
(println
  (->> pedido
    (map preco-dos-produtos ,,,)
    (reduce + ,,,)))
; Uses when the collection is the last argument


