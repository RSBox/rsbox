package io.rsbox.server.engine.model

data class Appearance(val looks: IntArray, val colors: IntArray, var animations: IntArray, val gender: Gender) {

    constructor(looks: IntArray, colors: IntArray, gender: Gender) : this(looks, colors, DEFAULT_ANIMATIONS, gender)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Appearance

        if (!looks.contentEquals(other.looks)) return false
        if (!colors.contentEquals(other.colors)) return false
        if (!animations.contentEquals(other.animations)) return false
        if (gender != other.gender) return false

        return true
    }

    override fun hashCode(): Int {
        var result = looks.contentHashCode()
        result = 31 * result + colors.contentHashCode()
        result = 31 * result + animations.contentHashCode()
        result = 31 * result + gender.hashCode()
        return result
    }

    companion object {

        private val DEFAULT_LOOKS = intArrayOf(18, 26, 36, 0, 33, 42, 10)
        private val DEFAULT_COLORS = intArrayOf(0, 0, 0, 0, 0)
        private val DEFAULT_ANIMATIONS = intArrayOf(808, 823, 819, 820, 821, 822, 824)

        val DEFAULT = Appearance(DEFAULT_LOOKS, DEFAULT_COLORS, DEFAULT_ANIMATIONS, Gender.MALE)

    }
}