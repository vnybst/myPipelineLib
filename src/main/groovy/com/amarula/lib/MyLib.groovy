package main.groovy.com.amarula.lib

class MyLib {

    void doSomething(Map options = [:]) {
        sh "echo ${options.from} ${options.to}"
    }

    String getSomething() {
        return "Something"
    }
}
