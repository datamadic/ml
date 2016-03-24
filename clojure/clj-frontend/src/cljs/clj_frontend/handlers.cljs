(ns clj-frontend.handlers
    (:require [re-frame.core :as re-frame]
              [clj-frontend.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))
