package grailsgit

class Category {

    String name

    static belongsTo = [site: Site]

    static constraints = {
    }
}
