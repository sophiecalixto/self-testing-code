(ns self-testing-code.core-test
  (:require [clojure.test :refer :all]
            [self-testing-code.core :refer :all]))

"If the purchase amount is up to 100 reais, a delivery fee of 15 dollars must be charged.\nIf it is greater than 100 and less than 200, 5 dollars.\nIf it is above 200, the fee is free."

(deftest delivery-fee-test
  (testing "If the value is less than 100, a delivery fee of 15 dollars will be charged"
    (is (= 15 delivery-fee))))
