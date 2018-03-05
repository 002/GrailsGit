package grailsgit

class User {

    String name
    String lastName
    String user
    String password

    static constraints = {
        name blank: false, nullable: false
        lastName blank: false, nullable: false
        user blank: false, nullable: false
        password blank: false, nullable: false
    }
}
