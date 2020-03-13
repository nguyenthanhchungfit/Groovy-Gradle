def map
map = [
  i: 10,
  hasNext: { map.i > 0 },
  next: { map.i-- },
]
def iter = map as Iterator
while(iter.hasNext()){
    println("a")
    iter.next()
}