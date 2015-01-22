(defproject org.clojure/test.check "0.6.2-SNAPSHOT"
  :description "A QuickCheck inspired property-based testing library."
  :url "https://github.com/clojure/test.check"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies []
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :test-paths ["src/test/clojure"]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.6.0"]
                                  ;; just for rng testing
                                  [org.apache.commons/commons-math3 "3.2"]
                                  [criterium "0.4.3"]]}}
  :jvm-opts ^:replace []
  :global-vars {*warn-on-reflection* true}
  :plugins [[codox "0.8.10"]]
  :codox {:defaults {:doc/format :markdown}}
  :aliases {"prngs" ["run" "-m" "user/do-everything"]})
