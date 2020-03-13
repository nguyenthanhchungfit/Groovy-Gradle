interface FooBar {
    int foo()
    void bar()
}

def impl = { println 'ok'; 123 } as FooBar

assert impl.foo() == 123
impl.bar()

class FooBar2 {
    int foo() { 1 }
    void bar() { println 'bar' }
}

def impl2 = { println 'ok'; 123 } as FooBar2

assert impl2.foo() == 123
impl2.bar()