## MVI

In this repo, I experimented with implementing MVI architecture pattern.

MVI basically provides a unidirectional flow of data/state. It has a Store which returns a new state based on the current state and some action.


[current state, action] -> (reducer) -> new state

The store serves as a container for the state of a particular screen.

The reducer is in charge of determining the action that was sent and together with the current state, it returns a new state

### Implementing

In this example, I had just a single usecase, implementing login with MVI. The user initiates an action/event.

This event passes two inputs from text fields to a dispatch method from the Store class. This dispatch obtains the reducer and together wit hthe current state returns a new state.



