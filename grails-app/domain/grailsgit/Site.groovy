package grailsgit

class Site {

    String name
    static hasMany = [categories : Category]
    static constraints = {
    }
}
