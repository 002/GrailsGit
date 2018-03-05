package grailsgit

import grails.gorm.transactions.Transactional

@Transactional
class MyCategoryService {

    def updateVisits(Category category) {
        category.setVisits(category.getVisits() + 1)
        category.save()
    }
}