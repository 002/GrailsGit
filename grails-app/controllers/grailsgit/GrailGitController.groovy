package grailsgit

class GrailGitController {
    SiteService siteService
    MyCategoryService myCategoryService
    CategoryService categoryService

    def index() {

    }

    def login(){
        try {
            String userName = params.user
            String password = params.password
            if(userName == "" || password == "") {
                throw new IllegalArgumentException("Se deben completar los campos user y password")
            } else {
                loginService(userName, password)
                redirect action: 'sites'
            }
        } catch (InvalidUserException e) {
            e.printStackTrace()
            flash.error = e.getMessage()
            redirect action: 'index'
        } catch (IllegalArgumentException e) {
            e.printStackTrace()
            flash.error = e.getMessage()
            redirect action: 'index'
        }
    }


    def showCategory(Long id) {
        myCategoryService.updateVisits(categoryService.get(id))
        respond categoryService.get(id)
    }

    def showCategories(Long id) {
        respond siteService.get(id)
    }

    def loginService(String userName, String password) {
        def user = User.findByUser(userName)
        if(user == null) {
            throw new InvalidUserException("Usuario incorrecto")
        } else {
            if(user.password != password) {
                throw new InvalidUserException("Contraseña incorrecta")
            }
        }

    }

    def sites(){
        ArrayList<Site> sites = siteService.list()
        sites.each {s -> println s.active}
        [sites: sites]
    }


}
