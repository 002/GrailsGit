package grailsgit

class BootStrap {

    def init = { servletContext ->
        User user = new User()
        user.setUser("user")
        user.setPassword("123")
        user.setName("Juan")
        user.setLastName("Perez")
        user.save()
    }
    def destroy = {
    }
}
