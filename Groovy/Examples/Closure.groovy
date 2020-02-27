def printWelcome = {
    println "Welcome to Closures!"
}

def print = { name ->
    println name 
}

def formatToLowerCaseClosure = { name ->
    return name.toLowerCase()
}

def greet = {
    return "Hello! ${it}"
}
assert greet("Alex") == "Hello! Alex"

def multiply = { x, y -> 
    return x*y 
}
assert multiply(2, 4) == 8

def calculate = {int x, int y, String operation ->
    def result = 0   
    switch(operation) {
        case "ADD":
            result = x+y
            break
        case "SUB":
            result = x-y
            break
        case "MUL":
            result = x*y
            break
        case "DIV":
            result = x/y
            break
    }
    return result
}


assert calculate(12, 4, "ADD") == 16
assert calculate(43, 8, "DIV") == 5.375

def addAll = { int... args ->
    return args.sum()
}
assert addAll(12, 10, 14) == 36

def volume(Closure areaCalculator, int... dimensions) {
    if(dimensions.size() == 3) {
        return areaCalculator(dimensions[0], dimensions[1]) * dimensions[2]
    } else if(dimensions.size() == 2) {
        return areaCalculator(dimensions[0]) * dimensions[1]
    } else if(dimensions.size() == 1) {
        return areaCalculator(dimensions[0]) * dimensions[0]
    }    
}
// assert volume({ l, b -> return l*b }, 12, 6, 10) == 720
// assert volume({ radius -> return Math.PI*radius*radius/3 }, 5, 10) == Math.PI * 250


def fullName = "Tarly Samson"
def greetStr = "Hello! ${-> fullName}"

assert greetStr == "Hello! Tarly Samson"

def list = [10, 11, 12, 13, 14, true, false, "BUNTHER"]
list.each {
    println it
}
assert [13, 14] == list.findAll{ it instanceof Integer && it >= 13 }

def map = [1:10, 2:30, 4:5]
 
assert [10, 60, 20] == map.collect{it.key * it.value}