(ns clojure-training.aula3)

(defn valor-descontado
  "Retorna o valor bruto com 10% de desconto"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))

(println (valor-descontado 100))



(defn aplica-desconto?
  [valor-bruto]
  (println "chamando funcao")
  (if (> valor-bruto 100)
    true
    false
  ))


(println (aplica-desconto? 1000))

(println (aplica-desconto? 100))


(defn valor-descontado
  "Retorna o valor bruto com 10% de desconto"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

  
(println (valor-descontado 1000))

(println (valor-descontado 100))
