(ns com.example.views.landing
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as hd]
   [helix.hooks :as hh]
   [refx.alpha :as refx]))

(defnc landing []
  (hd/div
    {:class "bg-gray-100"}
    "Hello, World!"))
