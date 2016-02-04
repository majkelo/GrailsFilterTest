package testurl

class SecondFilters {

    def filters = {
        fizzSecondFilter(controller:'fizz*', action:'*') {
            before = {
print "2fizz " + new Date()
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
