package testurl

class WidgetFilters {

    def filters = {
        fizzFilter(controller:'fizz*', action:'*') {
            before = {
print "fizz " + new Date()
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
		
		buzzFilter(controller:'buzz*', action:'*') {
			before = {
print "lol buzz" + new Date()
			}
			after = { Map model ->

			}
			afterView = { Exception e ->

			}
		}
    }
}
