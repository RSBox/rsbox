package io.rsbox.server.engine.model

enum class Gender(val id: Int) {
    MALE(id = 0),
    FEMALE(id = 1),
    // Not possible in real life either so you crash cause jagex reads this as a byte. :) sorry.
    OTHER(id = Int.MAX_VALUE);
}