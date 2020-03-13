interface Predicate<T> {
    boolean accept(T obj)
    <T> List<T> filter(List<T> source, Predicate<T> predicate) {
        source.findAll { predicate.accept(it) }
    }
}

abstract class Greeter {
    abstract String getName()
    void greet() {
        println "Hello, $name"
    }
}

/* LONG
Predicate filter = { it.contains 'G' } as Predicate
assert filter.accept('Groovy') == true
assert filter.accept('Java') == false

Greeter greeter = { 'Groovy' } as Greeter
greeter.greet()
*/

// SHORTER
Predicate filter = { it.contains 'G' }
assert filter.accept('Groovy') == true
assert filter.accept('Java') == false

Greeter greeter = { 'Groovy' }
greeter.greet()


boolean doFilter(String s) { s.contains('G') }

Predicate filter2 = this.&doFilter
assert filter2.accept('Groovy') == true

Greeter greeter2 = GroovySystem.&getVersion
greeter2.greet()



// Calling a method accepting a SAM type with a closure


assert filter(['Java','Groovy'], { it.contains 'G'} as Predicate) == ['Groovy']

assert filter(['Java','Groovy']) { it.contains 'G'} == ['Groovy']