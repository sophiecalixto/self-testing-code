(ns self-testing-code.core-test
  (:require [clojure.test :refer :all]
            [self-testing-code.core :refer :all]))

(deftest delivery-fee-test
  (testing "If the value is less than 100, a delivery fee of 15 dollars will be charged"
    (is (= 15 (delivery-fee 1))))
  (testing "If the purchase amount is between 100.01 and 200, return 5 dollars"
    (is (= 5 (delivery-fee 100.01)))))
