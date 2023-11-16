package main.groovy.com.amarula.lib

class MyLib {

    void doSomething(Map options = [:]) {
        print("Hello ${options.from}")
        print("Hello ${options.to}")

    }

    String getSomething() {
        return "Something"
    }
}
