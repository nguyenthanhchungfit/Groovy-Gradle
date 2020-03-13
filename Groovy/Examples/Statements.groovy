x = 1
println "x: $x"

date = new java.util.Date()
println "date: $date"

def (a, b, c) = [10, 20, 'foo']
println "a: $a, b: $b, c: $c"

def (int i, String j) = [10, 'foo']
println "i: $i, j: $j"


// @Immutable
// class Coordinates {
//     double latitude
//     double longitude

//     double getAt(int idx) {
//         if (idx == 0) latitude
//         else if (idx == 1) longitude
//         else throw new Exception("Wrong coordinate index, use 0 or 1")
//     }
// }

// def coordinates = new Coordinates(latitude: 43.23, longitude: 3.67) 

// def (la, lo) = coordinates                                          

// assert la == 43.23                                                  
// assert lo == 3.67