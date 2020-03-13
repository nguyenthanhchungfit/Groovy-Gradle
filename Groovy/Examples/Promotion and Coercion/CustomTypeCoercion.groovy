

class Polar {
    double r
    double phi

    def asType(Class target) {
    if (Cartesian==target) {
        return new Cartesian(x: r*cos(phi), y: r*sin(phi))
    }
}
}
class Cartesian {
   double x
   double y
}



def sigma = 1E-16
def polar = new Polar(r:1.0,phi:Math.PI/2)
def cartesian = polar as Cartesian
assert abs(cartesian.x-sigma) < sigma
