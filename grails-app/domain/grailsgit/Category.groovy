package grailsgit

class Category {

    String name
    String urlImage
    int visits

    static belongsTo = [site: Site]

    static constraints = {
        name nullable: false, blank: false
        urlImage nullable: false, blank: false
        visits min: 0
    }
}
