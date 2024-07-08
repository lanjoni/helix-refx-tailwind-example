(ns com.example.views.landing
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as d]
   [helix.hooks :as hh]
   [refx.alpha :as refx]))

(defnc landing []
  (d/div
    {:class "bg-gray-100"}
    "Hello, World!"))
