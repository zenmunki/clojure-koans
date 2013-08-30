(defn square [x] (* x x))

(meditations

  "One may know what they seek by knowing what they do not seek"
  (= [true false true]
     (map (complement symbol?) [:a 'b "c"])
  )

  "Praise and 'complement' may help you separate the wheat from the chaff"
  (= [:wheat "wheat" 'wheat]
     (filter (complement nil?) [nil :wheat nil "wheat" nil 'wheat nil])
  )

  "Partial functions allow procrastination"
  (= 20 ((partial * 5) 4))

  "Don't forget: first things first"
  (= [:a :b :c :d] ((partial concat [:a :b]) [:c :d]))

  "Functions can join forces as one 'composed' function"
  (= 25 ((comp square inc) 4))

  "Have a go on a double dec-er"
  (= 8 ((comp dec dec) 10))

  "Be careful about the order in which you mix your functions"
  (= 99 ((comp dec square) 10))

)
