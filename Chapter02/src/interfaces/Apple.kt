package interfaces

class Apple : Fruit {
    override val name = "Apple"

    override fun getContainedVitamin(): List<VITAMIN> =
        listOf(VITAMIN.A, VITAMIN.B_ONE, VITAMIN.B_TWO, VITAMIN.B_SIX, VITAMIN.C)

}