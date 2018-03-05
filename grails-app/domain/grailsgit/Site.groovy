package grailsgit

class Site {

    String idSite
    String name
    boolean active

    static hasMany = [categories : Category]

    static constraints = {
        name nullable: false, blank: false
        idSite nullable: false, blank: false
        active default: true
    }
}
