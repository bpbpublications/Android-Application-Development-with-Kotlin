package classes

class StudentV1 {
    constructor(name: String, studentId: Int)
}

class StudentV2(name: String) {
    constructor(name: String, studentId: Int) : this(name)

    constructor(name: String, studentId: Int, courseId: Int) : this(name,studentId)

    fun something()
    {

    }
}
