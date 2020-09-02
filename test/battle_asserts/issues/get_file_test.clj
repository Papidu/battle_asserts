(ns battle-asserts.issues.get-file-test
  (:require [clojure.test :refer :all]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.clojure-test :as ct]
            [test-helper :as h]
            [battle-asserts.issues.get-file :as issue]))

(ct/defspec spec-solution
  20
  (prop/for-all [v (issue/arguments-generator)]
                (string? (apply issue/solution v))))

(deftest test-solution
  (h/generate-tests issue/test-data issue/solution))