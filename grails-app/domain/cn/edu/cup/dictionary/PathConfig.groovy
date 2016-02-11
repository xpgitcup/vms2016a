package cn.edu.cup.dictionary

class PathConfig {

    String root
    
    static constraints = {
        root()
    }
    
    static mapping = {
        sort root: 'desc'
    }
    
    String toString() {
        return "${root}"
    }
}
