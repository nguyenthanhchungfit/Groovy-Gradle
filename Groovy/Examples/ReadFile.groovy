counter = 1
new File('social-member').eachLine('UTF-8'){
    println "Member $counter: $it"
    counter++
}