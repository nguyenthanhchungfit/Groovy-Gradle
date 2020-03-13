enum State {
    up,
    down
}

State st = 'up'
assert st == State.up

def val = "up"
State st2 = "${val}"
assert st2 == State.up

State switchState(State st) {
    switch (st) {
        case 'up':
            return State.down // explicit constant
        case 'down':
            return 'up' // implicit coercion for return types
    }
}

assert switchState('up' as State) == State.down
assert switchState(State.down) == State.up