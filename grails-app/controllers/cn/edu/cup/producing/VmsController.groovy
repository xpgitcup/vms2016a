package cn.edu.cup.producing

import cn.edu.cup.producing.Block

class VmsController {

    def index() { 
        def tt = new Date()
        //----------------------------------------------------------------------
        //程序类型
        def blocks = Block.list()
        //----------------------------------------------------------------------
        //每个类型的个数
        def wells = [:]
        println "${blocks}"
        blocks.each {it->
            println "${it}"
            def nc = it.well.size()
            wells.put(it.name, nc)
        }
        //----------------------------------------------------------------------
        
        //----------------------------------------------------------------------
        model:[wells: wells, date: tt]
    }
}
