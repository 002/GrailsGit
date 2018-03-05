package grailsgit

class BootStrap {

    def init = { servletContext ->
        User user = new User()
        user.setUser("user")
        user.setPassword("123")
        user.setName("Juan")
        user.setLastName("Perez")
        user.save()

        Site site = new Site(name: 'Argentina', active: true, siteId: 'MLA')
        site.save()
        site = new Site(name: 'Brasil', active: true, siteId: 'MLB')
        site.save()
        site = new Site(name: 'Bolivia', active: false, siteId: 'MBO')
        site.save()

        Category cat = new Category(name: 'Coso', visits: 0 , siteId: 1)
        cat.save()
        cat = new Category(name: 'Algo', visits: 0 , siteId: 1)
        cat.save()
        cat = new Category(name: 'Otro', visits: 0 , siteId: 2)
        cat.save()
    }
    def destroy = {
    }
}
