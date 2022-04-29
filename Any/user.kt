class user(var passportNumber: String, var LastName: String, var age: Int) {

//    override fun toString(): String {
//        return "user [ First name $passportNumber, Last name $LastName, Age $age "
//    }

        override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as user

        if (passportNumber != other.passportNumber) return false

        return true
    }

    override fun hashCode(): Int {
        return passportNumber.hashCode()
    }


}
